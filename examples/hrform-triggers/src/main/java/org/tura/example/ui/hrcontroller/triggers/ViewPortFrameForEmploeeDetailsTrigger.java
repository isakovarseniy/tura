package org.tura.example.ui.hrcontroller.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.ViewPortTrigger;
import org.tura.platform.datacontrol.command.ViewPortCommand;

@Alternative
@Priority(10)
@Selector("hrcontroller")
@ViewPortTrigger("frameForEmploeeDetails")
public class ViewPortFrameForEmploeeDetailsTrigger extends ViewPortCommand {

	@Override
	public Object execute() {
		return this.port;
	}

}
