package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class DeleteCommand extends Command{

	private Object obj;

	public DeleteCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public DeleteCommand() {
	}

	@Override
	public Object execute() throws Exception {

		DeleteCommand cmd = new DeleteCommand(this.getDatacontrol());
		cmd.provider = this.provider;
		cmd.parameters =this.prepareParameters();
		this.prepareCall();
		cmd.call = this.call;

		this.getDatacontrol().getShifter().remove(this.getDatacontrol().getCurrentPosition());
		this.getDatacontrol().putObjectToPool(obj, PoolCommand.R);
		this.getDatacontrol().getCommandStack().addTransaction( cmd);


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
