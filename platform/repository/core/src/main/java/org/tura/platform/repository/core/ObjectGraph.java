/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.repository.core;

import java.util.Stack;

public class ObjectGraph {
	
	Stack<String> tree = new Stack<>();
		
	public ObjectGraph (  ){
	}

	public ObjectGraph ( ObjectGraph graph ){
		tree.addAll(graph.tree);
	}

	public boolean addBranch(String branch){
		if (tree.contains(branch)){
			return false;
		}
		tree.push(branch);
		return true;
	}
	
	public void removeLastBranch(String branch) throws RepositoryException{
		String id = tree.pop();
		if (!branch.equals(id)){
			throw new RepositoryException("Wrong branch");
		}
	}
	
}
