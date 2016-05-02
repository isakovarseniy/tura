package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.City;

import java.util.Collection;

public class CityObject extends City {
    private Collection<StreetObject> streetObject;

    public Collection<StreetObject> getStreetObject() {
        return streetObject;
    }

    public void setStreetObject(Collection<StreetObject> streetObject) {
        this.streetObject = streetObject;
    }
}
