/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.data.PagerData;
import org.tura.platform.datacontrol.data.PoolData;
import org.tura.platform.datacontrol.data.ShiftControlData;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.datacontrol.pool.Pool;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.repository.core.ObjectControl;

import com.octo.java.sql.query.SelectQuery;

public abstract class Pager<T> extends Pool {

	private int startIndex;
	private int endIndex;
	private int loadStep = PlatformConfig.LOADSTEP;
	
	
	private LazyList<T> entities = new LazyList<>();
	private boolean direction;
	private CommandStack commandStack;
	
	private String id = UUID.randomUUID().toString();

	public abstract T create() throws TuraException;
	public abstract LazyList<T> search() throws TuraException;
	public abstract void delete(Object obj) throws TuraException;
	protected abstract boolean prepareQuery() throws TuraException;
	protected abstract SelectQuery getSelectQuery() throws TuraException;
	protected abstract Object getParent() throws TuraException;
	protected abstract Class<?> getBaseClass();
	protected abstract PostQueryTrigger getPostQueryTrigger();
	protected abstract PreDeleteTrigger getPreDeleteTrigger();
	protected abstract List<SearchCriteria> getSearchCriteria();
	protected abstract DataControl<T> getDataControl();
	
	
	public PagerData getPagerData(){
		if (commandStack.getData(id) == null)
			commandStack.addData(id, new PagerData());
		return (PagerData) commandStack.getData(id);
	}
	

	public void cleanShifter() throws TuraException {
		try {
			for (ShiftControl sh : getPagerData().getShifterHash().values()) {
				cleanPool(sh.getId());
				commandStack.removeData(sh.getId());
			}
			getPagerData().setShifterHash(new HashMap<String, ShiftControl>());
			getPagerData().setShifter(null);
		} catch (QueryParseException | QueryExecutionException e) {
			throw new TuraException(e);
		}
	}

	public void cleanPager() throws TuraException {
        //createShifter should be before cleanind entity  
		createShifter();
		entities = new LazyList<>();
		startIndex = 0;
	}

	public int listSize() throws TuraException {
		if (getShifter() == null)
			return -1;
		return (int) getShifter().getPersistedRowNumber();
	}

	public long actualListSize() throws TuraException {
		if (getShifter() == null)
			return -1;
		return getShifter().getActualRowNumber();
	}

	public T createObject(int index) throws TuraException {
		return createObject(index, true);
	}

