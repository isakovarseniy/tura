package org.tura.platform.hr.objects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.tura.platform.persistence.TuraObject;

@Entity(name = "CityDAO")
@Table(name = "CITYDAO")
public class CityDAO extends TuraObject implements Serializable {

	private static final long serialVersionUID = 6209390983484147272L;

	@Column(name = "CITYNAME")
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
	
}
