package sales.analyzer.api.model.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

@XmlRootElement
@Remotable
public class TaskComletion  implements Serializable{

	private static final long serialVersionUID = 8770593764769185257L;
	
	private Long processInstanceId;
	private Long taskId;
	private Integer direction;
	
	
	public Long getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public Integer getDirection() {
		return direction;
	}
	public void setDirection(Integer direction) {
		this.direction = direction;
	}

}
