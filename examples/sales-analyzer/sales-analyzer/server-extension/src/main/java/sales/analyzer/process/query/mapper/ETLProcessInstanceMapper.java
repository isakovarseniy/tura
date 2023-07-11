/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.process.query.mapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dashbuilder.dataset.DataSet;
import org.jbpm.kie.services.impl.query.mapper.AbstractQueryMapper;
import org.jbpm.services.api.query.QueryResultMapper;

import sales.analyzer.api.model.impl.ETLListOfProcessInstances;
import sales.analyzer.api.model.impl.ETLProcessInstance;
import sales.analyzer.api.model.impl.ETLTaskInstance;

public class ETLProcessInstanceMapper extends AbstractQueryMapper<ETLProcessInstance>
        implements QueryResultMapper<ETLListOfProcessInstances> {

    
    private static final long serialVersionUID = 1L;
    @SuppressWarnings("unused")
    private Map<String, String> variablesMap = new HashMap<String, String>();

    
    public ETLProcessInstanceMapper() {
        super();
    }

    public ETLProcessInstanceMapper(Map<String, String> variablesMap) {
        this.variablesMap = variablesMap;
    }
    
    
    @Override
    public ETLListOfProcessInstances map(Object result) {
        if (result instanceof DataSet) {
            DataSet dataSetResult = (DataSet) result;
            List<ETLProcessInstance> mappedResult = new ArrayList<ETLProcessInstance>();

            Map<Long, ETLProcessInstance> tmp = new HashMap<Long, ETLProcessInstance>();

            if (dataSetResult != null) {

                for (int i = 0; i < dataSetResult.getRowCount(); i++) {
                    Long processInstanceId = getColumnLongValue(dataSetResult, "PROC_"+COLUMN_PROCESSINSTANCEID, i);
                    ETLProcessInstance pi = tmp.get(processInstanceId);
                    if (pi == null) {
                        pi = buildInstance(dataSetResult, i);
                        mappedResult.add(pi);

                        tmp.put(processInstanceId, pi);
                    }
                    ETLTaskInstance ti = buildTaskInstance(dataSetResult, i);
                    if (pi.getActiveUserTasks() == null) {
                        pi.setActiveUserTasks(new ArrayList<>());
                    }
                    pi.getActiveUserTasks().add(ti);
                }
            }
            tmp = null;
            ETLListOfProcessInstances r = new ETLListOfProcessInstances();
            r.setProcesses(mappedResult);
            return r;
        }

        throw new IllegalArgumentException("Unsupported result for mapping " + result);
    }
    
    
    @Override
    protected ETLProcessInstance buildInstance(DataSet dataSetResult, int index) {
        ETLProcessInstance pi = new ETLProcessInstance();
        pi.setId(getColumnLongValue(dataSetResult, "PROC_"+COLUMN_PROCESSINSTANCEID, index));
        pi.setProcessId(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSID, index));
        pi.setProcessName(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSNAME, index));
        pi.setProcessVersion(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSVERSION, index));
        pi.setState(getColumnIntValue(dataSetResult, "PROC_"+COLUMN_STATUS, index));
        pi.setProcessInstanceDescription(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSINSTANCEDESCRIPTION, index));
        pi.setCorrelationKey(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_CORRELATIONKEY, index));
        pi.setParentId(getColumnLongValue(dataSetResult, "PROC_"+COLUMN_PARENTPROCESSINSTANCEID, index));
        String s = getColumnStringValue(dataSetResult, "value", index);
        Date date = new Date();
        if ( s != null) {
            date = new Date(s);
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        pi.setFileProcessingDate( format.format(date));
        

        return pi;
    }
    

    protected ETLTaskInstance buildTaskInstance(DataSet dataSetResult, int index) {
        ETLTaskInstance ti = new ETLTaskInstance();
        ti.setId(getColumnLongValue(dataSetResult, "ID", index));
        ti.setProcessId(getColumnStringValue(dataSetResult, COLUMN_TASK_PROCESSID, index));
        ti.setProcessInstanceId(getColumnLongValue(dataSetResult, COLUMN_TASK_PROCESSINSTANCEID, index));
        ti.setActualOwner(getColumnStringValue(dataSetResult, COLUMN_ACTUALOWNER, index));
        ti.setCreatedBy(getColumnStringValue(dataSetResult, COLUMN_CREATEDBY, index));
        ti.setName(getColumnStringValue(dataSetResult, COLUMN_NAME, index));
        ti.setStatus(getColumnStringValue(dataSetResult, COLUMN_STATUS, index));
        ti.setActualOwner(getColumnStringValue(dataSetResult, "actualowner_id", index));

        return ti;
    }
    
    
    @Override
    public String getName() {
        return ETLProcessInstance.class.getSimpleName();
    }

    @Override
    public Class<?> getType() {
        return ETLProcessInstance.class;
    }

    @Override
    public QueryResultMapper<ETLListOfProcessInstances> forColumnMapping(Map<String, String> columnMapping) {
        return new ETLProcessInstanceMapper();
    }

}