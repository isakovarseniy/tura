package org.tura.metamodel.wizard.infrastructure;

import java.util.HashMap;

import org.eclipse.epsilon.egl.formatter.Formatter;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

public class JavaFormatter implements Formatter {

	@Override
	public String format(String text) {

		HashMap<String, String> options = new HashMap<>();
		options.put("eclipse.preferences.version", "1");
		options.put("org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode","enabled");
		options.put("org.eclipse.jdt.core.compiler.codegen.targetPlatform","1.7");
		options.put("org.eclipse.jdt.core.compiler.compliance", "1.7");
		options.put("org.eclipse.jdt.core.compiler.problem.assertIdentifier","error");
		options.put("org.eclipse.jdt.core.compiler.problem.enumIdentifier","error");
		options.put("org.eclipse.jdt.core.compiler.source", "1.7");

		IDocument doc = new Document();

		final CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(options);
		doc.set(text);
		TextEdit edit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT | CodeFormatter.F_INCLUDE_COMMENTS, text, 0, text.length(), 0, null);
		if (edit != null) {
			try {
				edit.apply(doc);
			} catch (MalformedTreeException | BadLocationException e) {
				return text;
			}
		} else {
			return text;
		}

		return doc.get();
	}

}
