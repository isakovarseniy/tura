package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.Employee;

import java.util.Collection;

public class EmployeeObject {
    private Employee employee;
    private Collection<FileObject> fileObject;
    private Collection<VehicleObject> vehicleObject;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Collection<FileObject> getFileObject() {
        return fileObject;
    }

    public void setFileObject(Collection<FileObject> fileObject) {
        this.fileObject = fileObject;
    }

    public Collection<VehicleObject> getVehicleObject() {
        return vehicleObject;
    }

    public void setVehicleObject(Collection<VehicleObject> vehicleObject) {
        this.vehicleObject = vehicleObject;
    }
}
