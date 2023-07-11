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

package sales.analyzer.api.model.impl;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class ETLTaskInstance {

	@XmlElement(name = "task-id")
	private Long id;
	@XmlElement(name = "task-name")
	private String name;
	@XmlElement(name = "task-subject")
	private String subject;
	@XmlElement(name = "task-description")
	private String description;
	@XmlElement(name = "task-status")
	private String status;
	@XmlElement(name = "task-priority")
	private Integer priority;
	@XmlElement(name = "task-is-skipable")
	private Boolean skipable;
	@XmlElement(name = "task-actual-owner")
	private String actualOwner;
	@XmlElement(name = "task-created-by")
	private String createdBy;
	@XStreamAlias("date")
	@XmlElement(name = "task-created-on")
	private Date createdOn;
	@XStreamAlias("date")
	@XmlElement(name = "task-activation-time")
	private Date activationTime;
	@XmlElement(name = "task-expiration-time")
	private Date expirationTime;
	@XmlElement(name = "task-proc-inst-id")
	private Long processInstanceId;
	@XmlElement(name = "task-proc-def-id")
	private String processId;
	@XmlElement(name = "task-container-id")
	private String containerId;
	@XmlElement(name = "task-parent-id")
	private Long parentId;
	@XmlElement(name = "task-process")
	private ETLProcessInstance process;
	@XmlElement(name = "complete-task")
	private String completeTask;

	
	public String getCompleteTask() {
		return completeTask;
	}
	public void setCompleteTask(String completeTask) {
		this.completeTask = completeTask;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Boolean getSkipable() {
		return skipable;
	}
	public void setSkipable(Boolean skipable) {
		this.skipable = skipable;
	}
	public String getActualOwner() {
		return actualOwner;
	}
	public void setActualOwner(String actualOwner) {
		this.actualOwner = actualOwner;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getActivationTime() {
		return activationTime;
	}
	public void setActivationTime(Date activationTime) {
		this.activationTime = activationTime;
	}
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	public Long getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getContainerId() {
		return containerId;
	}
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public ETLProcessInstance getProcess() {
		return process;
	}
	public void setProcess(ETLProcessInstance process) {
		this.process = process;
	}
	
	
	
	
	
}
