package org.sales.analyzer.process;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class RunServerTest {

	
	@ClassRule
	public static ServerStartRule rule = new ServerStartRule();
	
	@Test
	@RunAsClient
	public void t000_loop() {
		CrunchifyAlwaysRunningProgram object = new CrunchifyAlwaysRunningProgram();
		object.waitMethod();
	}

	
}
