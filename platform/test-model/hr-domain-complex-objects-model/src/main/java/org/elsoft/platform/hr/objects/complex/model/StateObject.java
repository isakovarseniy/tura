package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.State;

import java.util.Collection;

public class StateObject extends State {
    private Collection<CityObject> cityObject;

    public Collection<CityObject> getCityObject() {
        return cityObject;
    }

    public void setCityObject(Collection<CityObject> cityObject) {
        this.cityObject = cityObject;
    }
}
