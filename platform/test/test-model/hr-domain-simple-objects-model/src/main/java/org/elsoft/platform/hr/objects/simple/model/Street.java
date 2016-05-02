package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.StreetDAO;

import org.tura.platform.object.model.DomainObject;

public class Street extends DomainObject implements StreetDAO {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
