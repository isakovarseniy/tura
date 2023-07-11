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

package org.tura.platform.repository.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommandStackData implements Serializable {

	private static final long serialVersionUID = 1650101999914824558L;
	private List<Object> transaction = new ArrayList<>();

	public CommandStackData() {
	}

	public CommandStackData(CommandStackData c) {
		this.transaction.addAll(c.getTransaction());
	}

	public static Object factory(Object obj) {
		if (obj == null)
			return new CommandStackData();
		if (obj instanceof CommandStackData) {
			return new CommandStackData((CommandStackData) obj);
		}
		return null;
	}

	public List<Object> getTransaction() {
		return transaction;
	}

}
