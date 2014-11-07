package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "StreetDAO")
@Table(name = "STREETDAO")
public class StreetDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Column(name = "STREETNAME")
    private String StreetName;

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public String getStreetName() {
        return StreetName;
    }
}
