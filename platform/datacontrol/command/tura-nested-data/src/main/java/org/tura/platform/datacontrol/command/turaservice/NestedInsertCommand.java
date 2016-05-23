/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.datacontrol.command.turaservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Util;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class NestedInsertCommand extends InsertCommandBase {

	protected static String METHOD = "insert";
	private Object parent;
	
	
	public NestedInsertCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}	
	
	public NestedInsertCommand() {
	}		
	
	/*
	 * 
	 * parameter 0 -- -- main object 
	 * parameter 1 -- -- parent object 
	 * parameter 2 -- -- name of method to get list of dependent objects 
	 * parameter 3 -- -- current object 
	 * 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object execute() throws Exception {
		this.prepareParameters();

		this.getDatacontrol().putObjectToPool(getWrappedObject(), PoolCommand.U);
		this.getDatacontrol().getShifter().update(this.getDatacontrol().getCurrentPosition(), getWrappedObject());

		parent = parameters.get(1).getObj();
		if (parent == null) {
			parent = this.getDatacontrol().getParent().getMasterCurrentObject();
		}
		
		DataControl<?> dc;
		Object masterObject;
		Command cmd;
		Object currentObject;
		if (parameters.get(0).getObj() == null) {
			Object obj = this.getDatacontrol().getParent().getMasterCurrentObject();
			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			dc = w.getDatacontrol();
			currentObject= parameters.get(3).getObj();
			masterObject= obj;
		}else{
			String exp = parameters.get(0).getExpression();
			Object obj = getDatacontrol().getElResolver().getValue(exp);
			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			dc = w.getDatacontrol();
			currentObject= parameters.get(3).getObj();
			masterObject= obj;
		}		
		
		masterObject = NUtil.findPreviousCommand(masterObject, dc);
		
		List clonedObjects = NUtil.clone(masterObject, parent);
		Object clonedMaster = clonedObjects.get(0);
		Object clonedParent = clonedObjects.get(1);
		
		
		List array = (List) Reflection.call(clonedParent,Util.makeGetMethod((String) (parameters.get(2).getObj())));
		if (array == null ){
			array = new ArrayList<>();
			BeanWrapper w = (BeanWrapper) Reflection.call(clonedParent, "getWrapper");
			Reflection.callTyped(w.getObj(), Util.makeSetMethod((String) (parameters.get(2).getObj())),Collection.class,array );
		}
		array.add(currentObject);
		
		cmd = NUtil.buildUpdateMasterObjectCommand(dc, clonedMaster);

		cmd.execute();
		
		return null;
	}
	
	
}
