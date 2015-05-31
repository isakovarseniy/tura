package org.tura.platform.datacontrol.command;


import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Util;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class CreateCommand extends Command {

	public CreateCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}
	
	public CreateCommand() {
	}
	

	@Override
	public Object execute() throws Exception {

		this.parameters= this.prepareParameters();
		this.prepareCall();

		Object obj = callMethod();

		if (obj != null){
			obj = Util.convertobject(obj, getDatacontrol());
			this.getDatacontrol().getShifter().add(this.getDatacontrol().getCurrentPosition(), obj);
			this.getDatacontrol().putObjectToPool(obj, PoolCommand.C);
			this.getDatacontrol().getCommandStack().addGostTrackingDataControl(this.getDatacontrol());
		}

		if (obj != null && this.getDatacontrol().getPostCreateTrigger() != null)
			this.getDatacontrol().getPostCreateTrigger().execute(this.getDatacontrol(), obj);

		return obj;

	}

	@Override
	public void delayedExecution() throws Exception {
	}

}
