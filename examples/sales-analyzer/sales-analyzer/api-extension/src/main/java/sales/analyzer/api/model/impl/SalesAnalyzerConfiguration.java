package sales.analyzer.api.model.impl;

import org.jbpm.services.api.query.model.QueryDefinition.Target;
import org.kie.server.api.model.definition.QueryDefinition;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.QueryServicesClient;

import sales.analyzer.process.commons.Constants;


public class SalesAnalyzerConfiguration {

	
	private static String PROCESS_QUERY = "SELECT \n"+
   "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID,pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,pl.STATUS PROC_STATUS,\n" +	
			"TSK.*, CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES FROM KIESERVER.PROCESSINSTANCELOG pl\n" +
			"INNER JOIN KIESERVER.MAPPEDVARIABLE mv ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" +
			"INNER JOIN KIESERVER.CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n" +
			"INNER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID";
	
	
	private static String PROCESS_NUMBER_OF_ROWS_QUERY = "SELECT DISTINCT( pl.ID ) PROC_ID, CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES FROM KIESERVER.PROCESSINSTANCELOG pl\n" +
			"INNER JOIN KIESERVER.MAPPEDVARIABLE mv ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" +
			"INNER JOIN KIESERVER.CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n" +
			"INNER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID";

	
	
	private static String TASK_QUERY = "SELECT \n"+
   "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID,pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,pl.STATUS PROC_STATUS,\n" +	
			"TSK.*, CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES "+
			"FROM KIESERVER.TASK TSK\n" +
			"INNER JOIN KIESERVER.TASKEXTENDEDINFO CD ON CD.TASKID=TSK.ID\n"+
			"INNER JOIN KIESERVER.PROCESSINSTANCELOG pl ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID";
	
	private static String TASK_NUMBER_OF_ROWS_QUERY = "SELECT DISTINCT( pl.ID ) PROC_ID, CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES \n"+
			"FROM KIESERVER.TASK TSK\n" +
			"INNER JOIN KIESERVER.TASKEXTENDEDINFO CD ON CD.TASKID=TSK.ID\n"+
			"INNER JOIN KIESERVER.PROCESSINSTANCELOG pl ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID";
	
	
	public static void init(KieServicesClient client, String datasource) {
		QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);
		initProcessBySearchCriteriaQuery(queryClient,datasource);
		initProcessByPrimaryKeyQuery(queryClient,datasource);
		initTasksByPrimaryKeyQuery(queryClient,datasource);
		initTasksBySearchCriteriaQuery(queryClient, datasource);
		initTasksNumberOfRowsBySearchCriteriaQuery(queryClient,datasource);
		initProcessessBySearchCriteriaQuery(queryClient, datasource);
		initProcessessNumberOfRowsBySearchCriteriaQuery(queryClient, datasource);
	}
	
	
	private static void initProcessBySearchCriteriaQuery(QueryServicesClient queryClient, String datasource) {

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

	
	private static void initProcessByPrimaryKeyQuery(QueryServicesClient queryClient, String datasource) {

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
	
	
	private static void initTasksByPrimaryKeyQuery(QueryServicesClient queryClient, String datasource) {

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

	
	private static void initTasksBySearchCriteriaQuery(QueryServicesClient queryClient, String datasource) {

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
	

	private static void initTasksNumberOfRowsBySearchCriteriaQuery(QueryServicesClient queryClient, String datasource) {

		try {
			queryClient.getQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
			queryClient.unregisterQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
		} catch (Exception e) {
			// Query not found
		}

		QueryDefinition query = new QueryDefinition();
		query.setName(Constants.QUERY_TASK_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
		query.setSource(datasource);
		query.setTarget(Target.TASK.name());
		query.setExpression(TASK_NUMBER_OF_ROWS_QUERY);

		queryClient.registerQuery(query);
		
	}
	
	
	private static void initProcessessBySearchCriteriaQuery(QueryServicesClient queryClient, String datasource) {

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
	

	private static void initProcessessNumberOfRowsBySearchCriteriaQuery(QueryServicesClient queryClient, String datasource) {

		try {
			queryClient.getQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
			queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
		} catch (Exception e) {
			// Query not found
		}

		QueryDefinition query = new QueryDefinition();
		query.setName(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
		query.setSource(datasource);
		query.setTarget(Target.PROCESS.name());
		query.setExpression(PROCESS_NUMBER_OF_ROWS_QUERY);

		queryClient.registerQuery(query);
		
	}
	
	
	
}

