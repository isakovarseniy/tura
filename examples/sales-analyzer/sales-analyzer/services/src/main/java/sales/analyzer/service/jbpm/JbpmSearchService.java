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

import sales.analyzer.api.model.impl.ETLProcessInstance;
import sales.analyzer.api.model.impl.ETLListOfNodeInstanceLogs;
import sales.analyzer.api.model.impl.ETLNodeInstanceLog;
import sales.analyzer.api.model.impl.SalesAnalyzerListOfTaskInstances;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstancePK;
import sales.analyzer.api.model.impl.SalesAnalyzerRowsNumber;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.UserPreferencesProvider;

public class JbpmSearchService extends AbstaractSearchService {

    private QueryServicesClient queryClient;
    private UserPreferencesProvider prefRef;

    public JbpmSearchService(KieServicesClient client, UserPreferencesProvider prefRef) {
        queryClient = client.getServicesClient(QueryServicesClient.class);
        this.prefRef = prefRef;
    }

    @Override
    protected Object serviceCall(Object pk, String objectClass) {
        String query = null;
        String mapper = null;
        Class<?> clazz = null;
        HashMap<String, Object> parameters = new HashMap<>();
        if (SalesAnalyzerProcessInstance.class.getName().equals(objectClass)) {
            SalesAnalyzerProcessInstancePK o = (SalesAnalyzerProcessInstancePK) pk;
            query = Constants.QUERY_PROCESS_BY_CASE_ID;
            mapper = SalesAnalyzerProcessInstance.class.getSimpleName();
            clazz = SalesAnalyzerProcessInstance.class;
            parameters.put(Constants.PARAMETER_CASE_ID, o.getCaseId());

        }
        if (ETLProcessInstance.class.getName().equals(objectClass)) {
            Long o = (Long) pk;
            query = Constants.QUERY_PROCESS_BY_PK;
            mapper = ETLProcessInstance.class.getSimpleName();
            clazz = ETLProcessInstance.class;
            parameters.put(Constants.PARAMETER_PROCESSINSTANCE_ID, o);

        }

        if (SalesAnalyzerTaskInstance.class.getName().equals(objectClass)) {
            query = Constants.QUERY_TASK_BY_PK;
            mapper = SalesAnalyzerTaskInstance.class.getSimpleName();
            clazz = SalesAnalyzerListOfTaskInstances.class;
            parameters.put(Constants.PARAMETER_TASK_ID, pk);
        }

        if (ETLNodeInstanceLog.class.getName().equals(objectClass)) {
            query = Constants.QUERY_NODELOG_BY_PK;
            mapper = ETLNodeInstanceLog.class.getSimpleName();
            clazz = ETLListOfNodeInstanceLogs.class;
            parameters.put(Constants.PARAMETER_NODELOG_ID, pk);
        }

        
        if (query == null || mapper == null || clazz == null) {
            throw new RuntimeException("Unknown object" + objectClass);
        }

        parameters.put(Constants.PARAMETER_USER_PREFERENCES, prefRef.getUserPreferences(null));

        Collection<?> instances = queryClient.query(query, mapper, query + Constants.BUILDER_SUFFIX, parameters, 0, 100,
                clazz);

        if (instances == null || instances.isEmpty()) {
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
        SearchCriteria sc = helper.checkSearchParam(Constants.VAR_CITY, searchCriteria);
        if (sc != null) {
            parameters.put(Constants.PARAMETER_CITY, sc.getValue());
        }

        sc = helper.checkSearchParam(Constants.VAR_STATE, searchCriteria);
        if (sc != null) {
            parameters.put(Constants.PARAMETER_STATE, sc.getValue());
        }

        sc = helper.checkSearchParam(Constants.VAR_PRODUCT, searchCriteria);
        if (sc != null) {
            parameters.put(Constants.PARAMETER_PRODUCT, sc.getValue());
        }

        sc = helper.checkSearchParam(Constants.VAR_CASE_ID, searchCriteria);
        if (sc != null) {
            parameters.put(Constants.PARAMETER_CASE_ID, sc.getValue());
        }

        sc = helper.checkSearchParam(Constants.VAR_ACTUAL_OWNER, searchCriteria);
        if (sc != null && SalesAnalyzerTaskInstance.class.getName().equals(objectClass)) {
            parameters.put(Constants.PARAMETER_ACTUAL_OWNER, sc.getValue());
        }

        sc = helper.checkSearchParam(Constants.VAR_PROCESS_INSTANCE_ID, searchCriteria);
        if (sc != null && ETLNodeInstanceLog.class.getName().equals(objectClass)) {
            parameters.put(Constants.PARAMETER_PROCESSINSTANCE_ID, sc.getValue());
        }
        
        
        if (orderCriteria != null && orderCriteria.size() > 0) {
            parameters.put("q_order_by", orderCriteria.get(0).getName());
            parameters.put("q_ascending", orderCriteria.get(0).getOrder().equals(Order.ASC.name()));
        }

        if (SalesAnalyzerProcessInstance.class.getName().equals(objectClass)) {
            query = Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA;
            mapper = SalesAnalyzerProcessInstance.class.getSimpleName();
            clazz = SalesAnalyzerProcessInstance.class;

        }

        if (ETLProcessInstance.class.getName().equals(objectClass)) {
            query = Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA;
            mapper = ETLProcessInstance.class.getSimpleName();
            clazz = ETLProcessInstance.class;

            parameters.clear();
            ArrayList<String> array = new ArrayList<>();
            array.add(Constants.ETL_MONTHLY_FILE_LOAD_PROCESS_ID);
            parameters.put(Constants.PARAMETER_PROCESS_IDS, array);
        }

        if (SalesAnalyzerTaskInstance.class.getName().equals(objectClass)) {
            query = Constants.QUERY_TASK_BY_SEARCH_CRITERIA;
            mapper = SalesAnalyzerTaskInstance.class.getSimpleName();
            clazz = SalesAnalyzerTaskInstance.class;
        }
        
        if (ETLNodeInstanceLog.class.getName().equals(objectClass)) {
            query = Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA;
            mapper = ETLNodeInstanceLog.class.getSimpleName();
            clazz = ETLNodeInstanceLog.class;
        }
        

        if (query == null || mapper == null || clazz == null) {
            throw new RuntimeException("Unknown object" + objectClass);
        }

        parameters.put(Constants.PARAMETER_USER_PREFERENCES, prefRef.getUserPreferences(null));

        Collection<SalesAnalyzerRowsNumber> rows = queryClient.query(query + Constants.NUMBER_OF_ROWS_SUFFIX,
                SalesAnalyzerRowsNumber.class.getSimpleName(), query + Constants.BUILDER_SUFFIX, parameters, 0, 10,
                SalesAnalyzerRowsNumber.class);

        if (rows == null || rows.isEmpty()) {
            return null;
        }
        if (rows.size() > 1) {
            throw new RuntimeException("Wrong value for rows numbers");
        }

        int pagesize = endIndex - startIndex;
        int page = startIndex / pagesize;

        Collection<?> instances = queryClient.query(query, mapper, query + Constants.BUILDER_SUFFIX, parameters, page,
                pagesize, clazz);

        if (instances == null) {
            return new SearchResult(new ArrayList<>(), 0);
        }
        ArrayList<Object> result = new ArrayList<>();
        result.addAll(instances);

        return new SearchResult(result, rows.iterator().next().getRowsNumber());
    }

}

