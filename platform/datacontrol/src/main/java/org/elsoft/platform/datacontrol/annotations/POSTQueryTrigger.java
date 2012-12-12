package org.elsoft.platform.datacontrol.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface POSTQueryTrigger {
	Class<?> clazz();
	String method();
}
