package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

import com.rits.cloning.Cloner;

public class UpdateCommand extends Command {

	private Object obj;

	public UpdateCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	@Override
	public Object execute() throws Exception {

		this.prepareParameters();
		this.prepareCall();

		Cloner cloner = new Cloner();
		Command cmd = cloner.deepClone(this);
		this.getDatacontrol().getCommandStack().addUpdatedObjects(obj, cmd);

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

		if (this.getDatacontrol().getPreUpdateTrigger() != null)
			this.getDatacontrol().getPreUpdateTrigger().execute(this);

		callMethod();
	}

}
