package org.tura.metamodel.wizard.infrastructure;

import org.eclipse.epsilon.egl.formatter.Formatter;
import org.hybridlabs.source.beautifier.CharacterSequence;
import org.hybridlabs.source.beautifier.JavaImportBeautifierImpl;

public class JavaFormatter implements Formatter {

	@Override
	public String format(String text) {

		JavaImportBeautifierImpl beautifier = new JavaImportBeautifierImpl();	
		beautifier.setOrganizeImports(true);
		beautifier.setFormat(true);
		
        CharacterSequence sequence = new CharacterSequence(text);
        beautifier.beautify(sequence);
        
		return sequence.toString();
	}

}
