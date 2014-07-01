package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public class DeleteCommand extends Command{

	private Object obj;

	public DeleteCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	@Override
	public Object execute() throws Exception {
		this.prepareParameters();
		this.prepareCall();
		this.getDatacontrol().getCommandStack().addRemovedObjects(obj, this);

		// Force to work with method parameters
		// this.getParameters();
		obj = null;

		return null;
	}

	@Override
	public void delayedExecution() throws Exception {

		if (this.getDatacontrol().getPreDeleteTrigger() != null)
			this.getDatacontrol().getPreDeleteTrigger().execute(this);

		callMethod();
		
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	

}
