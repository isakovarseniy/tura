package sales.analyzer.api.model.impl;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable

public class ETLNodeInstanceLog {

    protected Boolean attached;
    protected String serializationid;
    protected Long id;
    protected Long processInstanceId;
    protected Date logDate;
    protected String nodeName;
    protected String nodeType;
    protected String nodeInstanceId;
    protected Integer type;
    protected ETLProcessInstance etlProcess;
	public Boolean getAttached() {
		return attached;
	}
	public void setAttached(Boolean attached) {
		this.attached = attached;
	}
	public String getSerializationid() {
		return serializationid;
	}
	public void setSerializationid(String serializationid) {
		this.serializationid = serializationid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getNodeType() {
		return nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public String getNodeInstanceId() {
		return nodeInstanceId;
	}
	public void setNodeInstanceId(String nodeInstanceId) {
		this.nodeInstanceId = nodeInstanceId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public ETLProcessInstance getEtlProcess() {
		return etlProcess;
	}
	public void setEtlProcess(ETLProcessInstance etlProcess) {
		this.etlProcess = etlProcess;
	}
	
	
	
}
