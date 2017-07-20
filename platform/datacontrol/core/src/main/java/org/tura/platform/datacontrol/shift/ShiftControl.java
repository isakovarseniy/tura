/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.datacontrol.shift;

import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.data.ShiftControlData;
import org.tura.platform.datacontrol.shift.rules.AddRulesFactory;
import org.tura.platform.datacontrol.shift.rules.RemoveRuleFactory;
import org.tura.platform.datacontrol.shift.rules.Rule;
import org.tura.platform.datacontrol.shift.rules.UpdateRulesFactory;

public abstract class ShiftControl {

	private Logger logger;
	private String key;
	private String id = UUID.randomUUID().toString();

	public abstract ShiftControlData getShiftControlData();

   
	public ShiftControl() {
	}

	public ShiftControl(Logger logger) {
		this.logger = logger;
	}

	public ShiftControl(HashMap<String, ShiftControl> shifterHash, String key) {
		getShiftControlData().setShifterHash(shifterHash) ;
		this.key = key;
	}


	public Object getObject(int position) throws QueryParseException,
			QueryExecutionException {
		return getObject(position, false);
	}

	public Object getObject(int position, boolean retPosition)
			throws QueryParseException, QueryExecutionException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_UPPER_EQ_ELEMENTS);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(getShiftControlData().getShifterArray());

		if (result.getResults().size() == 0)
			return position;

		Element e = (Element) result.getResults().get(0);
		if (e.getActualPosition() == position && e.isModified()) {
			if (retPosition)
				return e.getOriginalPosition();
			else
				return e.getRef();
		}

		if (e.getActualPosition() == position && !e.isModified())
			return e.getOriginalPosition();

		if (e.getActualPosition() != position) {
			int original = position - e.getActualPosition()
					+ e.getOriginalPosition();

			return original;

		}
		return null;

	}

	public void clean() {
		getShiftControlData().getShifterArray().clear();
	}

	public void add(int position, Object obj) throws QueryExecutionException,
			QueryParseException, InstantiationException, IllegalAccessException {

		addOperation(position,obj);
		checkShifterRegistration();
		int addOpr = getShiftControlData().getAddOpr();
		addOpr++;
		getShiftControlData().setAddOpr(addOpr)  ;
	}

	public void update(int position, Object obj)
			throws QueryExecutionException, QueryParseException,
			InstantiationException, IllegalAccessException {

		updateOperation(position, obj);
		checkShifterRegistration();
		
	}

	public void remove(int position) throws QueryExecutionException,
			QueryParseException, InstantiationException, IllegalAccessException {
		removeOperation(position);
		checkShifterRegistration();
		int removeOpr = getShiftControlData().getRemoveOpr();
		removeOpr++;
		getShiftControlData().setRemoveOpr(removeOpr);
	}


	/**
	 * @return the actualRowNumber
	 */
	public long getPersistedRowNumber() {
		return getShiftControlData().getActualRowNumber();
	}	
	
	/**
	 * @return the actualRowNumber
	 */
	public long getActualRowNumber() {
		int addOpr = getShiftControlData().getAddOpr();
		int removeOpr = getShiftControlData().getRemoveOpr();

		if (getShiftControlData().getActualRowNumber() == -1)
			return addOpr-removeOpr;
			
		return getShiftControlData().getActualRowNumber()+addOpr-removeOpr;
	}

	/**
	 * @param actualRowNumber the actualRowNumber to set
	 */
	public void setActualRowNumber(long actualRowNumber) {
		getShiftControlData().setActualRowNumber(actualRowNumber);
	}

	private void checkShifterRegistration(){
		if (getShiftControlData().getShifterHash().get(key) == null){
			getShiftControlData().getShifterHash().put(key, this);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	private void addOperation(int position, Object obj)
			throws QueryExecutionException, QueryParseException,
			InstantiationException, IllegalAccessException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(getShiftControlData().getShifterArray());
		boolean processed = false;
		for (AddRulesFactory ruleDef : AddRulesFactory.values()) {
			Rule rule = ruleDef.getRule();
			if (rule.guard(this, result.getResults(), position)) {
				if (logger != null)
					logger.info("<-----------" + rule.getClass().getName()
							+ "----------->");
				rule.execute(this, result.getResults(), position, obj);
				processed = true;
				break;
			}
		}
		if (!processed)
			throw new RuntimeException("Rule not found");
	}

	@SuppressWarnings("unchecked")
	private void updateOperation(int position, Object obj)
			throws QueryExecutionException, QueryParseException,
			InstantiationException, IllegalAccessException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(getShiftControlData().getShifterArray());
		boolean processed = false;

		for (UpdateRulesFactory ruleDef : UpdateRulesFactory.values()) {
			Rule rule = ruleDef.getRule();
			if (rule.guard(this, result.getResults(), position)) {
				if (logger != null)
					logger.info("<-----------" + rule.getClass().getName()
							+ "----------->");
				rule.execute(this, result.getResults(), position, obj);
				processed = true;
				break;
			}
		}
		if (!processed)
			throw new RuntimeException("Rule not found");
	}

	@SuppressWarnings("unchecked")
	private void removeOperation(int position) throws QueryExecutionException,
			QueryParseException, InstantiationException, IllegalAccessException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(getShiftControlData().getShifterArray());
		boolean processed = false;

		for (RemoveRuleFactory ruleDef : RemoveRuleFactory.values()) {
			Rule rule = ruleDef.getRule();
			if (rule.guard(this, result.getResults(), position)) {
				if (logger != null)
					logger.info("<-----------" + rule.getClass().getName()
							+ "----------->");
				rule.execute(this, result.getResults(), position, null);
				processed = true;
				break;
			}
		}
		if (!processed)
			throw new RuntimeException("Rule not found");
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}


	public void print(String str) throws QueryParseException,
			QueryExecutionException {

		if (logger == null)
			return;
		Query query = new Query();
		query.parse(str);

		QueryResults result = query.execute(getShiftControlData().getShifterArray());

		for (Object obj : result.getResults()) {
			Element element = (Element) obj;

			logger.info("actual = " + element.getActualPosition()
					+ " original=" + element.getOriginalPosition() + " shift="
					+ element.getShift() + " type=" + element.getElementType()
					+ " updated=" + element.isModified());
		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
