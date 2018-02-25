package org.tura.comfiguration.artifacts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamReader implements Runnable {
	private InputStream inputStream;
	private Class<?> loggerName;
	private boolean isError;

	public StreamReader(InputStream inputStream, Class<?> loggerName, boolean isError) {
		this.inputStream = inputStream;
		this.loggerName = loggerName;
		this.isError = isError;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		Logger log = LoggerFactory.getLogger(loggerName);

		String inputLine;
		try {
			while ((inputLine = reader.readLine()) != null) {
				if (isError) {
					log.error(inputLine);
				}else {
					log.info(inputLine);
				}
			}
		} catch (IOException e) {

		}
	}
}