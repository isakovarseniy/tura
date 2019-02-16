package org.sales.analyzer.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamReader implements Runnable {
	private InputStream inputStream;
	private boolean isError;

	public StreamReader(InputStream inputStream, boolean isError) {
		this.inputStream = inputStream;
		this.isError = isError;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		String inputLine;
		try {
			while ((inputLine = reader.readLine()) != null) {
				if (isError) {
					System.err.println(inputLine);
				}else {
					System.out.println(inputLine);
				}
			}
		} catch (IOException e) {

		}
	}
}