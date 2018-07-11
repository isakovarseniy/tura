package sales.analyzer.api.model.impl;

import java.util.HashSet;

public class ExtraClasses {

	public static HashSet<Class<?>> list = new HashSet<>();

	static {
		list.add(SalesAnalyzerListOfProcessInstances.class);
		list.add(SalesAnalyzerListOfTaskInstances.class);
		list.add(SalesAnalyzerProcessInstance.class);
		list.add(SalesAnalyzerRowsNumber.class);
		list.add(SalesAnalyzerTaskInstance.class);

	}

}

