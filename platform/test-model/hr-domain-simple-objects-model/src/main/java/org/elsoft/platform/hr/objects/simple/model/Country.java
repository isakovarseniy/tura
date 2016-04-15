package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.CountryDAO;

import org.tura.platform.object.model.DomainObject;

public class Country extends DomainObject implements CountryDAO {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
