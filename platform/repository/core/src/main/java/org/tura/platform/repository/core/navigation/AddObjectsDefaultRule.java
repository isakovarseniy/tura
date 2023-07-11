/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.core.navigation;

import org.tura.platform.repository.core.Rule;
import org.tura.platform.repository.core.annotation.Association;

public class AddObjectsDefaultRule implements Rule {

	@Override
	public boolean guard(String ruleType, Object... args) throws Exception {
		return true;
	}

	@Override
	public boolean check(String ruleType, Object... args) throws Exception {
		if (NavigationRuleTypes.AddObject_ValidateIsObjectContainment.name().equals(ruleType)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validate(Object... args) throws Exception {
		Association association  = (Association) args[0];
		return association.containment();
	}

	@Override
	public void execute() throws Exception {

	}

	@Override
	public boolean isDefault() throws Exception {
		return true;
	}

}