	@SuppressWarnings("unchecked")
	public T createObject(int index, boolean managable) throws TuraException {
		try {
			Object obj = create();
			return (T) obj;
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public T getObject(int index) throws TuraException {
		ObjectControl obj = null;

		long beginTimeStamp = getShifter().getShiftControlData().getLastUpdate();
		long endTimeStamp = getPoolData().getNextId();
		boolean removed= false;
		int created;
		try {
			created = beforeShifterGetCreatedObjects(getBaseClass(),beginTimeStamp, endTimeStamp, index);
			do {
				obj = (ObjectControl) get(index);
				if ( obj != null ) {
					removed = isRemoved(getBaseClass(), beginTimeStamp,endTimeStamp, obj.getKey(), index);
				}else {
					removed = false;
				}
				if (obj != null && removed ) {
					created -- ;
				}
			} while (obj != null && removed);
			if (obj != null) {
				obj = (ObjectControl) checkForUpdate(getBaseClass(), beginTimeStamp,
						endTimeStamp, obj, obj.getKey(), index);
			}
			
			getShifter().getShiftControlData().setLastUpdate(endTimeStamp);
			notifyOptional(created,obj);
			return (T) obj;
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	private void notifyOptional(int i, Object obj) throws TuraException {
		if (i == 0) {
			return;
		}
		if (i < 0) {
			getDataControl().notifyLiteners(new RowRemovedEvent(getDataControl(), null));
			getDataControl().notifyChageRecordAll((T)obj);
		}
		
		if (i > 0) {
			getDataControl().notifyLiteners(new RowCreatedEvent(getDataControl(), null));
			getDataControl().notifyChageRecordAll((T)obj);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private T get(int index) throws TuraException {

		try {
			Object obj = null;
			try {
				obj = getShifter().getObject(index);
			} catch (Exception e) {
				throw new TuraException(e);
			}

			if (obj == int.class)
				index = (int) obj;
			if (obj instanceof Integer)
				index = (int) obj;

			if (obj == int.class || obj instanceof Integer) {
				try {
					return getEntity(index);
				} catch (NoSuchMethodException | SecurityException
						| InstantiationException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException e) {
					throw new TuraException(e);
				}
			}

			return (T) obj;

		} catch (IndexOutOfBoundsException e) {
			@SuppressWarnings("rawtypes")
			Stack st = new Stack();
			try {
				st.push(startIndex);
				st.push(entities);

				T obj = queryDS(entities.getStartIndex(), index);
				if (obj == null) {
					entities = (LazyList<T>) st.pop();
					startIndex = (Integer) st.pop();
				}
				return obj;
			} catch (Throwable ee) {
				entities = (LazyList<T>) st.pop();
				startIndex = (Integer) st.pop();

				throw new TuraException(ee);

			}
		}
	}

	public T queryDS(int sindex, int index) throws TuraException {

		if (index < 0){
			return null;
		}
		
		if (entities.getActualRowNumber() != -1 && index >= entities.getActualRowNumber() ){
			return null;
		}
		
		sindex = indexCorrection(sindex,index,entities.getActualRowNumber());
		
		if (!isFrameShiftPossible(sindex, entities.getActualRowNumber())){
			return null;
		}
		calculateShift(sindex);

		try {

			if (!prepareQuery()){
				return null;
			}

			   entities = (LazyList<T>) search();

				getShifter().setActualRowNumber(entities.getActualRowNumber());

			if (entities.getFragmentSize() != 0
					&& index < entities.getActualRowNumber()) {
				return getEntity(index);
			} else {
				return null;
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	private boolean isFrameShiftPossible(int sindex, long maxrow) {
		if (maxrow == -1)
			return true;

		if (direction && sindex + getLoadStep() < maxrow)
			return true;

		if (!direction && sindex - getLoadStep() >= 0)
			return true;

		return false;
	}

	public int indexCorrection(int sindex, int index, long  maxrow){
	
		if (direction &&  sindex  <=  index &&  sindex + getLoadStep()> index ) {
			return sindex;
		}

		
		if (!direction &&  sindex  >=  index &&  sindex - getLoadStep() < index ) {
			return sindex;
		}
		
		if (direction){
			int s = index-getLoadStep();
			if (s+getLoadStep() >= maxrow)
			   return (int) (s - (maxrow - s - getLoadStep()) -1);
			return s;
		}
		
		if (!direction){
			int s = index+1;
			if (s - getLoadStep() < 0)
			  return s + (s - getLoadStep());
			return index+1;
		}
		
		return -1;
	}
	
	private void calculateShift(int sindex) {
		if (entities.size() == -1) {
			startIndex = 0;
			endIndex = startIndex + getLoadStep();
			return;
		}

		if (direction) {
			startIndex = sindex + getLoadStep();
			endIndex = startIndex + getLoadStep();
		} else {
			endIndex = sindex;
			startIndex = sindex - getLoadStep();
		}

	}

	@SuppressWarnings("unchecked")
	private T getEntity(int index) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, TuraException {
		
		ObjectControl t = (ObjectControl) entities.get(index);
		Boolean isProcessed = (Boolean) t.getAttributes().get(Constants.POST_QUERY_TRIGGER_COMPLETED);
		if (isProcessed != null && isProcessed){
			return (T) t;
		}else{
			PostQueryTrigger trigger = getPostQueryTrigger();
			if ( trigger != null){
				trigger.execute(getDataControl(), t);
			}
			t.getAttributes().put(Constants.POST_QUERY_TRIGGER_COMPLETED,true);
			return (T) t;
		}
	}

	public T remove(int i) throws TuraException {
		try {
			T obj = getObject(i);
			
			delete(obj);

			return obj;
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	public int getLoadStep() {
		return loadStep;
	}

	public void setLoadStep(int loadStep) {
		this.loadStep = loadStep;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setScrollDirection(boolean direction) {
		this.direction = direction;
	}

	@Override
	public ShiftControl getShifter() throws TuraException {
		if (getPagerData().getShifter() == null) {
			createShifter();
		}
		return getPagerData().getShifter();
	}

	private void createShifter() throws TuraException {
		try {
			String key = "default";
			if (getParent() != null) {
				ObjectControl obj = (ObjectControl) getParent();
				if (obj != null) {
					key = obj.getKey();
				}
			}else{
				if (prepareQuery()){
					List<SearchCriteria> params =getSearchCriteria();
					if (params != null  && !params.isEmpty()){
						HashCodeBuilder builder = new HashCodeBuilder();
						for (SearchCriteria k: params){
							builder.append(k);
						}
						key = ( new Integer(builder.toHashCode())).toString();
					}
				}
			}
			ShiftControl shifter = getPagerData().getShifterHash().get(key);
			if (shifter == null) {
				shifter = new ShiftControl(getPagerData().getShifterHash(), key){

					@Override
					public ShiftControlData getShiftControlData() {
						if (commandStack.getData(getId()) == null)
							commandStack.addData(getId(), new ShiftControlData());
						return (ShiftControlData) commandStack.getData(getId());
					}
					
				};
				shifter.setActualRowNumber(entities.getActualRowNumber());
			}
			getPagerData().setShifter(shifter);
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	@Override
	protected PoolData getPoolData() {
		if (commandStack.getData(getId()) == null)
			commandStack.addData(getId(), new PoolData());
		return (PoolData) commandStack.getData(getId());
	}

	@Override
	protected void registerForCleaning() throws TuraException  {
		commandStack.registerForCleaningDataControl(getDataControl());
	}


	protected void isolate(){
		getPagerData().setIsolated(true);
	}

	protected boolean isIsolateed(){
		return getPagerData().isIsolated();
	}
	
	protected void flush() throws TuraException {
		
		for (PoolElement element : getPagerData().getIsolatedCommandList()){
			super.addCommand(element);
		}
		getPagerData().setIsolated(false);
		getPagerData().setIsolatedCommandList(new Stack<PoolElement>());
	}
	
	public void addCommand(PoolElement element) throws TuraException {
		if (isIsolateed()){
			getPagerData().getIsolatedCommandList().push(element);
		}else
			super.addCommand(element);
	}

	
	public void putObjectToPool(Object obj, PoolCommand c) throws TuraException {
		ObjectControl pooledObj = (ObjectControl) obj;
		Object o = pooledObj.clone();
		addCommand(c.createdCommand(o, pooledObj.getKey(), getBaseClass(),getShifter().getId()));
	}

	public CommandStack getCommandStack() {
		return commandStack;
	}
	public void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}	
	
}