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
package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.Department2EntityDAO;

import org.tura.platform.object.model.DomainObject;

public class Dep2Entity extends DomainObject implements Department2EntityDAO {
    private Long departmentRef;
    private Long entityRef;
    private Boolean boolVal;
    private String image;

    public void setDepartmentRef(Long departmentRef) {
        this.departmentRef = departmentRef;
    }

    public Long getDepartmentRef() {
        return departmentRef;
    }

    public void setEntityRef(Long entityRef) {
        this.entityRef = entityRef;
    }

    public Long getEntityRef() {
        return entityRef;
    }

    public void setBoolVal(Boolean boolVal) {
        this.boolVal = boolVal;
    }

    public Boolean getBoolVal() {
        return boolVal;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}
