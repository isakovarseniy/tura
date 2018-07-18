package sales.analyzer.process.commons;

public class Constants {

	public static String PARAM_FILE_PROCESSING_DATE = "fileProcessingDate";
	public static String PARAM_HASH = "workItem";
	public static String TALEND_JOB_ROOT = "TALEND_JOB_ROOT";
	public static String VALIDATION_JOB = "/monthly_file_processing/Monthly_file_validation/Monthly_file_validation_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static String LOAD_MONTHLY_DATA_JOB = "/monthly_file_processing/Load_Monthly_Data/Load_Monthly_Data_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static String PREPARE_DATA_JOB = "/monthly_file_processing/Prepare_to_rules_run/Prepare_to_rules_run_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
	public static String EXECUTION_ERROR = "Result";

	public static final String CONTAINER_ID = "sales-analyzer-container";

	public static final String CASE_INVESTIGATION_PROCESS = "sales.analyzer.SalesDropInvestigation";
	public static final String SALES_DROP_INVESTIGATION_PROCESS_ID = "sales.analyzer.SalesDropInvestigation";
	public static final String PROCESS_CONSTRUCTOR = "Init";

	public static final String VAR_CITY = "city";
	public static final String VAR_STATE = "state";
	public static final String VAR_PRODUCT = "product";
	public static final String VAR_CASEDETAILS = "caseDetails";

	public static final String VAR_USERNAME = "username";
	public static final String VAR_FIRSTNAME = "firstName";
	public static final String VAR_LASTNAME = "lastName";
	public static final String VAR_EMAIL = "email";

	public static final String QUERY_PROCESS_BY_PK = "getProcessByPK";
	public static final String QUERY_TASK_BY_PK = "getTaskByPK";

	public static final String QUERY_PROCESS_BY_SEARCH_CRITERIA = "getProcessBySearchCriteria";
	public static final String QUERY_TASK_BY_SEARCH_CRITERIA = "getTaskBySearchCriteria";

	public static final String BUILDER_SUFFIX = "BUILDER_SUFFIX";
	public static final String NUMBER_OF_ROWS_SUFFIX = "NUMBER_OF_ROWS_SUFFIX";

	public static final String PARAMETER_PROCESSINSTANCE_ID = "PARAMETER_PROCESSINSTANCE_ID";
	public static final String PARAMETER_TASK_ID = "PARAMETER_TASK_ID";
	public static final String PARAMETER_USER_PREFERENCES = "PARAMETER_USER_PREFERENCES";
	public static final String PARAMETER_CITY = "PARAMETER_CITY";
	public static final String PARAMETER_STATE = "PARAMETER_STATE";
	public static final String PARAMETER_PRODUCT = "PARAMETER_PRODUCT";

}
