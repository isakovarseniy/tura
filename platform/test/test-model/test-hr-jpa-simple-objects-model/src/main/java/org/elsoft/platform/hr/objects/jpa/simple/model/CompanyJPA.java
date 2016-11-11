package org.elsoft.platform.hr.objects.jpa.simple.model;

import org.tura.platform.object.persistence.PersistenceObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "CompanyJPA")
@Table(name = "COMPANYJPA")
public class CompanyJPA extends PersistenceObject {
    @Column(name = "COMPANYNAME")
    private String companyName;
    @Column(name = "COINTRYID")
    private Long cointryId;
    @Column(name = "DESCRIPTION")
    private String description;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCointryId(Long cointryId) {
        this.cointryId = cointryId;
    }

    public Long getCointryId() {
        return cointryId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
