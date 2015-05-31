package org.tura.platform.datacontrol.pool;

import org.tura.platform.datacontrol.commons.TuraException;

public enum PoolCommand {
	C("C"), U("U"), R("R");

	private String command;

	PoolCommand(String command) {
		this.command = command;
	}

	public PoolElement createdCommand(Object obj, Object key, Class<?> clazz,
			String id) throws TuraException {
		return new PoolElement(obj, key, clazz, command, id);
	}

}
