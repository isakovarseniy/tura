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

package org.tura.model.designer.ui.messages.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.tura.model.designer.repository.serialized.application.ApplicationLanguages;
import org.tura.model.designer.repository.serialized.dictionary.ListOfLanguages;
import org.tura.model.designer.repository.serialized.message.Language;
import org.tura.model.designer.ui.messages.mmdesigner.messages.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.AbstractGridModelTriggers;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.ViewModel;

public class LanguageSelectionGridTrigger extends  AbstractGridModelTriggers  {

	private static final long serialVersionUID = -284822349692512133L;
	private ELResolver elResolver;
	private transient Logger logger = Logger.getLogger(LanguageSelectionGridTrigger.class.getName());

	public LanguageSelectionGridTrigger(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void onSelect(Object obj) {
		try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerMessages}");
			DataControl dc = (DataControl) bf.getApplicationLanguages();

			CpaRepository repository = dc.getPager().getRepository();

			ListOfLanguages p = (ListOfLanguages) obj;
			ApplicationLanguages appLang = (ApplicationLanguages) dc.getCurrentObject();
			for (Language lang : appLang.getLanguages()) {
				if (lang.getCode().equals(p.getCode())) {
					return;
				}
			}

			Language newLang = repository.create(Language.class);
			newLang.setCode(p.getCode());
			newLang.setLang(p.getLanguage());
			appLang.getLanguages().add(newLang);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void onUnselect(Object obj) {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerMessages}");
			DataControl dc = (DataControl) bf.getApplicationLanguages();

			ListOfLanguages p = (ListOfLanguages) obj;
			ApplicationLanguages appLang = (ApplicationLanguages) dc.getCurrentObject();

			int i = 0;
			boolean found = false;
			for (Language lang : appLang.getLanguages()) {
				if (lang.getCode().equals(p.getCode())) {
					found = true;
					break;
				}
				i++;
			}
			if (found) {
				appLang.getLanguages().remove(i);
			}
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Object> initSelected(List<Object> ls) {

		Map<String, Object> map = new HashMap<>();
		for (Object obj : ls) {
			ListOfLanguages oc = (ListOfLanguages) obj;
			map.put(oc.getCode(), obj);
		}

		List<Object> selected = new ArrayList<>();
		try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerMessages}");
			DataControl dc = (DataControl) bf.getApplicationLanguages();
			ApplicationLanguages appLang = (ApplicationLanguages) dc.getCurrentObject();
			for (Language lang : appLang.getLanguages()) {
				ObjectControl oc = (ObjectControl) lang;
				if (oc != null && !oc.isRemoved()) {
					oc = (ObjectControl) map.get(lang.getCode());
					if (oc != null) {
						selected.add(oc);
					}
				}
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return selected;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void toggleSelect(boolean selected) {
		ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelMessages}");
		GridModel model = (GridModel) viewmodel.getModel(MessageCallBackProducer.LANGUAGE_SELECTION_TABLE, null, null);
		if (selected) {
			List<Object> list = (List<Object>) model.getSelected();
			for (Object obj : list) {
				onSelect(obj);
			}
		} else {
			List<Object> list = (List<Object>) model.load();
			for (Object obj : list) {
				onUnselect(obj);
			}
		}
	}

	@Override
	public void customizeObject(Object source, Object target) {

	}

}