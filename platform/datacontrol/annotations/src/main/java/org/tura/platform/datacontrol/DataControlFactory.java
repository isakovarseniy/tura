package org.tura.platform.datacontrol;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.tura.platform.datacontrol.command.CreateCommand;

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
	@Produces 
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
