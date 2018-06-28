package org.tura.example.ui.hrmanager;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class ServerStartRule implements TestRule {

	@Override
	public Statement apply(Statement base, Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				String str = System.getProperty("start.standalone.server");
				if (str != null && str.equals("true")) {
					base.evaluate();
				}
			}
		};
	}
}
