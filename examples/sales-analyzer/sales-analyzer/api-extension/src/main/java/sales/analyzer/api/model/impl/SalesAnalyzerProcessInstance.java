package sales.analyzer.api.model.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class SalesAnalyzerProcessInstance {

	@XmlElement(name = "states")
	private Integer states;
	@XmlElement(name = "city")
	private Integer city;
	@XmlElement(name = "product")
	private String product;
	@XmlElement(name = "case-id")
	private String caseId;
	@XmlElement(name = "analyst-actor")
	private String analystActor;
	@XmlElement(name = "manager-actor")
	private String managerActor;
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

	@XmlElement(name = "active-user-tasks")
	private Collection<SalesAnalyzerTaskInstance> activeUserTasks;

	@XmlElement(name = "process-instance-variables")
	private Map<String, Object> variables;

	
	
	public static Builder builder() {
		return new Builder();
	}
	
	public String getAnalystActor() {
		return analystActor;
	}

	public void setAnalystActor(String analystActor) {
		this.analystActor = analystActor;
	}

	public String getManagerActor() {
		return managerActor;
	}

	public void setManagerActor(String managerActor) {
		this.managerActor = managerActor;
	}
	
	
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

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
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

	public Map<String, Object> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Object> variables) {
		this.variables = variables;
	}

	public Collection<SalesAnalyzerTaskInstance> getActiveUserTasks() {
		return activeUserTasks;
	}

	public void setActiveUserTasks(Collection<SalesAnalyzerTaskInstance> activeUserTasks) {
		this.activeUserTasks = activeUserTasks;
	}

	public Integer getStates() {
		return states;
	}

	public void setStates(Integer states) {
		this.states = states;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "SalesAnalyzerProcessInstance{" + "id=" + id + ", city=" + city + ", states=" + states + ", product="
				+ product + ", processId='" + processId + '\'' + ", processName='" + processName + '\'' + ", state="
				+ state + ", containerId='" + containerId + '\'' + ", correlationKey='" + correlationKey + '\'' + '}';
	}

	public static class Builder {

		private SalesAnalyzerProcessInstance processInstance = new SalesAnalyzerProcessInstance();

		public SalesAnalyzerProcessInstance build() {
			return processInstance;
		}

		public Builder id(Long id) {
			processInstance.setId(id);
			return this;
		}

		public Builder processId(String processId) {
			processInstance.setProcessId(processId);
			return this;
		}

		public Builder processName(String processName) {
			processInstance.setProcessName(processName);
			return this;
		}

		public Builder processVersion(String processVersion) {
			processInstance.setProcessVersion(processVersion);
			return this;
		}

		public Builder state(Integer state) {
			processInstance.setState(state);
			return this;
		}

		public Builder containerId(String containerId) {
			processInstance.setContainerId(containerId);
			return this;
		}

		public Builder initiator(String initiator) {
			processInstance.setInitiator(initiator);
			return this;
		}

		public Builder date(Date date) {
			processInstance.setDate(date == null ? date : new Date(date.getTime()));
			return this;
		}

		public Builder processInstanceDescription(String description) {
			processInstance.setProcessInstanceDescription(description);
			return this;
		}

		public Builder correlationKey(String correlationKey) {
			processInstance.setCorrelationKey(correlationKey);
			return this;
		}

		public Builder parentInstanceId(Long parentInstanceId) {
			processInstance.setParentId(parentInstanceId);
			return this;
		}

		public Builder variables(Map<String, Object> variables) {
			processInstance.setVariables(variables);
			return this;
		}

		public Builder activeUserTasks(List<SalesAnalyzerTaskInstance> activeUserTasks) {
			processInstance.setActiveUserTasks(activeUserTasks);
			return this;
		}

		public Builder states(Integer states) {
			processInstance.setStates(states);
			return this;
		}

		public Builder city(Integer city) {
			processInstance.setCity(city);
			return this;
		}

		public Builder analystActor(String analystActor) {
			processInstance.setAnalystActor(analystActor);
			return this;
		}
		
		public Builder managerActor(String managerActor) {
			processInstance.setManagerActor(managerActor);
			return this;
		}
		
		
	}

}

