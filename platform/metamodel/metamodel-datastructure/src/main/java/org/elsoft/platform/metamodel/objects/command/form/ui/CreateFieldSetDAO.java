package org.elsoft.platform.metamodel.objects.command.form.ui;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "CreateFieldSet")
@Table(name = "create_fieldset")
@DiscriminatorValue("CREATE_FIELDSET")
@XmlRootElement
public class CreateFieldSetDAO extends FormElementDAO {

}
