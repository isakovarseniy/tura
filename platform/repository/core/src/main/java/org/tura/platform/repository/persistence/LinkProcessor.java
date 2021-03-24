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

package org.tura.platform.repository.persistence;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.lang.WordUtils;

public class LinkProcessor implements RelOperation {

	private List<List<String>> links;

	
	public LinkProcessor(List<List<String>> links) {
		this.links = links;
	}
	
	@Override
	public void connect(Object master, Object detail, String property) throws Exception {
		throw new UnsupportedOperationException();

	}

	@Override
	public void connect(Object master, Object detail) throws Exception {

		for (List<String> lnk : links) {
			String field1 = lnk.get(0);
			String field2 = lnk.get(1);

			String srcName = "get" + WordUtils.capitalize(field1);
			Method srcM = master.getClass().getMethod(srcName, new Class<?>[] {});
			Object value = srcM.invoke(master);

			String trgName = "set" + WordUtils.capitalize(field2);
			Method trgM = detail.getClass().getMethod(trgName, new Class<?>[] { value.getClass() });

			trgM.invoke(detail, value);

		}

	}

	@Override
	public void disconnect(Object master, Object detail, String property) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public void disconnect(Object master, Object detail) throws Exception {

		for (List<String> lnk : links) {
			String field1 = lnk.get(0);
			String field2 = lnk.get(1);

			String trgGetName = "get" + WordUtils.capitalize(field1);
			Method trgGetM = master.getClass().getMethod(trgGetName, new Class<?>[] {});

			String trgSetName = "set" + WordUtils.capitalize(field2);
			Method trgM = detail.getClass().getMethod(trgSetName, new Class<?>[] { trgGetM.getReturnType() });
			trgM.invoke(detail, new Object[] { null });

		}

	}

	@Override
	public List<?> getChildren(Object object, String property) throws Exception {
		throw new UnsupportedOperationException();
	}

}
