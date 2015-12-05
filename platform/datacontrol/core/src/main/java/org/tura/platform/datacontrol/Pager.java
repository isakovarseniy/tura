/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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

import static com.octo.java.sql.query.Query.c;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.commons.ConditionConverter;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.data.PagerData;
import org.tura.platform.datacontrol.data.PoolData;
import org.tura.platform.datacontrol.data.ShiftControlData;
import org.tura.platform.datacontrol.pool.Pool;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.datacontrol.shift.ShiftControl;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;
import com.rits.cloning.Cloner;

public class Pager<T> extends Pool {

	private int startIndex;
	private int endIndex;
	private int loadStep;
	private LazyList<T> entities = new LazyList<>();
	private DataControl<T> datacontrol;
	private boolean direction;
	private String id = UUID.randomUUID().toString();

	//	private HashMap<String, ShiftControl> shifterHash = new HashMap<>();
//	private ShiftControl shifter;

	
	public PagerData getPagerData(){
		if (datacontrol.getCommandStack().getData(id) == null)
			datacontrol.getCommandStack().addData(id, new PagerData());
		return (PagerData) datacontrol.getCommandStack().getData(id);
	}
	
	public Pager(DataControl<T> datacontrol) {
		this.datacontrol = datacontrol;
		loadStep = PlatformConfig.LOADSTEP;
	}

	public void cleanShifter() throws TuraException {
		try {
			for (ShiftControl sh : getPagerData().getShifterHash().values()) {
				cleanPool(sh.getId());
				datacontrol.getCommandStack().removeData(sh.getId());
			}
			getPagerData().setShifterHash(new HashMap<String, ShiftControl>());
			getPagerData().setShifter(null);
		} catch (QueryParseException | QueryExecutionException e) {
			throw new TuraException(e);
		}
	}

