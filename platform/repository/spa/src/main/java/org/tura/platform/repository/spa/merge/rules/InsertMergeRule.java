package org.tura.platform.repository.spa.merge.rules;

import java.util.Map;

import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

import com.rits.cloning.Cloner;

public class InsertMergeRule implements MergeRule {

	
	public void merge( Map<Object, SpaControl> listOfObjectsPerType, SpaControl preparedObject, SpaControl control ) throws RepositoryException{
		if ( !preparedObject.getLevel().name().equals(OperationLevel.INSERT.name()) ){
			throw new RepositoryException("Wrong level for SpaControl");
		}
		if ( control.getLevel().name().equals(OperationLevel.INSERT.name()) ){
			throw new RepositoryException("You cannot insert multiple objects with same PK");
		}
		
		if ( control.getLevel().name().equals(OperationLevel.DELETE.name()) ){
			listOfObjectsPerType.remove(preparedObject);
		}
		
		if ( control.getLevel().name().equals(OperationLevel.UPDATE.name()) ){
			Cloner c = new Cloner();
			Object o = c.deepClone(control.getObject());
			preparedObject.setObject(o);
		}
		
	}
}
