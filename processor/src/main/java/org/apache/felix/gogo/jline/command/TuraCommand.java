/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.apache.felix.gogo.jline.command;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.HashMap;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate;
import org.tura.metamodel.commons.QueryHelper;

import recipe.Configuration;
import recipe.HashProperty;
import recipe.KeyValuePair;
import recipe.Property;

public class TuraCommand {
	
	public static boolean initURL = false;

	protected EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, getFileURI(metamodel).toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	protected URI getFileURI(String fileName) throws URISyntaxException {
		URI uri = Paths.get(fileName).toUri();
		return uri;
	}

	protected IEolModule createEolModule(IModel model) {
		IEolModule module = new EolModule();
		module.getContext().getModelRepository().addModel(model);
		module.getContext().getNativeTypeDelegates().add(new EolClasspathNativeTypeDelegate());
		return module;
	}

	protected void getConfiguratioin(Configuration conf ,HashMap<String,Object> configuration){
		QueryHelper helper = new QueryHelper();
		try{
		if (conf != null){
  		   for (Property prop : conf.getProperties()){
			  String p = System.getProperty(prop.getConfVarRef().getName());
			  if ( p != null){
				  configuration.put(prop.getConfVarRef().getName(), p);
			  }else{
				  configuration.put(prop.getConfVarRef().getName(), prop.getValue());
			  }
		   }
  		   
 		   for (HashProperty prop : conf.getHashProperties()){
 			  HashMap <String,String> hash = new HashMap<String, String>();

 			  for (KeyValuePair pair : prop.getHash())
 				 hash.put(pair.getKey(), pair.getValue());
 			  
			  configuration.put(prop.getConfHashRef().getName(), hash);
		   }
  		   
		   if (  helper.getConfigExtensionUp(conf) != null)
			   getConfiguratioin(helper.getConfigExtensionUp(conf),configuration);
		}
		}catch(Exception e){
			
		}
	}
	
	

}
