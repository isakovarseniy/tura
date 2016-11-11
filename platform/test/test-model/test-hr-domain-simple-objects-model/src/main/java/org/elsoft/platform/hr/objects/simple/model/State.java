package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.StateDAO;

import org.tura.platform.object.model.DomainObject;

public class State extends DomainObject implements StateDAO {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
