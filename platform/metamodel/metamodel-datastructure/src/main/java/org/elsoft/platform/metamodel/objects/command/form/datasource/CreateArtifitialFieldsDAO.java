package org.elsoft.platform.metamodel.objects.command.form.datasource;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.CommandDAO;

@Entity(name = "ArtifitialFields")
@Table(name = "Artifitial_Fields")
@DiscriminatorValue("ARTIFITIALFIELDS")
@XmlRootElement
public class CreateArtifitialFieldsDAO extends CommandDAO{
	
	@Column(name = "ARTIFITIAL_FIELD_NAME")
	private String artifitialFieldName;

	@Column(name = "REF_TYPE")
	private Long refType;

	@Column(name = "DEFAULT_VALUE")
	private String defaultValue;

	public String getArtifitialFieldName() {
		return artifitialFieldName;
	}

	public void setArtifitialFieldName(String artifitialFieldName) {
		this.artifitialFieldName = artifitialFieldName;
	}

	public Long getRefType() {
		return refType;
	}

	public void setRefType(Long refType) {
		this.refType = refType;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
}
