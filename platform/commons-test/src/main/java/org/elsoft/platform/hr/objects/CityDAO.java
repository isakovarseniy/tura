package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "CityDAO")
@Table(name = "CITYDAO")
public class CityDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Column(name = "CITYNAME")
    private String cityName;
    @Column(name = "STREETID")
    private Long streetId;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    public Long getStreetId() {
        return streetId;
    }
}
