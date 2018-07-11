package sales.analyzer.api.model.impl;

import org.jbpm.services.api.query.model.QueryDefinition.Target;
import org.kie.server.api.model.definition.QueryDefinition;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.QueryServicesClient;

import sales.analyzer.process.commons.Constants;


public class SalesAnalyzerConfiguration {

	
	public static String PROCESS_QUERY = "SELECT pl.* , TSK.*, CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES FROM KIESERVER.PROCESSINSTANCELOG pl\n" +
			"INNER JOIN KIESERVER.MAPPEDVARIABLE mv ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" +
			"INNER JOIN KIESERVER.CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n" +
			"INNER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID";
	
	
	public static String TASK_QUERY = "SELECT pl.* , TSK.*, CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES "+
			"FROM KIESERVER.TASK TSK\n" +
			"INNER JOIN KIESERVER.TASKEXTENDEDINFO CD ON CD.TASKID=TSK.ID\n"+
			"INNER JOIN KIESERVER.PROCESSINSTANCELOG pl ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID";
	
	
	
	public static void initProcessBySearchCriteriaQuery(KieServicesClient client, String datasource) {
		QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);

		try {
			queryClient.getQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
			queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
		} catch (Exception e) {
			// Query not found
		}

		QueryDefinition query = new QueryDefinition();
		query.setName(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
		query.setSource(datasource);
		query.setTarget(Target.PROCESS.name());
		query.setExpression(PROCESS_QUERY);

		queryClient.registerQuery(query);
		
	}

	
	public static void initProcessByPrimaryKeyQuery(KieServicesClient client, String datasource) {
		QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);

		try {
			queryClient.getQuery(Constants.QUERY_PROCESS_BY_PK);
			queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_PK);
		} catch (Exception e) {
			// Query not found
		}

		QueryDefinition query = new QueryDefinition();
		query.setName(Constants.QUERY_PROCESS_BY_PK);
		query.setSource(datasource);
		query.setTarget(Target.PROCESS.name());
		query.setExpression(PROCESS_QUERY);

		queryClient.registerQuery(query);
		
	}
	
	
	public static void initTasksByPrimaryKeyQuery(KieServicesClient client, String datasource) {
		QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);

		try {
			queryClient.getQuery(Constants.QUERY_TASK_BY_PK);
			queryClient.unregisterQuery(Constants.QUERY_TASK_BY_PK);
		} catch (Exception e) {
			// Query not found
		}

		QueryDefinition query = new QueryDefinition();
		query.setName(Constants.QUERY_TASK_BY_PK);
		query.setSource(datasource);
		query.setTarget(Target.TASK.name());
		query.setExpression(TASK_QUERY);

		queryClient.registerQuery(query);
		
	}

	
	public static void initTasksBySearchCriteriaQuery(KieServicesClient client, String datasource) {
		QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);

		try {
			queryClient.getQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA);
			queryClient.unregisterQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA);
		} catch (Exception e) {
			// Query not found
		}

		QueryDefinition query = new QueryDefinition();
		query.setName(Constants.QUERY_TASK_BY_SEARCH_CRITERIA);
		query.setSource(datasource);
		query.setTarget(Target.TASK.name());
		query.setExpression(TASK_QUERY);

		queryClient.registerQuery(query);
		
	}
	
	
}

