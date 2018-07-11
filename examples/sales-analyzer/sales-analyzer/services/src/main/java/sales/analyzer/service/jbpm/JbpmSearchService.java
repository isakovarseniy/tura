package sales.analyzer.service.jbpm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.QueryServicesClient;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;

import com.octo.java.sql.query.SelectQuery.Order;

import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerRowsNumber;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.process.commons.Constants;

public class JbpmSearchService extends AbstaractSearchService {

	QueryServicesClient queryClient;

	public JbpmSearchService(KieServicesClient client) {
		queryClient = client.getServicesClient(QueryServicesClient.class);

	}

	@Override
	protected Object serviceCall(Object pk, String objectClass) {
		String query = null;
		String mapper = null;
		Class<?> clazz = null;
		HashMap<String, Object> parameters = new HashMap<>();
		if (SalesAnalyzerProcessInstance.class.getName().equals(objectClass)) {
			query = Constants.QUERY_PROCESS_BY_PK;
			mapper = SalesAnalyzerProcessInstance.class.getSimpleName();
			clazz = SalesAnalyzerProcessInstance.class;
			parameters.put(Constants.COLUMN_PROCESSINSTANCE_ID, pk);

		}
		if (SalesAnalyzerTaskInstance.class.getName().equals(objectClass)) {
			query = Constants.QUERY_TASK_BY_PK;
			mapper = SalesAnalyzerTaskInstance.class.getSimpleName();
			clazz = SalesAnalyzerTaskInstance.class;
			parameters.put(Constants.COLUMN_TASK_ID, pk);
		}

		if (query == null || mapper == null || clazz == null) {
			throw new RuntimeException("Unknown object" + objectClass);
		}

		Collection<?> instances = queryClient.query(query, mapper, query + Constants.BUILDER_SUFFIX, parameters, 0, 100,
				clazz);
		if (instances.isEmpty()) {
			return null;
		}
		if (instances.size() > 1) {
			throw new RuntimeException("Primary key is not unique");
		}
		return instances.iterator().next();

	}

	@Override
	protected SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException {

		String query = null;
		String mapper = null;
		Class<?> clazz = null;
		RepositoryHelper helper = new RepositoryHelper(null);

		HashMap<String, Object> parameters = new HashMap<>();
		SearchCriteria sc = helper.extractAndRemove(Constants.VAR_CITY, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.COLUMN_CITY, sc.getValue());
		}

		sc = helper.extractAndRemove(Constants.VAR_STATE, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.COLUMN_STATE, sc.getValue());
		}

		sc = helper.extractAndRemove(Constants.VAR_PRODUCT, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.COLUMN_PRODUCT, sc.getValue());
		}
		if (orderCriteria != null && orderCriteria.size() > 0) {
			parameters.put("q_order_by", orderCriteria.get(0).getName());
			parameters.put("q_ascending", orderCriteria.get(0).getOrder().equals(Order.ASC.name()));
		}

		if (SalesAnalyzerProcessInstance.class.getName().equals(objectClass)) {
			SearchCriteria queryHint = helper.extractAndRemove(Constants.QUERY_KIESERVICE_HINT, searchCriteria);
			if (queryHint == null) {
				query = Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA;
			} else {
				// TODO Need additional configuration
				query = "NA";
			}
			mapper = SalesAnalyzerProcessInstance.class.getSimpleName();
			clazz = SalesAnalyzerProcessInstance.class;

		}
		if (SalesAnalyzerTaskInstance.class.getName().equals(objectClass)) {
			SearchCriteria queryHint = helper.extractAndRemove(Constants.QUERY_KIESERVICE_HINT, searchCriteria);
			if (queryHint == null) {
				query = Constants.QUERY_TASK_BY_SEARCH_CRITERIA;
			} else {
				// TODO Need additional configuration
				query = "NA";
			}
			mapper = SalesAnalyzerTaskInstance.class.getSimpleName();
			clazz = SalesAnalyzerTaskInstance.class;
		}

		if (query == null || mapper == null || clazz == null) {
			throw new RuntimeException("Unknown object" + objectClass);
		}

		Collection<SalesAnalyzerRowsNumber> rows = queryClient.query(query + Constants.NUMBER_OF_ROWS_SUFFIX, mapper,
				query + Constants.BUILDER_SUFFIX, 0, 10, SalesAnalyzerRowsNumber.class);
		if (rows.isEmpty()) {
			return null;
		}
		if (rows.size() > 1) {
			throw new RuntimeException("Wrong value for rows numbers");
		}

		Collection<?> instances = queryClient.query(query, mapper, query + Constants.BUILDER_SUFFIX, startIndex,
				endIndex - startIndex, clazz);

		ArrayList<Object> result = new ArrayList<>();
		result.addAll(instances);

		return new SearchResult(result, rows.iterator().next().getRowsNumber());
	}

}