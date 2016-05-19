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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;
import org.tura.platform.datacontrol.commons.Reflection;

import com.rits.cloning.Cloner;

public class NestedInsertCommand extends InsertCommandBase {

	protected static String METHOD = "insert";
	private HashMap <String,Object> context;
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
		super.execute();

		parent = parameters.get(1).getObj();
		if (parent == null) {
			parent = this.getDatacontrol().getParent().getMasterCurrentObject();
		}
		
		List array = (List) Reflection.call(parent,makeGetMethod((String) (parameters.get(2).getObj())));
		if (array == null ){
			array = new ArrayList<>();
			BeanWrapper w = (BeanWrapper) Reflection.call(parent, "getWrapper");
			Reflection.callTyped(w.getObj(), makeSetMethod((String) (parameters.get(2).getObj())),Collection.class,array );
		}
		array.add(parameters.get(3).getObj());
		
		if (parameters.get(0).getObj() == null) {
			setObj(this.getDatacontrol().getParent().getMasterCurrentObject());
			BeanWrapper w = (BeanWrapper) Reflection.call(getObj(), "getWrapper");
			setDatacontrol(w.getDatacontrol());
			
			Cloner cloner = new Cloner();
			Object o = cloner.deepClone(w.getObj());
			setObj(o);
		}else{
			setObj(parameters.get(0).getObj());
			Cloner cloner = new Cloner();
			Object o = cloner.deepClone(getObj());
			setObj(o);
			String exp = parameters.get(0).getExpression();
			Object obj = getDatacontrol().getElResolver().getValue(exp);
			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			setDatacontrol(w.getDatacontrol());
		}		
		
		replaceParameters();

		
		return null;
	}
	
	
	@Override
	public void compress(HashMap <String,Object> context){
		this.context=context;
		this.context.put("object", getObj());
	}
	
	@Override
	public boolean isCompressable(Command prevCommand){
		if (prevCommand == null)
			return true;
		return false;
	}	
	
	@Override
	public void delayedExecution() throws Exception {

		if (this.getDatacontrol().getPreInsertTrigger() != null)
			this.getDatacontrol().getPreInsertTrigger().execute(this);

		Object provider = getProviders().values().iterator().next();
		
		Method m = this.prepareCall( provider, METHOD);
		
		 m.invoke(provider, new Object[] {context.get("object"),context.get("object").getClass().getName() });
	
       }
	
	private void replaceParameters(){
		getParameters().clear();
		
		CallParameter parameter = new CallParameter();
		parameter.setName("object");
		parameter.setClazz(this.getObj().getClass());
		parameter.setExpression(null);
		parameter.setObj(getObj());
		parameter.setValue(getObj());
		getParameters().add(parameter);
		
		
		/*
		 * Add additional parameter to pass type of object to reposiroty service
		 * 
		 * */
		parameter = new CallParameter();
		parameter.setName("objectClass");
		parameter.setClazz(String.class);
		parameter.setExpression(null);
		parameter.setObj(this.getObj().getClass().getName());
		parameter.setValue(this.getObj().getClass().getName());
		getParameters().add(parameter);
		
	}

	private String makeSetMethod(String field){
		String property = field;
		if ((field.substring(0, 3).equals("set"))  || (field.substring(0, 3).equals("get")))
			property = StringUtils.uncapitalize(field.substring(3));
		
		return "set"+StringUtils.capitalize(property);

	}
	
	private String makeGetMethod(String field){
		String property = field;
		if ((field.substring(0, 3).equals("set"))  || (field.substring(0, 3).equals("get")))
			property = StringUtils.uncapitalize(field.substring(3));
		
		return "get"+StringUtils.capitalize(property);

	}
		
	
}
