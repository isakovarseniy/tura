package org.elsoft.platform.metamodel.objects.command.form.ui;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "CreateDrugAndDrop")
@Table(name = "create_druganddrop")
@DiscriminatorValue("CREATEDRUGANDDROP")
@XmlRootElement
public class CreateDrugAndDropDAO extends FormElementDAO{

}
