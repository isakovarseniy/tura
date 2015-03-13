package org.tura.platform.test;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public final class LogFormatter extends Formatter {

	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	@Override
	public String format(LogRecord record) {
		StringBuilder sb = new StringBuilder();

		sb.append(record.getMessage()).append(LINE_SEPARATOR);


		return sb.toString();
	}
}
