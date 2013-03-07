package org.elsoft.platform.metamodel.objects.command.links;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.EventDAO;

@Entity(name = "DataLink2CastType")
@Table(name = "datalink2casttype")
@DiscriminatorValue("DATALINK2CASTTYPE")
@XmlRootElement
public class CreateDataLink2CastTypeDAO extends EventDAO {

	@Column(name = "DOMAIN")
	private String domain;

	@Column(name = "FUNCTIONALDOMAIN")
	private String functionalDomain;

	@Column(name = "APPLICATION")
	private String application;

	@Column(name = "TYPE_NAME")
	private String typeName;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getFunctionalDomain() {
		return functionalDomain;
	}

	public void setFunctionalDomain(String functionalDomain) {
		this.functionalDomain = functionalDomain;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

}
