package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "CountryDAO")
@Table(name = "COUNTRYDAO")
public class CountryDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Column(name = "COUNTRYNAME")
    private String CountryName;
    @Column(name = "STATEID")
    private Long stateId;

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Long getStateId() {
        return stateId;
    }
}
