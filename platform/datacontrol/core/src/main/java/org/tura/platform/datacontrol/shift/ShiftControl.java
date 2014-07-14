package org.tura.platform.datacontrol.shift;

import java.util.ArrayList;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;

public class ShiftControl {

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
				rule.execute(this, result.getResults(), position);
				processed = true;
				break;
			}
		}
		if (! processed )
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
				rule.execute(this, result.getResults(), position);
				processed = true;
				break;
			}
		}
		if (! processed )
			throw new RuntimeException("Rule not found");
}

	public ArrayList<Element> getShiftTracker() {
		return shiftTracker;
	}

	public void print(String str, Logger logger) throws QueryParseException,
			QueryExecutionException {

		Query query = new Query();
		query.parse(str);

		QueryResults result = query.execute(shiftTracker);

		logger.info("-----------------------------------------------------------------------");

		for (Object obj : result.getResults()) {
			Element element = (Element) obj;

			logger.info("actual = " + element.getActualPosition()
					+ " original=" + element.getOriginalPosition() + " shift="
					+ element.getShift() + " type=" + element.getElementType());
		}

	}

}
