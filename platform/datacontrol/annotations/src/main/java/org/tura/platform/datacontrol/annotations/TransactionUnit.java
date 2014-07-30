package org.tura.platform.datacontrol.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface TransactionUnit {
  String value();
}
