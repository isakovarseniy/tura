/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.proxy.shift;

import java.io.Serializable;
import java.util.logging.Logger;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.repository.proxy.shift.data.ShiftControlData;
import org.tura.platform.repository.proxy.shift.rules.AddRulesFactory;
import org.tura.platform.repository.proxy.shift.rules.RemoveRuleFactory;
import org.tura.platform.repository.proxy.shift.rules.Rule;
import org.tura.platform.repository.proxy.shift.rules.UpdateRulesFactory;

public abstract class ShiftControl implements Serializable {

	private static final long serialVersionUID = 7504671723554150093L;
	private transient Logger logger;

	public abstract ShiftControlData getShiftControlData() throws Exception;

	public abstract void removeShiftControlData() throws Exception;;

	public ShiftControl() {
	}

	public ShiftControl(Logger logger) {
		this.logger = logger;
	}


	public Object getObject(int position) throws Exception {
		return getObject(position, false);
	}

	public Object getObject(int position, boolean retPosition) throws Exception {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_UPPER_EQ_ELEMENTS);
		query.setVariable("position", Integer.valueOf(position));

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
			int original = position - e.getActualPosition() + e.getOriginalPosition();

			return original;

		}
		return null;

	}
	
	
	public int findPosition( Object obj) throws Exception {
		int position = -1;
		for (  Element e :  getShiftControlData().getShifterArray()) {
			if ( e.getRef() != null && e.getRef().equals(obj)) {
				position = e.getOriginalPosition();
				break;
			}
		}
		return position;
	}

	public void clean() throws Exception {
		getShiftControlData().getShifterArray().clear();
	}

	public void add(int position, Object obj) throws Exception {

		addOperation(position, obj);
		int addOpr = getShiftControlData().getAddOpr();
		addOpr++;
		getShiftControlData().setAddOpr(addOpr);
	}

	public void update(int position, Object obj) throws Exception {

		updateOperation(position, obj);

	}

	public void remove(int position) throws Exception {
		removeOperation(position);
		int removeOpr = getShiftControlData().getRemoveOpr();
		removeOpr++;
		getShiftControlData().setRemoveOpr(removeOpr);
	}

	/**
	 * @return the actualRowNumber
	 * @throws Exception 
	 */
	public long getPersistedRowNumber() throws Exception {
		return getShiftControlData().getActualRowNumber();
	}

	/**
	 * @return the actualRowNumber
	 * @throws Exception 
	 */
	public long getActualRowNumber() throws Exception {
		int addOpr = getShiftControlData().getAddOpr();
		int removeOpr = getShiftControlData().getRemoveOpr();

		if (getShiftControlData().getActualRowNumber() == -1)
			return -1;

		return getShiftControlData().getActualRowNumber() + addOpr - removeOpr;
	}

	/**
	 * @param actualRowNumber the actualRowNumber to set
	 * @throws Exception 
	 */
	public void setActualRowNumber(long actualRowNumber) throws Exception {
		getShiftControlData().setActualRowNumber(actualRowNumber);
	}


	@SuppressWarnings("unchecked")
	private void addOperation(int position, Object obj) throws Exception {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", Integer.valueOf(position));

		QueryResults result = query.execute(getShiftControlData().getShifterArray());
		boolean processed = false;
		for (AddRulesFactory ruleDef : AddRulesFactory.values()) {
			Rule rule = ruleDef.getRule();
			if (rule.guard(this, result.getResults(), position)) {
				if (logger != null)
					logger.info("<-----------" + rule.getClass().getName() + "----------->");
				rule.execute(this, result.getResults(), position, obj);
				processed = true;
				break;
			}
		}
		if (!processed)
			throw new RuntimeException("Rule not found");
	}

	@SuppressWarnings("unchecked")
	private void updateOperation(int position, Object obj) throws Exception {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", Integer.valueOf(position));

		QueryResults result = query.execute(getShiftControlData().getShifterArray());
		boolean processed = false;

		for (UpdateRulesFactory ruleDef : UpdateRulesFactory.values()) {
			Rule rule = ruleDef.getRule();
			if (rule.guard(this, result.getResults(), position)) {
				if (logger != null)
					logger.info("<-----------" + rule.getClass().getName() + "----------->");
				rule.execute(this, result.getResults(), position, obj);
				processed = true;
				break;
			}
		}
		if (!processed)
			throw new RuntimeException("Rule not found");
	}

	@SuppressWarnings("unchecked")
	private void removeOperation(int position) throws Exception {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", Integer.valueOf(position));

		QueryResults result = query.execute(getShiftControlData().getShifterArray());
		boolean processed = false;

		for (RemoveRuleFactory ruleDef : RemoveRuleFactory.values()) {
			Rule rule = ruleDef.getRule();
			if (rule.guard(this, result.getResults(), position)) {
				if (logger != null)
					logger.info("<-----------" + rule.getClass().getName() + "----------->");
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

	public void print(String str) throws Exception {

		if (logger == null)
			return;
		Query query = new Query();
		query.parse(str);

		QueryResults result = query.execute(getShiftControlData().getShifterArray());

		for (Object obj : result.getResults()) {
			Element element = (Element) obj;

			logger.info("actual = " + element.getActualPosition() + " original=" + element.getOriginalPosition()
					+ " shift=" + element.getShift() + " type=" + element.getElementType() + " updated="
					+ element.isModified());
		}

	}

}