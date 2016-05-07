package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.Employee;

import java.util.Collection;

public class EmployeeObject extends Employee {
    private Collection<FileObject> fileObject;
    private Collection<VehicleObject> vehicleObject;

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
