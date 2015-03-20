package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Util;
import org.tura.platform.datacontrol.commons.Reflection;

public class UpdateCommand extends Command {

	private Object obj;

	public UpdateCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public UpdateCommand() {
	}

	@Override
	public Object execute() throws Exception {

		UpdateCommand cmd = new UpdateCommand(this.getDatacontrol());
		cmd.provider = this.provider;
		cmd.parameters = this.prepareParameters();
		this.prepareCall();
		cmd.call = this.call;

		if (obj != null) {
			try {
				 Reflection.call(obj,"getWrapper");
			} catch (Exception e) {
				obj = Util.convertobject(obj, getDatacontrol());
			}
			this.getDatacontrol().getShifter().update(this.getDatacontrol().getCurrentPosition(), obj);
			this.getDatacontrol().getCommandStack().addTransaction(cmd);
		}
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
