package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface DepartmentsDAO extends TuraObject {
    public void setDepartmentId(Long departmentId);

    public Long getDepartmentId();

    public void setDepartmentName(String departmentName);

    public String getDepartmentName();

    public void setManagerId(Long managerId);

    public Long getManagerId();

    public void setLocationId(Long locationId);

    public Long getLocationId();

    public void setDescription(String description);

    public String getDescription();
}
