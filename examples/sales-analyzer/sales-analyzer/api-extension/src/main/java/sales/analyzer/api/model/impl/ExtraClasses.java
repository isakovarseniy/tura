package sales.analyzer.api.model.impl;

import java.util.HashSet;

import sales.analyzer.user.UserPreferences;

public class ExtraClasses {

	public static HashSet<Class<?>> list = new HashSet<>();

	static {
		list.add(SalesAnalyzerListOfProcessInstances.class);
		list.add(SalesAnalyzerListOfTaskInstances.class);
		list.add(SalesAnalyzerProcessInstance.class);
		list.add(SalesAnalyzerRowsNumber.class);
		list.add(SalesAnalyzerTaskInstance.class);
		list.add(SalesAnalyzerListOfRowsNumber.class);
		list.add(UserPreferences.class);
		list.add(AssignInfo.class);
		list.add(TerminateProcessEvent.class);
		list.add(TaskComletion.class);
	}

}

