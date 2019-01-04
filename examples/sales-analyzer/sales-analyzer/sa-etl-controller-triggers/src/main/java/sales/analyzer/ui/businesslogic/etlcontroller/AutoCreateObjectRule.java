package sales.analyzer.ui.businesslogic.etlcontroller;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DCRule;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.AutoCreateObject;
import org.tura.platform.datacontrol.annotations.Selector;


@Alternative
@Priority(10)
@Selector("dataloader.etlcontroller")
@AutoCreateObject("holderObject")
public class AutoCreateObjectRule implements DCRule{

	@SuppressWarnings("rawtypes")
	@Override
	public boolean execute(DataControl dc) {
		return true;
	}

}
