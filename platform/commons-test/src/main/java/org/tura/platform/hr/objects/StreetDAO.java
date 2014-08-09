package org.tura.platform.hr.objects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.tura.platform.persistence.TuraObject;

@Entity(name = "StreetDAO")
@Table(name = "STREETDAO")
public class StreetDAO extends TuraObject implements Serializable {

	private static final long serialVersionUID = -8162795612609367820L;

	@Column(name = "STREETNAME")
	private String streetName;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
