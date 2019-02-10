/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.primefaces.menu;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.primefaces.model.menu.MenuElement;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;

public class GlobalExtensionPointResolver {

	@SuppressWarnings("unchecked")
	public static ArrayList<MenuElement> find(String application,
			String uipackage, String form, String menu, ELResolver elResolver) throws TuraException {

		String path = "java:global/" + application + "/" + uipackage + "/"
				+ form +"/" +menu;

		try {
			Context ic = new InitialContext();
			AbsractMenuProvider obj  = (AbsractMenuProvider) ic.lookup(path);
			return (ArrayList<MenuElement>) obj.getMenu(elResolver);
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

}
