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
import java.util.List;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Util;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.CommandFactory;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;

import com.rits.cloning.Cloner;
import com.rits.cloning.ClonerForNestedObject;

public class NUtil {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> clone(Object masterWrapedObject, Object leafWrapedObject ) throws Exception{
		
		BeanWrapper w = (BeanWrapper) Reflection.call(masterWrapedObject, "getWrapper");
		DataControl<?> dcMaster = w.getDatacontrol();
		Object unwrapedMasterObject = w.getObj();
		
		w = (BeanWrapper) Reflection.call(leafWrapedObject, "getWrapper");
		DataControl<?> dcLeaf = w.getDatacontrol();

		
		ClonerForNestedObject cloner = new ClonerForNestedObject(leafWrapedObject, dcLeaf);
		Object clonedUnwrapedMaster =  cloner.deepClone(unwrapedMasterObject);
		Object  clonedUnwrapedLeaf = cloner.getSavedRef();
		
		Object clonedWrapedMaster = Util.convertobject(clonedUnwrapedMaster, dcMaster);
		Object clonedWrapedLeaf = Util.convertobject(clonedUnwrapedLeaf, dcMaster);


		for (ArtificialProperty p : dcMaster.getArtificialProperties()) {
			Object o = Reflection.call(masterWrapedObject,Util.makeGetMethod(p.getProperty()));
			if(o != null){
			   Reflection.call(clonedWrapedMaster,Util.makeSetMethod(p.getProperty()),o);
			}
		}
		
		ArrayList array = new ArrayList();
		array.add(clonedWrapedMaster);
		array.add(clonedWrapedLeaf);
		return array;
	}
	
	public static Command buildUpdateMasterObjectCommand(DataControl<?> dc, Object masterWrappedObject) throws Exception{

		BeanWrapper w = (BeanWrapper) Reflection.call(masterWrappedObject, "getWrapper");
		Object obj = w.getObj();
		
		Cloner cloner = new Cloner();
		Object cloned =  cloner.deepClone(obj);
		
		Object clonedMasterWrappedObject = Util.convertobject(cloned, dc);
		
		
		MasterObjectUpdateCommand masterUpdateCmd = new MasterObjectUpdateCommand();
		Command updateCommand = dc.getUpdateCommand();		
				
		masterUpdateCmd.setObj(cloned);
		masterUpdateCmd.setWrappedObject( clonedMasterWrappedObject);
		
		
		masterUpdateCmd.setParameters(CommandFactory.cloneParameters(updateCommand.getParameters()));
		masterUpdateCmd.setProviders(updateCommand.getProviders());
		masterUpdateCmd.setDatacontrol(dc);
		
		return masterUpdateCmd;
		
	}
	
}
