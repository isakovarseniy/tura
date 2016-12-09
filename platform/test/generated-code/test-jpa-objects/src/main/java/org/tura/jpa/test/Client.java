package org.tura.jpa.test;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity(name = "Client")
@Table(name = "CLIENT")
public class Client {
    @Column(name = "NAME")
    private String name;
    @Id
    @Column(name = "OBJID")
    private Long objId;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "CREATEDATE")
    private Date createDate;
    @Column(name = "OBJECTTYPE")
    private String objectType;
    @OneToOne(mappedBy = "client")
    private Person person;

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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectType() {
        return objectType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
