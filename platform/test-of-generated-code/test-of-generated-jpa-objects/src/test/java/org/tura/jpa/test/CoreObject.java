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

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity(name = "CoreObject")
@Table(name = "COREOBJECT")
public class CoreObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Id
    @Column(name = "OBJID")
    private Long objId;
    @Column(name = "PARENTID")
    private Long parentId;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "CRETEDATE")
    private Date creteDate;
    @Id
    @Column(name = "OBJECTTYPE")
    private String objectType;

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public Long getObjId() {
        return objId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setCreteDate(Date creteDate) {
        this.creteDate = creteDate;
    }

    public Date getCreteDate() {
        return creteDate;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectType() {
        return objectType;
    }
}
