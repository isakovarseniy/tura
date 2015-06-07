package org.tura.platform.datacontrol.data;

import java.util.ArrayList;
import java.util.HashMap;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.Command;

public class CommandStackData {

	private HashMap<String, DataControl<?>> gostTracking = new HashMap<>();
	private ArrayList<Command> transaction = new ArrayList<Command>();

	
	public static Object factory(Object obj){
			return new CommandStackData();
	}
	
	public HashMap<String, DataControl<?>> getGostTracking() {
		return gostTracking;
	}
	public ArrayList<Command> getTransaction() {
		return transaction;
	}

	
}
