/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.jpa.test;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity(name = "MailAddress")
@Table(name = "MAILADDRESS")
public class MailAddress {
    @Column(name = "ADDRESS")
    private String address;
    @Id
    @Column(name = "OBJID")
    private Long objId;
    @Column(name = "OBJECTTYPE")
    private String objectType;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "CREATEDATE")
    private Date createDate;
    @JoinTable(name = "RL_MAILADDRESS_PERSON", joinColumns =  {
        @JoinColumn(name = "mailaddress_objId")
    }
    , inverseJoinColumns =  {
        @JoinColumn(name = "person_objId")
    }
    )
    @ManyToMany
    private Collection<Person> person;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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

    public Collection<Person> getPerson() {
        return person;
    }

    public void setPerson(Collection<Person> person) {
        this.person = person;
    }
}
