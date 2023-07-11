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

package org.tura.platform.datacontrol.commons;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reflection {

	@SuppressWarnings("rawtypes")
	public static Object call(Object obj, String method, Object... args)
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		Class[] classes = new Class[args.length];
		for (int i = 0; i < args.length; i++) {
			classes[i] = args[i].getClass();
		}

		Method m = obj.getClass().getMethod(method, classes);
		return m.invoke(obj, args);

	}

	@SuppressWarnings("rawtypes")
	public static Object callTyped(Object obj, String method, Object... args)
			throws Exception {

		Class[] classes = new Class[args.length / 2];
		for (int i = 0, j = 0; i < args.length; i += 2, j++) {
			classes[j] = (Class<?>) args[i];
		}

		
		Method m = prepareCall(  obj, method, Arrays.asList(classes));

		Object[] objects = new Object[args.length / 2];
		for (int i = 1, j = 0; i < args.length; i += 2, j++) {
			objects[j] = args[i];
		}
		
		return m.invoke(obj, objects);

	}

	
	public static Method prepareCall(  Object provider , String method , List<?> ls) throws Exception {
		Method m = null;
		
	    if(ls.size() == 0  ){
			return  provider.getClass().getMethod(method,
					ls.toArray(new Class<?>[ls.size()]));
	    }
	    else // if we are looking for a version of the method that takes arguments
	    {
	        // we have to do this type of lookup because our user arguments could be 
	        // subclasses of the arguments required by the method. getMethod will not
	        // find a match in that case.
	            boolean matchFound = false;
	            Class<?> c = provider.getClass();
	            do{   // for each level in the inheritance hierarchy:

	                // get all the methods with the right name 
	                //(matching the name that the user supplied for the method)
	                Method[] methodList = c.getMethods();
	                ArrayList<Method> matchingMethods = new ArrayList<Method>();
	                for( Method meth : methodList) {
	                    if(meth.getName().equals(method)){
	                        matchingMethods.add(meth); 
	                    }
	                }

	                // check for a matching method signature
	                for( Method meth : matchingMethods)
	                {
	                    // get the types of the arguments the method under
	                    // investigation requires.
	                    Class<?>[] paramList = meth.getParameterTypes();

	                    // make sure the signature has the required number of 
	                    // elements. If not, this is not the correct method.
	                    if(paramList.length != ls.size()){
	                        continue;
	                    }


	                    // Now check if each method argument is assignable from the
	                    // type given by the user's provided arguments. This means
	                    // that we are checking to see if each of the user's 
	                    // arguments is the same as, or is a superclass or 
	                    // superinterface of the type found in the method signature
	                    //(i.e. it is legal to pass the user arguments to this 
	                    // method.) If one does not match, then this is not the 
	                    // correct method and we continue to the next one.

	                    boolean signatureMatch = false;
	                    for ( int i = 0; i < paramList.length; ++i) {
	                        if(paramList[i].isAssignableFrom( (Class<?>) (ls.get(i)) )) {
	                            signatureMatch = true;
	                        }else{
	                            continue;
	                        }
	                    }


	                    // if we matched the signature on a matchingly named
	                    // method, then we set the method m, and indicate 
	                    // that we have found a match so that we can stop
	                    // marching up the inheritance hierarchy. (i.e. the
	                    // containing loop will terminate.
	                    if(true == signatureMatch)
	                    {
	                        m = meth;
	                        matchFound = true;
	                        break;
	                    }

	                }

	                // move up one level in class hierarchy.
	                c = c.getSuperclass();
	            }
	            while(null != c && false == matchFound);
	        }

	    // check that m got assigned
	    if(null == m){
	        new TuraException("Could not find method "+ method);
	    }

	    // try to invoke the method !!!!
		return  m;
		
	}
	
	
	
}
