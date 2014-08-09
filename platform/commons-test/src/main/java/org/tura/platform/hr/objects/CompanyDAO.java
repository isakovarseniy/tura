package org.tura.platform.hr.objects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.tura.platform.persistence.TuraObject;

@Entity(name = "CompanyDAO")
@Table(name = "COMPANYDAO")
public class CompanyDAO extends TuraObject implements Serializable{

	private static final long serialVersionUID = -555898910629342609L;

	@Column(name = "COMPANYNAME")
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	
	
	
}
