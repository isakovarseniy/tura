package org.tura.platform.hr.controls.producer;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.PreDelete;
import org.tura.platform.datacontrol.annotations.PreInsert;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.PreUpdate;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.command.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.PreInsertTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.command.PreUpdateTrigger;

public class CountryProducer {

	@Produces @PreQuery("country")
	public PreQueryTrigger getPreQueryTrigger( InjectionPoint injectionPoint) {
		return null;

	}

	@Produces @PostQuery("country")
	public PostQueryTrigger getPostQueryTrigger(InjectionPoint injectionPoint) {
		return null;

	}

	@Produces @PostCreate("country")
	public PostCreateTrigger getPostCreateTrigger(InjectionPoint injectionPoint) {
		return null;

	}

	@Produces @PreDelete("country")
	public PreDeleteTrigger getPreDeleteTrigger(InjectionPoint injectionPoint) {
		return null;

	}

	@Produces @PreInsert("country")
	public PreInsertTrigger getPreInsertTrigger(InjectionPoint injectionPoint) {
		return null;

	}

	@Produces @PreUpdate("country")
	public PreUpdateTrigger getPreUpdateTrigger(InjectionPoint injectionPoint) {
		return null;

	}
	
	
	
}
