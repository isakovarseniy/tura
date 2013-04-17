package org.elsoft.platform.metamodel.objects.command.form.ui;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "FileUploader")
@Table(name = "fileuploader")
@DiscriminatorValue("FILEUPLOADER")
@XmlRootElement
public class CreateFileUploaderDAO  extends FormElementDAO{
	@Column(name = "DATA_SOURCE")
	private Long dataSource;
 
	@Column(name = "DATA_FIELD")
	private Long dataField;

	public Long getDataSource() {
		return dataSource;
	}

	public void setDataSource(Long dataSource) {
		this.dataSource = dataSource;
	}

	public Long getDataField() {
		return dataField;
	}

	public void setDataField(Long dataField) {
		this.dataField = dataField;
	}

}
