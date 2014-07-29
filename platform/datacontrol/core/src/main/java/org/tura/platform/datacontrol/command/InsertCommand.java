package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

public class InsertCommand extends Command {
	private Object obj;

	public InsertCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public InsertCommand() {
	}

	
	@Override
	public Object execute() throws Exception {

		InsertCommand cmd = new InsertCommand(this.getDatacontrol());
		cmd.provider = this.provider;
		cmd.parameters =this.prepareParameters();
		this.prepareCall();
		cmd.call = this.call;
		

		this.getDatacontrol().getCommandStack().addTransaction( cmd);
		this.getDatacontrol().getShifter().update(this.getDatacontrol().getCurrentPosition(), obj);


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
