package org.tura.platform.hr.controls;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.TreeDataControl;

@Named("location")
public class LocationDC extends TreeDataControl {

	@Inject
	public void setRoot(CountryDC root) {
		super.setRoot(root);
		root.getElResolver().setValue("country", root);
	}
}
