package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.Company;

import java.util.Collection;

public class CompanyObject extends Company {
    private Collection<CountryObject> countryObject;

    public Collection<CountryObject> getCountryObject() {
        return countryObject;
    }

    public void setCountryObject(Collection<CountryObject> countryObject) {
        this.countryObject = countryObject;
    }
}
