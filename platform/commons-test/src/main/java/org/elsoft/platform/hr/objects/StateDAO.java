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
    @Column(name = "STATENAME")
    private String stateName;
    @Column(name = "CITYID")
    private Long cityId;

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCityId() {
        return cityId;
    }
}
