package org.tura.platform.datacontrol.command;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;

import com.rits.cloning.Cloner;

public abstract class Command {

	public void setProvider(Object provider) {
		this.provider = provider;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	private DataControl<?> datacontrol;
	protected List<CallParameter> parameters = new ArrayList<>();
	protected Object provider;
	private String method;
	protected Method call;


	
	public List<CallParameter> getParameters() {
		return parameters;
	}

	public Command(DataControl<?> datacontrol) {
		this.datacontrol = datacontrol;
	}

	public abstract Object execute() throws Exception;
	public abstract void delayedExecution() throws Exception;
	
	public DataControl<?> getDatacontrol() {
		return datacontrol;
	}
	
	
	public void prepareCall() throws Exception{
		ArrayList<Class<?>> ls = new ArrayList<>();
		for ( CallParameter prm : parameters){
			ls.add(prm.getClazz());
		}
		call = provider.getClass().getMethod(method, ls.toArray(new Class<?>[ls.size()]));
	}
	

	protected Object callMethod() throws Exception{
		
		ArrayList<Object> ls = new ArrayList<>();
		for ( CallParameter prm : parameters){
			ls.add(prm.getObj());
		}
		return call.invoke(provider, ls.toArray(new Object[ls.size()]));
	}
	
	
	public List<CallParameter> prepareParameters() throws Exception {

		Cloner cloner = new Cloner();
		ArrayList<CallParameter> lst = new ArrayList<CallParameter> ();

		if (parameters.size() != 0) {
			for (CallParameter parameter : parameters) {

				String exp = parameter.getExpression();
				String val = parameter.getValue();
				Class<?> clazz = parameter.getClazz();
				if (    (exp != null  && !exp.equals("")   ) &&  (val !=null  &&  !val.equals("") ) ) {
					new TuraException("Wrong combination of method's parameter");
				}
				if (!exp.equals("")) {
					Object obj = datacontrol.getElResolver().getValue(exp);

					if (  !obj.getClass().isPrimitive() &&   obj.getClass().getName().indexOf("EnhancerByCGLIB") != -1) {
						BeanWrapper w = (BeanWrapper) Reflection.call(obj,
								"getWrapper");
						obj = w.getObj();
					}
					
					Object o = cloner.deepClone(obj);
					parameter.setObj(o);
				}
				if ( val != null &&  !val.equals("")) {
					Constructor<?> constructor = clazz
							.getConstructor(String.class);
					parameter.setObj(constructor.newInstance(val));
				}

				CallParameter param = new CallParameter();
				param.clazz = parameter.clazz;
				param.expression = parameter.expression;
				param.name = parameter.name;
				param.obj = parameter.obj;
				
				lst.add( param);
			}
		}
		return lst;
	}

	protected void versionControl() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Iterator<?> itr = parameters.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();

			String optlcrMethod = datacontrol.getVersionAttribute();

			if (optlcrMethod != null) {
				Object optlcr = (Number) Reflection.call(obj, "get"
						+ StringUtils.capitalize(optlcrMethod));
				if (optlcr == null) {
					optlcr = 0;
					Reflection.call(obj,
							"set" + StringUtils.capitalize(optlcrMethod), 0);
				}
			}
		}
	}

	public class CallParameter {
		private String name;
		private String value;
		private Class<?> clazz;
		private String expression;
		private Object obj;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getExpression() {
			return expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public Class<?> getClazz() {
			return clazz;
		}

		public void setClazz(Class<?> clazz) {
			this.clazz = clazz;
		}

		/**
		 * @return the obj
		 */
		public Object getObj() {
			return obj;
		}

		/**
		 * @param obj the obj to set
		 */
		public void setObj(Object obj) {
			this.obj = obj;
		}

	}

}
