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

public class ShiftControl {

	private Logger logger;

	public ShiftControl() {

	}

	public ShiftControl(Logger logger) {
		this.logger = logger;
	}

	private ArrayList<Element> shiftTracker = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public void add(int position) throws QueryExecutionException,
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
				rule.execute(this, result.getResults(), position);
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
				rule.execute(this, result.getResults(), position);
				processed = true;
				break;
			}
		}
		if (!processed)
			throw new RuntimeException("Rule not found");
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
					+ element.getShift() + " type=" + element.getElementType());
		}

	}

}
