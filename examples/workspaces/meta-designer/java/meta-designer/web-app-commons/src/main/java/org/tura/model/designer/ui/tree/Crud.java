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

package org.tura.model.designer.ui.tree;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;

public interface Crud {

	boolean isEditable(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) throws TuraException;;
	boolean isEnableToCreateChildren(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) throws TuraException;;
	boolean isEnableToDelete(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) throws TuraException;;
	void createChildren(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc, String childType) throws TuraException;
	void delete(TreeDataControl  tdc, DataControl<?> dc, ObjectControl oc) throws TuraException;
	
}
