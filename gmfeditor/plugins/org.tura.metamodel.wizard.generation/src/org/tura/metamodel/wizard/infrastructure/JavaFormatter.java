package org.tura.metamodel.wizard.infrastructure;

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
