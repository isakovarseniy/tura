package sales.analyzer.ui.businesslogic.admin;

import java.io.Serializable;
import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.primefaces.model.CallbackProducer;


@Alternative
@Priority(10)
@Selector("admin.administration")
public class ViewModelCallbackProducer implements Serializable, CallbackProducer{

	private static final long serialVersionUID = 1L;

	@Override
	public Object getCallBackObject(String id) {
		return null;
	}

}
