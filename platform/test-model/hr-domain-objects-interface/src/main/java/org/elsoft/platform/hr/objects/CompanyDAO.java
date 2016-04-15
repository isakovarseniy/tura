package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface CompanyDAO extends TuraObject {
    public void setCompanyName(String companyName);

    public String getCompanyName();

    public void setCountryId(Long countryId);

    public Long getCountryId();

    public void setDescription(String description);

    public String getDescription();
}
