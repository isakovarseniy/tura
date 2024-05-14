/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.tree.technologies.adapters;

import java.util.Map;

import javax.inject.Inject;

import org.tura.model.designer.ui.tree.Crud;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;

public class DomainArtifactsTriggers  implements OnChangeArtificialFieldTrigger,Crud {

	private static final long serialVersionUID = 1L;

	@Inject
	ELResolver elResolver;

	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		return false;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		return new Object[] {elResolver.getValue("#{Navigator['TECHNOLOGIES']}")};
	}

	@Override
	public boolean isEditable(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) {
		return false;
	}

	@Override
	public boolean isEnableToCreateChildren(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) {
		return true;
	}

	@Override
	public void createChildren(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc , String childType) throws TuraException {
		String rel = dc.getRelationsName().iterator().next();
		if (rel != null) {
			tdc.createChildObject(rel);
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