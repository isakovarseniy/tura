package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.CompanyDAO;

import org.tura.platform.object.model.DomainObject;

public class Company extends DomainObject implements CompanyDAO {
    private String companyName;
    private Long countryId;
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
