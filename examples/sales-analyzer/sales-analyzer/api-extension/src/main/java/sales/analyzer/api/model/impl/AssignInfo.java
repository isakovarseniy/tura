package sales.analyzer.api.model.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

@XmlRootElement
@Remotable
public class AssignInfo implements Serializable{
	
	private static final long serialVersionUID = 3091765770185898065L;
	private String analyst;
	private String manager;
	private Long id;
	private Long processId;
	
	public Long getProcessId() {
		return processId;
	}
	public void setProcessId(Long processId) {
		this.processId = processId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAnalyst() {
		return analyst;
	}
	public void setAnalyst(String analyst) {
		this.analyst = analyst;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	

}
