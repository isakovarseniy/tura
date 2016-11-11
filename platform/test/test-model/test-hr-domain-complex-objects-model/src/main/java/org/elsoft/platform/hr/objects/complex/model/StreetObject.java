package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.Street;

import java.util.Collection;

public class StreetObject extends Street {
    private Collection<DepartmentsObject> departmentsObject;

    public Collection<DepartmentsObject> getDepartmentsObject() {
        return departmentsObject;
    }

    public void setDepartmentsObject(
        Collection<DepartmentsObject> departmentsObject) {
        this.departmentsObject = departmentsObject;
    }
}
