package org.tura.platform.datacontrol.command.turaservice;

import java.util.List;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.commons.Reflection;

import com.rits.cloning.Cloner;

public class NestedInsertCommand extends InsertCommandTuraService {
	
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

		List array = (List) Reflection.call(parameters.get(1).getObj(),
				(String) (parameters.get(2).getObj()));
		array.add(parameters.get(3).getObj());
		
		if (parameters.get(0).getObj() == null) {
			setObj(this.getDatacontrol().getParent().getMasterCurrentObject());
		}else{
			setObj(parameters.get(0).getObj());
		}
		BeanWrapper w = (BeanWrapper) Reflection.call(getObj(), "getWrapper");
		setDatacontrol(w.getDatacontrol());
		
		Cloner cloner = new Cloner();
		Object o = cloner.deepClone(w.getObj());
		setObj(o);
		
		replaceParameters();
		this.prepareParameters();

		
		return null;
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
	
	
}
