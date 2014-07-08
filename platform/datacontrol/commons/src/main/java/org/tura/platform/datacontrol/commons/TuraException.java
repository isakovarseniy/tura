package org.tura.platform.datacontrol.commons;

public class TuraException extends Exception {

	public TuraException(Throwable e) {
		super(e);
	}

	public TuraException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;

}
