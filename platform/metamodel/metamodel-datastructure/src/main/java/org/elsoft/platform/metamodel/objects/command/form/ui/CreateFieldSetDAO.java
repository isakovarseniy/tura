package org.elsoft.platform.metamodel.objects.command.form.ui;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "CreateFieldSet")
@Table(name = "create_fieldset")
@DiscriminatorValue("CREATE_FIELDSET")
@XmlRootElement
public class CreateFieldSetDAO extends FormElementDAO {

	@Column(name="LABEL")
	private String label;

	@Column(name="FIELDSETTYPE")
	private String fieldSetType;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getFieldSetType() {
		return fieldSetType;
	}

	public void setFieldSetType(String fieldSetType) {
		this.fieldSetType = fieldSetType;
	}

	
	
}
