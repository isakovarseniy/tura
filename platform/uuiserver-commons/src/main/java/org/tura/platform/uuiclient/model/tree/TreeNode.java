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

package org.tura.platform.uuiclient.model.tree;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.tura.platform.datacontrol.TreePath;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;


@JsonIdentityInfo(generator = PropertyGenerator.class, property = "serializationid")
public class TreeNode implements Serializable {

	private static final long serialVersionUID = 8200181287518542594L;

	private String serializationid = UUID.randomUUID().toString();
	private Object data;
	private TreeNode parent;
	private Map<String, List<TreeNode>> children = new LinkedHashMap<String, List<TreeNode>>();
	private String relation;
	
	
	public TreeNode ( Object data) {
		this.data = data;
	}

	
	public boolean isRoot() {
		if ( parent == null && relation == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data=data;
	}
	
    public Set <String> getRelations(){
    	return children.keySet();
    }
	
    public int getChildrenCount() {
    	int count = 0;
    	for ( String relation : children.keySet()) {
               List<TreeNode>  array = children.get(relation);
               count = count + array.size();
    	}
    	return count;
    }
    
	
	public TreeNode[] getChildren(String relation) {
		if ( children.isEmpty()) {
			return null;
		}
		if ( children.get(relation) == null) {
			return null;
		}
		
		return children.get(relation).toArray(new TreeNode[children.size()]);
	}

	public void addChild( String relation, TreeNode child) {
		List<TreeNode> array =  children.get(relation);
		if ( array == null) {
			array = new ArrayList<TreeNode>();
			children.put(relation, array);
		}
		child.setRelation(relation);
		child.setParent(this);
		array.add(child);
	}
	
	public void addChild( String relation, TreeNode child, int position) {
		List<TreeNode> array =  children.get(relation);
		if ( array == null) {
			array = new ArrayList<TreeNode>();
			children.put(relation, array);
		}
		child.setRelation(relation);
		child.setParent(this);
		array.add(position,child);
	}
	
	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public boolean removeChild( TreeNode child) {
		List<TreeNode> array =  children.get(child.getRelation());
		if (  array != null) {
			boolean result = array.remove(child);
			if (array.size() ==  0 ) {
				children.remove(child.getRelation());
			}
			return result;
		}
		return false;
	}
	
	public void removeChildren( ) {
		if ( children.isEmpty()) {
			return ;
		}
		children = new HashMap<String, List<TreeNode>>();
	}
	
	public void removeChildren(String relation) {
		if ( children.isEmpty()) {
			return ;
		}
		children.remove(relation);
	}

	public boolean isExpanded() {
		return !children.isEmpty();
	}

	public List<TreePath> getPath() {
		List<TreePath> path = new ArrayList<TreePath>();
		int thisKey = 0;
		if ( parent != null) {
			List<TreePath> parentPath = parent.getPath();
			thisKey = parent.getIndex(this);
			path.addAll(parentPath);
		}else {
			return path;
		}
		path.add(new TreePath(this.relation,thisKey ));
		return path;
		
	}

	private int getIndex(TreeNode treeNode) {
		List< TreeNode> array =  children.get(treeNode.getRelation());
		return array.indexOf(treeNode);
	}
	
    
    public String getSerializationid() {
        return serializationid;
    }

    public void setSerializationid(String serializationid) {
        this.serializationid = serializationid;
    }
	
    
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	int thisKey = 0;
    	if ( parent != null ) {
			thisKey = parent.getIndex(this);
    	}
    	builder.append("key= "+thisKey) ;		
    	builder.append("relation = "+relation) ;
    	
    	return builder.toString();
    }
    
}
