package org.tura.platform.datacontrol;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.tura.platform.datacontrol.annotations.Qwerty;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.InsertCommand;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.command.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.PreInsertTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.command.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;

import com.octo.java.sql.query.SelectQuery;

public class DataControlFactory {

//	@Produces
//	public List<ArtificialProperty> getArtificialProperties(
//			InjectionPoint injectionPoint) {
//		return null;
//	}
//
//	@Produces 
//	public InsertCommand getInsertCommand(InjectionPoint injectionPoint) {
//		return null;
//	}
//
//	@Produces 
//	public UpdateCommand getUpdateCommand(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//	
	@Produces @Qwerty
	public CreateCommand getCreateCommand(InjectionPoint injectionPoint) {
		return null;

	}
	
//	@Produces 
//	public DeleteCommand getDeleteCommand(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//	
//	@Produces @Default
//	public SearchCommand getSearchCommand(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//
//	@Produces @Default
//	public SelectQuery getSelectQuery(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//
//	@Produces @Default
//	public ELResolver getELResolver(InjectionPoint injectionPoint) {
//		return null;
//	}
//
//	@Produces @Default
//	public PreQueryTrigger getPreQueryTrigger(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//
//	@Produces @Default
//	public PostQueryTrigger getPostQueryTrigger(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//
//	@Produces @Default
//	public PostCreateTrigger getPostCreateTrigger(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//
//	@Produces @Default
//	public PreDeleteTrigger getPreDeleteTrigger(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//
//	@Produces @Default
//	public PreInsertTrigger getPreInsertTrigger(InjectionPoint injectionPoint) {
//		return null;
//
//	}
//
//	@Produces @Default
//	public PreUpdateTrigger getPreUpdateTrigger(InjectionPoint injectionPoint) {
//		return null;
//
//	}

}
