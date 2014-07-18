package org.tura.platform.datacontrol.command;

import org.tura.platform.datacontrol.DataControl;

import com.rits.cloning.Cloner;

public class DeleteCommand extends Command{

	private Object obj;

	public DeleteCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	@Override
	public Object execute() throws Exception {
		this.prepareParameters();
		this.prepareCall();

		Cloner cloner = new Cloner();
		Command cmd = cloner.deepClone(this);
		
		this.getDatacontrol().getShifter().remove(this.getDatacontrol().getCurrentPosition());
		this.getDatacontrol().getCommandStack().addTransaction( cmd);

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
