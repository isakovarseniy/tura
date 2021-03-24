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
        list.add(ETLListOfProcessInstances.class);
        list.add(ETLListOfTaskInstances.class);
        list.add(ETLProcessInstance.class);
        list.add(ETLTaskInstance.class);
        list.add(ETLNodeInstanceLog.class);
        list.add(ETLListOfNodeInstanceLogs.class);
        
    }

}