	public void cleanPager() throws TuraException {
		entities = new LazyList<>();
		startIndex = 0;
		createShifter();
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

	protected boolean prepareQuery() throws TuraException {
		try {

			Cloner cloner = new Cloner();
			datacontrol
					.setQuery(cloner.deepClone(datacontrol.getDefaultQuery()));

			Collection<SearchCriteria> sc = null;

			SelectQuery query = datacontrol.getQuery();
			if (datacontrol.getParent() != null) {
				sc = datacontrol.getParent().getChildSearchCriteria();
				String condition = "AND";
				if (!sc.isEmpty() && query.getWhereClause() == null)
					condition = "WHERE";

				for (SearchCriteria criteria : sc) {

					if (!criteria.getValue().equals(
							Constants.UNDEFINED_PARAMETER)) {
						ConditionConverter.valueOf(condition).getRestriction(
								query, c(criteria.getName()));
						query.op(Operator.valueOf(criteria.getComparator()),
								criteria.getValue());

					} else {
						return false;
					}
					condition = "AND";
				}

			}
			query.toSql(new ExpressionResolver(datacontrol.getElResolver()));
			// restore dafaut querybuilder
			query.toSql(query.getQueryBuilder());

			return true;
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | QueryException e) {
			throw new TuraException(e);
		}
	}

	public DataControl<T> getDataControl() {
		return datacontrol;
	}

	public T createObject(int index) throws TuraException {
		return createObject(index, true);
	}

	@SuppressWarnings("unchecked")
	public T createObject(int index, boolean managable) throws TuraException {

		try {
			datacontrol.getCommandStack().beginTransaction();

			Object obj = datacontrol.getCreateCommand().execute();

			return (T) obj;

		} catch (Exception e) {
			throw new TuraException(e);
		} finally {
			datacontrol.getCommandStack().commitTransaction();
		}
	}

	@SuppressWarnings("unchecked")
	public T getObject(int index) throws TuraException {
		Object obj = null;

		long beginTimeStamp = getShifter().getShiftControlData().getLastUpdate();
		long endTimeStamp = getPoolData().getNextId();
		
		try {
			beforeShifterGetCreatedObjects(datacontrol.getBaseClass(),
					beginTimeStamp, endTimeStamp, index);
			do {
				obj = get(index);
			} while (obj != null
					&& isRemoved(datacontrol.getBaseClass(), beginTimeStamp,
							endTimeStamp, datacontrol.getObjectKey(obj), index));
			if (obj != null) {
				obj = checkForUpdate(datacontrol.getBaseClass(), beginTimeStamp,
						endTimeStamp, obj, datacontrol.getObjectKey(obj), index);
			}

			getShifter().getShiftControlData().setLastUpdate(endTimeStamp);
			return (T) obj;
		} catch (Exception e) {
			throw new TuraException(e);
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

	@SuppressWarnings({ "unchecked" })
	public T queryDS(int sindex, int index) throws TuraException {

		if (index < 0)
			return null;
		
		if (entities.getActualRowNumber() != -1 && index >= entities.getActualRowNumber() )
			return null;
		
		sindex = indexCorrection(sindex,index,entities.getActualRowNumber());
		
		if (!isFrameShiftPossible(sindex, entities.getActualRowNumber()))
			return null;
		calculateShift(sindex);

		try {

			if (!prepareQuery())
				return null;

			try {
				datacontrol.getCommandStack().beginTransaction();

				entities = (LazyList<T>) datacontrol.getSearchCommand()
						.execute();
				getShifter().setActualRowNumber(entities.getActualRowNumber());
				

			}catch(Exception e){
				throw new TuraException(e);
			} finally {
				datacontrol.getCommandStack().commitTransaction();
			}

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

	public String getObjectKey(Object object) throws TuraException {
		return this.getDataControl().getObjectKey(object);
	}

	@SuppressWarnings("unchecked")
	private T getEntity(int index) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, TuraException {
		T t = entities.get(index);
		try {
			t.getClass().getMethod("getWrapper", new Class[] {});
			return (T) t;

		} catch (Exception e) {
			Object el = Util.convertobject(t, this.datacontrol);
			entities.set((index), (T) el);

			if (datacontrol.getPostQueryTrigger() != null)
				datacontrol.getPostQueryTrigger().execute(datacontrol, el);

			return (T) el;
		}
	}

	public T remove(int i) throws TuraException {
		try {
			T obj = getObject(i);

			datacontrol.getDeleteCommand().setObj(obj);

			if (datacontrol.getPreDeleteTrigger() != null)
				datacontrol.getPreDeleteTrigger().execute(
						datacontrol.getDeleteCommand());

			datacontrol.getDeleteCommand().execute();

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
			if (datacontrol.getParent() != null) {
				Object obj = datacontrol.getParent().getMasterCurrentObject();
				if (obj != null) {
					BeanWrapper w = (BeanWrapper) Reflection.call(obj,
							"getWrapper");
					key = w.getDatacontrol().getObjectKey(obj);
				}
			}else{
				if (prepareQuery()){
					Map<String,Object> params = this.datacontrol.getQuery().getParams();
					if (params != null  && !params.isEmpty()){
						HashCodeBuilder builder = new HashCodeBuilder();
						for (String k: params.keySet()){
							builder.append(params.get(k));
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
						if (datacontrol.getCommandStack().getData(getId()) == null)
							datacontrol.getCommandStack().addData(getId(), new ShiftControlData());
						return (ShiftControlData) datacontrol.getCommandStack().getData(getId());
					}
					
				};
				shifter.setActualRowNumber(entities.getActualRowNumber());
				getPagerData().setShifter(shifter);
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	@Override
	protected SelectQuery getSelectQuery() {
		return datacontrol.getQuery();
	}

	@Override
	protected PoolData getPoolData() {
		if (datacontrol.getCommandStack().getData(getId()) == null)
			datacontrol.getCommandStack().addData(getId(), new PoolData());
		return (PoolData) datacontrol.getCommandStack().getData(getId());
	}

	@Override
	protected void registerForCleaning() throws TuraException  {
		datacontrol.getCommandStack().registerForCleaningDataControl(datacontrol);
		
	}

	@Override
	protected DataControl<?> getDatacontrol() throws TuraException {
		return datacontrol;
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

}
