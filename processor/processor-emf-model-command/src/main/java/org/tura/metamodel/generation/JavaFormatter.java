/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.epsilon.egl.formatter.Formatter;

public class JavaFormatter implements Formatter {

	private List <String> exceptions ;
	
	
	public void setExceptions(List<String> exceptions) {
		this.exceptions = exceptions;
	}

	public void setExceptions(Set<String> exceptions) {
		if ( exceptions != null) {
			this.exceptions = new ArrayList<>();
			this.exceptions .addAll(exceptions);
		}
	}

	

	@Override
	public String format(String text) {
		String formattedSource = null;
		try {
			 formattedSource = new JavaPreprocessor(exceptions).process(text);
			 formattedSource = new com.google.googlejavaformat.java.Formatter().formatSource(formattedSource);
		} catch (Exception e) {
			e.printStackTrace();
			return text;
		}
		return formattedSource;
	}

}
