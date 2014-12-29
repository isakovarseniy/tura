package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "StateDAO")
@Table(name = "STATEDAO")
public class StateDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Column(name = "NAME")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
