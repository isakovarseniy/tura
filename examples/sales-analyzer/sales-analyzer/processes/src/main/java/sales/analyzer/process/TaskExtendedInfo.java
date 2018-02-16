package sales.analyzer.process;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@Entity
public class TaskExtendedInfo {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TASKEXTENDETINFO_ID_GENERATOR")
	@Id
	@SequenceGenerator(name = "TASKEXTENDETINFO_ID_GENERATOR", sequenceName = "TASKEXTENDETINFO_ID_SEQ")
	private Long id;

	private Long taskId;
	private Long processId;
	
	
	@Embedded
	private BusinessInfo info;

	@Version
	@Column(name = "OPTLOCK")
	private int version;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BusinessInfo getInfo() {
		return info;
	}

	public void setInfo(BusinessInfo info) {
		this.info = info;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getProcessId() {
		return processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}


	
	
}
