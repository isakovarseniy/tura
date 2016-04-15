package org.tura.jpa.test;

import org.tura.platform.object.persistence.PersistenceObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Location")
@Table(name = "LOCATION")
public class Location extends PersistenceObject {
    @Column(name = "CITY")
    private String city;
    @Column(name = "STREET")
    private String street;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}
