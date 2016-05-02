package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface Department2EntityDAO extends TuraObject {
    public void setDepartmentRef(Long departmentRef);

    public Long getDepartmentRef();

    public void setEntityRef(Long entityRef);

    public Long getEntityRef();

    public void setBoolVal(Boolean boolVal);

    public Boolean getBoolVal();

    public void setImage(String image);

    public String getImage();
}
