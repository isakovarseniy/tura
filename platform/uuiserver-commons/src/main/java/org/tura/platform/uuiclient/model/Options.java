/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.ObjectControl;

public class Options<T> implements Serializable{

	private static final long serialVersionUID = 4915683522844713146L;
	
	protected List<Object[]> options;
	protected String label;
	protected String value;
	protected DataControl<?> datacontrol;
	protected Object callback;
	private transient Logger logger = Logger.getLogger(Options.class.getName());


	public Options() {
	}

	
	public Options(DataControl<?> datacontrol,  Object callback) {
		this.datacontrol = datacontrol;
		this.callback = callback;
	}
	
	
	@SuppressWarnings("unchecked")
	public T setLabel(String label) {
		this.label = label;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setValue(String value) {
		this.value = value;
		return (T) this;
	}
	
	
	public void  clean() {
		options = null;
	}
	
	public List<Object[]> getOptions() {
		if (options != null)
			return options;

		options = new ArrayList<>();

		try {
			datacontrol.getCurrentObject();
			List<?> scroler = datacontrol.getScroller();

			Iterator<?> itr = scroler.iterator();
			while (itr.hasNext()) {
				Object obj = itr.next();
				Object objLabel = null;
				try {
					objLabel = Reflection.call(obj, label);
				} catch (NoSuchMethodException m) {
					ObjectControl oc = (ObjectControl) obj;
					String attr = "ATTRIBUTE_" + label.toUpperCase().substring(3);
					objLabel = oc.getAttributes().get(attr);
				}
				Object objValue = null;
				try {
					objValue = Reflection.call(obj, value);
				} catch (NoSuchMethodException m) {
					ObjectControl oc = (ObjectControl) obj;
					String attr = "ATTRIBUTE_" + value.toUpperCase().substring(3);
					objValue = oc.getAttributes().get(attr);
				}
				options.add(new Object[] { objLabel, objValue });
			}

		} catch (Exception e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		}

		return options;

	}
	
	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		in.defaultReadObject();
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		logger = Logger.getLogger(Options.class.getName());
	}
	
	
	
}
