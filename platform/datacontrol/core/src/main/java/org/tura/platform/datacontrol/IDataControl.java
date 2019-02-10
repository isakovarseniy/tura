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
package org.tura.platform.datacontrol;

import java.util.Collection;
import java.util.List;

import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.Relation;

public interface IDataControl {
	
	public void addEventLiteners(EventListener listener);

	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException;

	public Object getCurrentObject() throws TuraException ;

	public Object createObject() throws TuraException;

	public void removeObject() throws Exception;

	public void removeAll() throws Exception;
	
	public  void createChild(String  relName) throws TuraException;

	public void setParent(Relation relation) throws TuraException;
	
	public boolean setCurrentPosition(Object obj) throws TuraException;
	
	public Object getCurrentPosition() throws TuraException;
	
	public Collection<String> getRelationsName();
	
	public Relation getChild(String relationName);
	
	public List<DependecyProperty> getDependency();

	public void setDependency(List<DependecyProperty> dependency);
	
	public TreeDataControl getTreeContext() ;
	
	public void  setTreeContext(TreeDataControl tdc) ;
	
	public Relation getParent();
	
	public void onPoolUpdate() throws TuraException;
	
	public void saveState()  throws TuraException;
	
	public void flush() throws TuraException;
	
}
