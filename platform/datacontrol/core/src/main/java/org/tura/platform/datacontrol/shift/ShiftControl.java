package org.tura.platform.datacontrol.shift;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.shift.rules.AddRulesFactory;
import org.tura.platform.datacontrol.shift.rules.RemoveRuleFactory;
import org.tura.platform.datacontrol.shift.rules.Rule;
import org.tura.platform.datacontrol.shift.rules.UpdateRulesFactory;

public class ShiftControl {

	private Logger logger;

	public ShiftControl() {

	}

	public ShiftControl(Logger logger) {
		this.logger = logger;
	}

	private ArrayList<Element> shiftTracker = new ArrayList<>();

	public Object getObject(int position) throws QueryParseException,
			QueryExecutionException {
		return getObject(position, false);
	}

	public Object getObject(int position, boolean retPosition)
			throws QueryParseException, QueryExecutionException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_UPPER_EQ_ELEMENTS);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(shiftTracker);

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
		shiftTracker = new ArrayList<>();
	}

	@SuppressWarnings("unchecked")
	public void add(int position, Object obj) throws QueryExecutionException,
			QueryParseException, InstantiationException, IllegalAccessException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(shiftTracker);
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
	public void update(int position, Object obj)
			throws QueryExecutionException, QueryParseException,
			InstantiationException, IllegalAccessException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(shiftTracker);
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
	public void remove(int position) throws QueryExecutionException,
			QueryParseException, InstantiationException, IllegalAccessException {
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_FOR_SHIFT);
		query.setVariable("position", new Integer(position));

		QueryResults result = query.execute(shiftTracker);
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

	public ArrayList<Element> getShiftTracker() {
		return shiftTracker;
	}

	public void print(String str) throws QueryParseException,
			QueryExecutionException {

		if (logger == null)
			return;
		Query query = new Query();
		query.parse(str);

		QueryResults result = query.execute(shiftTracker);

		for (Object obj : result.getResults()) {
			Element element = (Element) obj;

			logger.info("actual = " + element.getActualPosition()
					+ " original=" + element.getOriginalPosition() + " shift="
					+ element.getShift() + " type=" + element.getElementType()
					+ " updated=" + element.isModified());
		}

	}

}