package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public class SearchCommand extends Command{

	public SearchCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	@Override
	public Object execute() throws Exception {
		this.prepareParameters();
		this.prepareCall();

		return  callMethod();
	}

}
