package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "CompanyDAO")
@Table(name = "COMPANYDAO")
public class CompanyDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Column(name = "COMPANYNAME")
    private String companyName;
    @Column(name = "COUNTRYID")
    private Long countryId;
    @Column(name = "DESCRIPTION")
    private String description;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
