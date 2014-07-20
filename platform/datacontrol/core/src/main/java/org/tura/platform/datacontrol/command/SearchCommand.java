package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public class SearchCommand extends Command{

	public SearchCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	@Override
	public Object execute() throws Exception {

		if (getDatacontrol().getPreQueryTrigger() != null)
			getDatacontrol().getPreQueryTrigger().execute(getDatacontrol());
		
		this.parameters= this.prepareParameters();
		this.prepareCall();

		if (getDatacontrol().getPreQueryTrigger() != null)
			getDatacontrol().getPreQueryTrigger().execute(getDatacontrol());

		return  callMethod();
	}

	@Override
	public void delayedExecution() throws Exception {
		
	}

}
