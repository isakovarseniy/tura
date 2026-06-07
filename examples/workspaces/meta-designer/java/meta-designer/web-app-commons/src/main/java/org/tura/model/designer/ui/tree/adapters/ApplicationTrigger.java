/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.model.designer.ui.tree.adapters;

import java.util.Map;

import jakarta.inject.Inject;

import org.tura.model.designer.repository.serialized.application.Application;
import org.tura.model.designer.repository.serialized.application.ApplicationLanguages;
import org.tura.model.designer.repository.serialized.application.ApplicationMappers;
import org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries;
import org.tura.model.designer.repository.serialized.application.ApplicationMessageLibrary;
import org.tura.model.designer.repository.serialized.application.ApplicationRealms;
import org.tura.model.designer.repository.serialized.application.ApplicationRecipes;
import org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries;
import org.tura.model.designer.repository.serialized.application.ApplicationUILayer;
import org.tura.model.designer.ui.tree.Crud;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;

public class ApplicationTrigger implements OnChangeArtificialFieldTrigger, Crud, PostCreateTrigger {

	private static final long serialVersionUID = 1L;

	@Inject
	ELResolver elResolver;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		((Application) obj).setName((String) value);
		return true;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		Application dt = (Application) obj;
		String name = dt.getName();
		if (name == null) {
			name = (String) elResolver.getValue("#{Navigator['APPLICATION_NAME_NULL']}");
		}
		return new Object[] { name };

	}

	@Override
	public boolean isEditable(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) {
		return true;
	}

	@Override
	public boolean isEnableToCreateChildren(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) {
		return false;
	}

	@Override
	public void createChildren(TreeDataControl tdc, DataControl<?> dc, ObjectControl oc, String childType) throws TuraException {

	}

	@Override
	public void execute(DataControl<?> datacontrol, Object obj, Map<String, Object> attributes) throws TuraException {
		try {
			Application app = (Application) obj;
			ApplicationRecipes appRes = repository.create(ApplicationRecipes.class);
			app.setApplicationRecipes(appRes);
			
			ApplicationMappers appMap= repository.create(ApplicationMappers.class);
			app.setApplicationMappers(appMap);
			
			ApplicationUILayer appUi= repository.create(ApplicationUILayer.class);
			app.setApplicationUILayer(appUi);
			
			ApplicationStyleLibraries appSt= repository.create(ApplicationStyleLibraries.class);
			app.setApplicationStyle(appSt);

			ApplicationRealms appRealm= repository.create(ApplicationRealms.class);
			app.setApplicationRole(appRealm);

			ApplicationMessageLibraries appMsgs= repository.create(ApplicationMessageLibraries.class);
			app.setApplicationMessages(appMsgs);
			
			ApplicationMessageLibrary appMsg= repository.create(ApplicationMessageLibrary.class);
			appMsgs.setMessageLibraries(appMsg);
			
			ApplicationLanguages appLang= repository.create(ApplicationLanguages.class);
			appMsgs.setApplicationLanguages(appLang);
			
			
		} catch (Exception e) {
			throw new TuraException(e);
		}

	}
	@Override
	public boolean isEnableToDelete(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) {
		return isEditable(  tdc,  dc,  oc);
	}

	@Override
	public void delete(TreeDataControl tdc, DataControl<?> dc, ObjectControl oc) throws TuraException {
		try {
			tdc.removeObject();
		} catch (Exception e) {
            throw new TuraException(e);
		}
	}

}
