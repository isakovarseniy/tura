package org.tura.metamodel.generation;

import org.eclipse.epsilon.egl.formatter.Formatter;

public class JavaFormatter implements Formatter {

	@Override
	public String format(String text) {
		String formattedSource = null;
		try {
			 formattedSource = new com.google.googlejavaformat.java.Formatter().formatSource(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return formattedSource;
	}

}
