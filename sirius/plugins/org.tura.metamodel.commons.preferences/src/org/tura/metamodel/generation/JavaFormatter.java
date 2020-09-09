/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.generation;

import org.eclipse.epsilon.egl.formatter.Formatter;
import org.hybridlabs.source.beautifier.CharacterSequence;
import org.hybridlabs.source.beautifier.JavaImportBeautifierImpl;

import ch.qos.logback.classic.Level;

public class JavaFormatter implements Formatter {

	@Override
	public String format(String text) {

		JavaImportBeautifierImpl beautifier = new JavaImportBeautifierImpl();	
		beautifier.setOrganizeImports(true);
		beautifier.setFormat(true);
		
		ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) org.slf4j.LoggerFactory.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME);
	    root.setLevel(Level.OFF);
				
        CharacterSequence sequence = new CharacterSequence(text);
        beautifier.beautify(sequence);
        
		return sequence.toString();
	}

}
