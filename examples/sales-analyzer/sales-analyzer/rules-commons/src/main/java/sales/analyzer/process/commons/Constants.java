package sales.analyzer.process.commons;

public class Constants {
	
	public static String PARAM_FILE_PROCESSING_DATE = "fileProcessingDate";
	public static String PARAM_HASH = "workItem";
	public static String TALEND_JOB_ROOT = "/Users/arseniy/MyPrj/git/tura.4.2.2/examples/sales-analyzer/talend-jobs";
	public static String VALIDATION_JOB = "/monthly_file_processing/Monthly_file_validation/Monthly_file_validation_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static String PREPARE_DATA_JOB = "/monthly_file_processing/Prepare_to_rules_run/Prepare_to_rules_run_run.sh --context_param session=${session} --context_param date='yyyy-MM-dd;${data}'";
	public static boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
	public static String  EXECUTION_ERROR = "Result";
	public static final String CONTAINER_ID = "sales-analyzer-container";
	public static final String USERNAME = "kieserver";
	public static final String PASSWORD = "kieserver";
	public static final String CASE_INVESTIGATION_PROCESS = "sales.analyzer.SalesDropInvestigation";
	
}
