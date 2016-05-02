package org.elsoft.platform.hr.objects.jpa.simple.model;

import org.tura.platform.object.persistence.PersistenceObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "CountryJPA")
@Table(name = "COUNTRYJPA")
public class CountryJPA extends PersistenceObject {
    @Column(name = "NAME")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
