package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public class InsertCommand extends Command {
	private Object obj;

	public InsertCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	@Override
	public Object execute() throws Exception {

		this.prepareParameters();
		this.prepareCall();
		this.getDatacontrol().getCommandStack().addCommandObjects(obj, this);

		// Force to work with method parameters
		// this.getParameters();
		obj = null;

		return null;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public void delayedExecution() throws Exception {

		if (this.getDatacontrol().getPreInsertTrigger() != null)
			this.getDatacontrol().getPreInsertTrigger().execute(this);

		callMethod();
	}

}
