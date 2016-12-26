package org.tura.jpa.test;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity(name = "Person")
@Table(name = "PERSON")
public class Person {
	@Column(name = "NAME")
	private String name;
	@Id
	@Column(name = "OBJID")
	private Long objId;
	@Column(name = "OBJECTTYPE")
	private String objectType;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "CREATEDATE")
	private Date createDate;
	@Column(name = "ROOTID")
	private Long rootId;
	@ManyToMany(mappedBy = "person")
	private Collection<MailAddress> mailAddress;
	@OneToMany(mappedBy = "person")
	private Collection<Phone> phone;
	@OneToOne(mappedBy = "person")
	private File file;
	@JoinColumns({ @JoinColumn(name = "clientId") })
	@OneToOne
	private Client client;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getObjId() {
		return objId;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setRootId(Long rootId) {
		this.rootId = rootId;
	}

	public Long getRootId() {
		return rootId;
	}

	public Collection<MailAddress> getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(Collection<MailAddress> mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Collection<Phone> getPhone() {
		return phone;
	}

	public void setPhone(Collection<Phone> phone) {
		this.phone = phone;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}