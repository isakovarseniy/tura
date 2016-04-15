package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.Department;

import java.util.Collection;

public class DepartmentsObject extends Department {
    private Collection<EmployeeObject> employeeObject;

    public Collection<EmployeeObject> getEmployeeObject() {
        return employeeObject;
    }

    public void setEmployeeObject(Collection<EmployeeObject> employeeObject) {
        this.employeeObject = employeeObject;
    }
}
