package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface VehicleDAO extends TuraObject {
    public void setVehicleMaker(String vehicleMaker);

    public String getVehicleMaker();

    public void setPlateNumber(String plateNumber);

    public String getPlateNumber();
}
