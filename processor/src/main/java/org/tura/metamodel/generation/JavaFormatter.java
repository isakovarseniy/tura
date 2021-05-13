/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.epsilon.egl.formatter.Formatter;

public class JavaFormatter implements Formatter {

	@Override
	public String format(String text) {
		String formattedSource = null;
		try {
			 formattedSource = new JavaPreprocessor().process(text);
			 formattedSource = new com.google.googlejavaformat.java.Formatter().formatSource(formattedSource);
		} catch (Exception e) {
			e.printStackTrace();
			return text;
		}
		return formattedSource;
	}

}
