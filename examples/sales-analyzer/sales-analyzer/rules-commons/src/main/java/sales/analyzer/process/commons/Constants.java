/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.process.commons;

import java.util.Arrays;
import java.util.List;

public class Constants {

	public static String PARAM_FILE_PROCESSING_DATE = "fileProcessingDate";
	public static String PARAM_HASH = "workItem";
	public static String TALEND_JOB_ROOT = "TALEND_JOB_ROOT";
	public static String VALIDATION_JOB = "/monthly_file_processing/Monthly_file_validation/Monthly_file_validation_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static String LOAD_MONTHLY_DATA_JOB = "/monthly_file_processing/Load_Monthly_Data/Load_Monthly_Data_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static String PREPARE_DATA_JOB = "/monthly_file_processing/Prepare_to_rules_run/Prepare_to_rules_run_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
	public static String EXECUTION_ERROR = "Result";
	public static final String FILE_ROOT = "FILE_ROOT";
	public static String FILE_IMPORT_DIRECTORY = "FILE_IMPORT_DIRECTORY";

	public static final String CONTAINER_ID = "sales-analyzer-container";

	public static final String CASE_INVESTIGATION_PROCESS = "sales.analyzer.SalesDropInvestigation";
	public static final String ETL_MONTHLY_FILE_LOAD_PROCESS_ID = "sales.analyzer.MonthlyFileLoad";

	public static final String PROCESS_CONSTRUCTOR = "Init";
	public static final String ASSIGN_ACTOR = "Assign actor";

	public static final String VAR_CASE_ID = "case_id";
	public static final String VAR_CASE_ID_ = "caseId";
	public static final String VAR_CITY = "city";
	public static final String VAR_STATE = "state";
	public static final String VAR_PRODUCT = "product";
	public static final String VAR_CASEDETAILS = "caseDetails";
	public static final String VAR_ACTUAL_OWNER = "taskActualOwner";
	public static final String VAR_PROCESS_INSTANCE_ID = "processInstanceId";
	public static final String VAR_PROCESS_ID = "id";

	public static final String VAR_ANALYSTACTOR = "analystActor";
	public static final String VAR_MANAGERACTOR = "managerActor";
	public static final String VAR_ACTORS = "actors";

	public static final String VAR_USERNAME = "username";
	public static final String VAR_FIRSTNAME = "firstName";
	public static final String VAR_LASTNAME = "lastName";
	public static final String VAR_EMAIL = "email";

	public static final String VAR_ROLE_NAME = "name";
	public static final String VAR_ROLE_ID = "id";

	public static final String QUERY_PROCESS_BY_PK = "getProcessByPK";
	public static final String QUERY_TASK_BY_PK = "getTaskByPK";
	public static final String QUERY_ETL_TASK_BY_PK = "getETLTaskByPK";
	public static final String QUERY_PROCESS_BY_CASE_ID = "getProcessByCaseIdPK";
	public static final String QUERY_NODELOG_BY_PK = "getNodeLogByPK";

	public static final String QUERY_PROCESS_BY_SEARCH_CRITERIA = "getProcessBySearchCriteria";
	public static final String QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA = "getETLProcessBySearchCriteria";
	public static final String QUERY_NODELOG_BY_SEARCH_CRITERIA = "getNodeLogBySearchCriteria";
	public static final String QUERY_TASK_BY_SEARCH_CRITERIA = "getTaskBySearchCriteria";

	public static final String BUILDER_SUFFIX = "BUILDER_SUFFIX";
	public static final String NUMBER_OF_ROWS_SUFFIX = "NUMBER_OF_ROWS_SUFFIX";

	public static final String PARAMETER_PROCESSINSTANCE_ID = "PARAMETER_PROCESSINSTANCE_ID";
	public static final String PARAMETER_CASE_ID = "PARAMETER_CASE_ID";
	public static final String PARAMETER_TASK_ID = "PARAMETER_TASK_ID";
	public static final String PARAMETER_USER_PREFERENCES = "PARAMETER_USER_PREFERENCES";
	public static final String PARAMETER_CITY = "PARAMETER_CITY";
	public static final String PARAMETER_STATE = "PARAMETER_STATE";
	public static final String PARAMETER_PRODUCT = "PARAMETER_PRODUCT";
	public static final String PARAMETER_ACTUAL_OWNER = "PARAMETER_ACTUAL_OWNER";
	public static final String PARAMETER_PROCESS_IDS = "PARAMETER_PROCESS_IDS";
	public static final String PARAMETER_FILE_TEMPLATE = "PARAMETER_FILE_TEMPLATE";
	public static final String PARAMETER_NODELOG_ID = "PARAMETER_NODELOG_ID";

	public static final String SIGNAL_ASSIGN = "Signal_assign";
	public static final String SIGNAL_TERMINATE = "Signal_terminate_process";

	public static String STEP1 = "Select date of load";
	public static String STEP2 = "File Loader";
	public static String STEP3 = "Review error";
	public static String STEP4 = "Prepare data for rule processing";
	public static String STEP5 = "Run business rules";
	public static String STEP6 = "Review bussiness rules result";
	public static String STEP7 = "Insert monthly data";
	public static String STEP8 = "Run case generation";
	public static String STEP9 = "Review cease generation";

	private static String[] ht_array = new String[] { STEP1, STEP3, STEP6, STEP9 };
	public static List<String> HT_ARRAY = Arrays.asList(ht_array);

	private static String[] ct_array = new String[] { STEP2, STEP4, STEP5, STEP7, STEP8 };
	public static List<String> CT_ARRAY = Arrays.asList(ct_array);

	private static String [] prc_nodes  =  new String[] {STEP1, STEP2, STEP3, STEP4 , STEP5, STEP6 , STEP7 , STEP8 , STEP9};
	public static List<String> PRC_NODES = Arrays.asList(prc_nodes);
	
	public static String TASK_IN_PROGRESS_STATUS = "InProgress";
	public static String TASK_READY_STATUS = "Ready";

	private static String[] task_status = new String[] { TASK_IN_PROGRESS_STATUS, TASK_READY_STATUS };
	public static List<String> TASK_STATUS = Arrays.asList(task_status);

}
