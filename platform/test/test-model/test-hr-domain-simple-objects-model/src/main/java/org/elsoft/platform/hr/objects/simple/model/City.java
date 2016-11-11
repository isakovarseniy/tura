package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.CityDAO;

import org.tura.platform.object.model.DomainObject;

public class City extends DomainObject implements CityDAO {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
