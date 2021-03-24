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

package org.tura.platform.hr.init;

import java.lang.reflect.Method;

import org.tura.platform.repository.core.ObjectGraphProfile;

public class AllowEverythingProfile  extends ObjectGraphProfile {

	private static final long serialVersionUID = -5156064829167199204L;

	public boolean skipRelation(Object repositoryObject, Method method) {
		return false;
	}
	
	
}
