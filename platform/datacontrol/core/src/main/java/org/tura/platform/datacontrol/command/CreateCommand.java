package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public class CreateCommand extends Command {

	public CreateCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	@Override
	public Object execute() throws Exception {

		this.prepareParameters();
		this.prepareCall();

		Object obj = callMethod();

		if (obj != null)
			this.getDatacontrol().getShifter().add(this.getDatacontrol().getCurrentPosition(), obj);

		if (obj != null && this.getDatacontrol().getPostCreateTrigger() != null)
			this.getDatacontrol().getPostCreateTrigger().execute(this.getDatacontrol(), obj);

		return obj;

	}

	@Override
	public void delayedExecution() throws Exception {
	}

}
