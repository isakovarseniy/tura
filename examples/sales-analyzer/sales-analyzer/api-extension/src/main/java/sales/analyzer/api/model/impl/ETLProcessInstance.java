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

import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class ETLProcessInstance {


    @XmlElement(name = "process-instance-id")
    private Long id;
    @XmlElement(name = "process-id")
    private String processId;
    @XmlElement(name = "process-name")
    private String processName;
    @XmlElement(name = "process-version")
    private String processVersion;
    @XmlElement(name = "process-instance-state")
    private Integer state;
    @XmlElement(name = "container-id")
    private String containerId;
    @XmlElement(name = "initiator")
    private String initiator;
    @XmlElement(name = "start-date")
    private Date date;
    @XmlElement(name = "process-instance-desc")
    private String processInstanceDescription;
    @XmlElement(name = "correlation-key")
    private String correlationKey;
    @XmlElement(name = "parent-instance-id")
    private Long parentId;
    @XmlElement(name = "file-processing-date")
    private String fileProcessingDate;
    
    public String getFileProcessingDate() {
        return fileProcessingDate;
    }

    public void setFileProcessingDate(String fileProcessingDate) {
        this.fileProcessingDate = fileProcessingDate;
    }

    @XmlElement(name = "process-active-user-tasks")
    private Collection<ETLTaskInstance> activeUserTasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessVersion() {
        return processVersion;
    }

    public void setProcessVersion(String processVersion) {
        this.processVersion = processVersion;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProcessInstanceDescription() {
        return processInstanceDescription;
    }

    public void setProcessInstanceDescription(String processInstanceDescription) {
        this.processInstanceDescription = processInstanceDescription;
    }

    public String getCorrelationKey() {
        return correlationKey;
    }

    public void setCorrelationKey(String correlationKey) {
        this.correlationKey = correlationKey;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Collection<ETLTaskInstance> getActiveUserTasks() {
        return activeUserTasks;
    }

    public void setActiveUserTasks(Collection<ETLTaskInstance> activeUserTasks) {
        this.activeUserTasks = activeUserTasks;
    }

}