package org.tura.platform.hr.objects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.tura.platform.persistence.TuraObject;

@Entity(name = "CountryDAO")
@Table(name = "COUNTRYDAO")
public class CountryDAO extends TuraObject  implements Serializable{

	private static final long serialVersionUID = 7801485531352936673L;
	
    @Column(name = "COUNTRYNAME")
    private String countryName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



}
