/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.kie.server.services.query;


import org.dashbuilder.dataset.def.SQLDataSetDef;
import org.jbpm.kie.services.impl.query.QueryServiceImpl;
import org.jbpm.kie.services.impl.query.SqlQueryDefinition;
import org.jbpm.services.api.query.QueryService;

import org.kie.server.api.model.definition.QueryDefinition;

import org.kie.server.services.api.KieServerRegistry;

import sales.analyzer.process.commons.Constants;


public class JbpmConfiguration {

    
    private static String PROCESS_QUERY = "SELECT \n"+
 "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID,pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,pl.STATUS PROC_STATUS,\n" +    
            "TSK.*, \n"+
            "CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES , CD.CASEID AS CASE_ID, CD.ANALYSTACTOR AS ANALYSTACTOR,  CD.MANAGERACTOR  AS MANAGERACTOR FROM KIESERVER.PROCESSINSTANCELOG pl\n" +
            "INNER JOIN KIESERVER.MAPPEDVARIABLE mv ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" +
            "INNER JOIN KIESERVER.CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n" +
            "INNER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID\n"+
//            "INNER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID\n" +
//            "INNER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID\n"+
            "WHERE \n" +
            "TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0\n"
            ;
    
    
    private static String ETL_PROCESS_QUERY = "SELECT \n"+
             "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID \n"+
             ",pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,\n"+
             "pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,\n"+
             "pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,\n" +
             "TSK.* , ORG.ID ORG_ID ,\n"+
             "VAR.VARIABLEID, VAR.VALUE, \n"+
             "INFO.STATE PROC_STATUS \n" +
            "FROM KIESERVER.PROCESSINSTANCELOG pl \n"+ 
            "INNER JOIN KIESERVER.PROCESSINSTANCEINFO INFO ON INFO.INSTANCEID = PL.ID \n"+
            "FULL OUTER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID \n"+
            "FULL OUTER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID \n" +
            "FULL OUTER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID \n"+
            "FULL OUTER JOIN KIESERVER.VARIABLEINSTANCELOG VAR ON VAR.PROCESSINSTANCEID = PL.ID  \n"+
            "WHERE  \n"+
//            "(TSK.STATUS IS NULL OR (TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0 )) \n"+
            "( VAR.VARIABLEID IS NULL OR  VAR.VARIABLEID = 'fileProcessingDate') AND INFO.STATE IS NOT NULL";
                        
    private static String ETL_PROCESS_NUMBER_OF_ROWS_QUERY = "SELECT DISTINCT( pl.ID ) DIST_PROC_ID, \n"+
             "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID \n"+
             ",pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,\n"+
             "pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,\n"+
             "pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,\n" +
             "TSK.* , ORG.ID ORG_ID ,\n"+
             "VAR.VARIABLEID, VAR.VALUE, \n"+
             "INFO.STATE PROC_STATUS \n" +
            "FROM KIESERVER.PROCESSINSTANCELOG pl \n"+ 
            "INNER JOIN KIESERVER.PROCESSINSTANCEINFO INFO ON INFO.INSTANCEID = PL.ID \n"+
            "FULL OUTER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID \n"+
            "FULL OUTER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID \n" +
            "FULL OUTER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID \n"+
            "FULL OUTER JOIN KIESERVER.VARIABLEINSTANCELOG VAR ON VAR.PROCESSINSTANCEID = PL.ID  \n"+
            "WHERE  \n"+
  //          "(TSK.STATUS IS NULL OR (TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0 )) \n"+
            "( VAR.VARIABLEID IS NULL OR  VAR.VARIABLEID = 'fileProcessingDate') AND INFO.STATE IS NOT NULL";
                        
    
    private static String PROCESS_QUERY_BY_CASEID = "SELECT \n"+
 "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID,pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,pl.STATUS PROC_STATUS,\n" +    
             "TSK.* ,\n"+
            "CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES , CD.CASEID AS CASE_ID, CD.ANALYSTACTOR AS ANALYSTACTOR , CD.MANAGERACTOR AS MANAGERACTOR  FROM KIESERVER.CASEDETAILS CD \n" +
            "INNER JOIN KIESERVER.MAPPEDVARIABLE MV ON MV.VARIABLEID=CD.ID\n" +
            "INNER JOIN KIESERVER.PROCESSINSTANCELOG pl ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" +
            "INNER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID\n"+
//            "INNER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID\n" +
//            "INNER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID\n"+
            "WHERE \n" +
            "TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0\n"
            ;
    
    
    private static String PROCESS_NUMBER_OF_ROWS_QUERY = "SELECT DISTINCT( pl.ID ) PROC_ID, \n"+
            "TSK.* ,\n" +
            "CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES , CD.CASEID AS CASE_ID , CD.ANALYSTACTOR AS ANALYSTACTOR , CD.MANAGERACTOR AS MANAGERACTOR   FROM KIESERVER.PROCESSINSTANCELOG pl\n" +
            "INNER JOIN KIESERVER.MAPPEDVARIABLE mv ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" +
            "INNER JOIN KIESERVER.CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n" +
            "INNER JOIN KIESERVER.TASK TSK ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID\n"+
//            "INNER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID\n" +
//            "INNER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID\n"+
            "WHERE \n" +
            "TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0\n"
            ;

    
    
