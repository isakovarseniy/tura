/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrcontroller.actions;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DCRule;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.AutoCreateObject;
import org.tura.platform.datacontrol.annotations.Selector;


@Alternative
@Priority(10)
@Selector("hrmanager.simpleform")
@AutoCreateObject("holderObject")
public class AutoCreateObjectRule implements DCRule{

	private static final long serialVersionUID = -7537379254614212807L;

	@SuppressWarnings("rawtypes")
	@Override
	public boolean execute(DataControl dc) {
		return true;
	}

}
