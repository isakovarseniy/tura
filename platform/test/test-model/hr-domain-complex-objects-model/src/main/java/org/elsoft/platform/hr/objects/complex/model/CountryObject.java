package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.Country;

import java.util.Collection;

public class CountryObject extends Country {
    private Collection<StateObject> stateObject;

    public Collection<StateObject> getStateObject() {
        return stateObject;
    }

    public void setStateObject(Collection<StateObject> stateObject) {
        this.stateObject = stateObject;
    }
}