    private static String TASK_QUERY = "SELECT \n"+
 "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID,pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,pl.STATUS PROC_STATUS,\n" +    
             "TSK.*, \n"+
             "CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES ,CD.CASEID AS CASE_ID , CD.ANALYSTACTOR AS ANALYSTACTOR , CD.MANAGERACTOR AS MANAGERACTOR   "+
            "FROM KIESERVER.TASK TSK\n" +
            "INNER JOIN KIESERVER.TASKEXTENDEDINFO CD ON CD.TASKID=TSK.ID\n"+
            "INNER JOIN KIESERVER.PROCESSINSTANCELOG pl ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID\n"+
//            "INNER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID\n" +
//            "INNER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID\n"+
            "WHERE \n" +
            "TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0  ORDER BY PROC_PROCESSINSTANCEID\n"
            ;
    
    private static String TASK_NUMBER_OF_ROWS_QUERY = "SELECT DISTINCT( TSK.ID ) TSK_ID , CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES, \n"+
            "TSK.* ,\n"+
            "CD.CASEID AS CASE_ID\n" +
            "FROM KIESERVER.TASK TSK\n" +
            "INNER JOIN KIESERVER.TASKEXTENDEDINFO CD ON CD.TASKID=TSK.ID\n"+
            "INNER JOIN KIESERVER.PROCESSINSTANCELOG pl ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID\n"+
//            "INNER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID\n" +
//            "INNER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID\n"+
            "WHERE \n" +
            "TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0\n"
            ;

    private static String ETL_TASK_QUERY = "SELECT \n"+
 "pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID,pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,pl.STATUS PROC_STATUS,\n" +    
             "TSK.* \n"+
            "FROM KIESERVER.TASK TSK\n" +
            "INNER JOIN KIESERVER.PROCESSINSTANCELOG pl ON TSK.PROCESSINSTANCEID = pl.PROCESSINSTANCEID\n"+
//            "INNER JOIN KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS PP ON PP.TASK_ID = TSK.ID\n" +
//            "INNER JOIN KIESERVER.ORGANIZATIONALENTITY ORG ON PP.ENTITY_ID = ORG.ID\n"+
            "WHERE \n" +
            "TSK.STATUS IN ('Created', 'Ready', 'Reserved', 'InProgress', 'Suspended') AND TSK.archived = 0  ORDER BY PROC_PROCESSINSTANCEID\n"
            ;
    
    
    private static String NODELOG_QUERY = "SELECT * FROM KIESERVER.NODEINSTANCELOG ORDER BY ID DESC";
    
    
    
    public static void init(QueryService queryClient, String datasource,KieServerRegistry registry) {
        initProcessBySearchCriteriaQuery(queryClient,datasource,registry);
        initProcessByPrimaryKeyQuery(queryClient,datasource,registry);
        initTasksByPrimaryKeyQuery(queryClient,datasource,registry);
        initTasksBySearchCriteriaQuery(queryClient, datasource,registry);
        initTasksNumberOfRowsBySearchCriteriaQuery(queryClient,datasource,registry);
        initProcessessBySearchCriteriaQuery(queryClient, datasource,registry);
        initProcessessNumberOfRowsBySearchCriteriaQuery(queryClient, datasource,registry);
        initProcessByPrimaryKeyCaseIdQuery(queryClient, datasource,registry);
        initETLProcessBySearchCriteriaQuery(queryClient, datasource,registry);
        initETLProcessessNumberOfRowsBySearchCriteriaQuery(queryClient, datasource,registry);
        initETLNodeLogBySearchCriteriaQuery(queryClient, datasource,registry);
        initETLNodeLogNumberOfRowsBySearchCriteriaQuery(queryClient, datasource,registry);
        initETLNodeLogByPrimaryKeyQuery(queryClient, datasource,registry);
        
        initETLTasksByPrimaryKeyQuery(queryClient, datasource,registry);

    }
    
    
    
    private static void initETLNodeLogNumberOfRowsBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {
        try {
            queryClient.getQuery(Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
            queryClient.unregisterQuery(Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        query.setSource(datasource);
        query.setTarget("CUSTOM");
        query.setExpression(NODELOG_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        
    }

    private static void initETLNodeLogBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {
        try {
            queryClient.getQuery(Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA);
            queryClient.unregisterQuery(Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA);
        query.setSource(datasource);
        query.setTarget("CUSTOM");
        query.setExpression(NODELOG_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        
    }

    private static void initETLNodeLogByPrimaryKeyQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_NODELOG_BY_PK);
            queryClient.unregisterQuery(Constants.QUERY_NODELOG_BY_PK);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_NODELOG_BY_PK);
        query.setSource(datasource);
        query.setTarget("CUSTOM");
        query.setExpression(NODELOG_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        
    }
    
    
    
    private static void initETLProcessBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA);
            queryClient.unregisterQuery(Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA);
        query.setSource(datasource);
        query.setTarget("PROCESS");
        query.setExpression(ETL_PROCESS_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        
    }

    private static void initETLProcessessNumberOfRowsBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
            queryClient.unregisterQuery(Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        query.setSource(datasource);
        query.setTarget("PROCESS");
        query.setExpression(ETL_PROCESS_NUMBER_OF_ROWS_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        
    }
    
    
    private static void initProcessBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
            queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
        query.setSource(datasource);
        query.setTarget("PROCESS");
        query.setExpression(PROCESS_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);
    }

    
    private static void initProcessByPrimaryKeyQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_PROCESS_BY_PK);
            queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_PK);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_PROCESS_BY_PK);
        query.setSource(datasource);
        query.setTarget("PROCESS");
        query.setExpression(PROCESS_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }
    
    
    private static void initProcessByPrimaryKeyCaseIdQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_PROCESS_BY_CASE_ID);
            queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_CASE_ID);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_PROCESS_BY_CASE_ID);
        query.setSource(datasource);
        query.setTarget("PROCESS");
        query.setExpression(PROCESS_QUERY_BY_CASEID);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }

    
    
    
    private static void initTasksByPrimaryKeyQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_TASK_BY_PK);
            queryClient.unregisterQuery(Constants.QUERY_TASK_BY_PK);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_TASK_BY_PK);
        query.setSource(datasource);
        query.setTarget("TASK");
        query.setExpression(TASK_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }

    
    private static void initTasksBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA);
            queryClient.unregisterQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_TASK_BY_SEARCH_CRITERIA);
        query.setSource(datasource);
        query.setTarget("TASK");
        query.setExpression(TASK_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }
    

    private static void initTasksNumberOfRowsBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
            queryClient.unregisterQuery(Constants.QUERY_TASK_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_TASK_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        query.setSource(datasource);
        query.setTarget("TASK");
        query.setExpression(TASK_NUMBER_OF_ROWS_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }
    
    private static void initETLTasksByPrimaryKeyQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_ETL_TASK_BY_PK);
            queryClient.unregisterQuery(Constants.QUERY_ETL_TASK_BY_PK);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_ETL_TASK_BY_PK);
        query.setSource(datasource);
        query.setTarget("TASK");
        query.setExpression(ETL_TASK_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }

    
    
    private static void initProcessessBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
            queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA);
        query.setSource(datasource);
        query.setTarget("PROCESS");
        query.setExpression(PROCESS_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }
    

    private static void initProcessessNumberOfRowsBySearchCriteriaQuery(QueryService queryClient, String datasource,KieServerRegistry registry) {

        try {
            queryClient.getQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
            queryClient.unregisterQuery(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        } catch (Exception e) {
            // Query not found
        }

        QueryDefinition query = new QueryDefinition();
        query.setName(Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA+Constants.NUMBER_OF_ROWS_SUFFIX);
        query.setSource(datasource);
        query.setTarget("PROCESS");
        query.setExpression(PROCESS_NUMBER_OF_ROWS_QUERY);

        SqlQueryDefinition actualDefinition = build(registry, query);;
        queryClient.registerQuery(actualDefinition);
        enableEstimation((QueryServiceImpl) queryClient,query);

    }
    
    
    protected static SqlQueryDefinition build(KieServerRegistry context, QueryDefinition queryDefinition) {
        SqlQueryDefinition actualDefinition = new SqlQueryDefinition(queryDefinition.getName(), queryDefinition.getSource());
        actualDefinition.setExpression(queryDefinition.getExpression());
        actualDefinition.setTarget(org.jbpm.services.api.query.model.QueryDefinition.Target.valueOf(queryDefinition.getTarget()));

        return actualDefinition;
    }    
    
    
    private static void enableEstimation(QueryServiceImpl queryService, QueryDefinition query) {
    	SQLDataSetDef setDef = 	(SQLDataSetDef) queryService.getDataSetDefRegistry().getDataSetDef(query.getName());
    	setDef.setEstimateSize(true);
    }
    
}