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
public class SalesAnalyzerTaskInstance {

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

}
