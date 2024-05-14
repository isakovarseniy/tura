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

package org.tura.platform.repository.proxy.access;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.cpa.storage.StorageControlWrapper;

public class CpaHelper {

	public static <T> List<T> toObjectList(List<StorageControl> fromList) {
		List<T> toList = new ArrayList<>();
		if (fromList != null) {
			for (StorageControl s : fromList) {
				toList.add(toObject(s));
			}
			return toList;
		} else {
			return new ArrayList<>();
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T toObject(StorageControl sc) {
		if (sc instanceof StorageControlWrapper) {
			StorageControlWrapper scw = (StorageControlWrapper) sc;
			return (T) scw.getInternalObject();
		} else {
			return (T) sc.getObject();
		}

	}

}
