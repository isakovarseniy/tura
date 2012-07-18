/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.eclipse.wb.elsoft.propertyeditor;

import java.util.ArrayList;

public class TreeModel {

	public TreeModel parent;
	public boolean updated=false;
	public ArrayList<TreeModel> child = new ArrayList<TreeModel>();
	public String nodeName;

	public TreeModel(String name, TreeModel parent) {
		this.parent = parent;
		this.nodeName = name;
		if (parent != null)
			parent.child.add(this);
	}

	public String toString() {
		return nodeName;
	}
}
