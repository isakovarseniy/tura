package org.tura.platform.repository.core.relatioin;

import java.lang.reflect.Method;
import java.util.List;

import org.tura.platform.repository.core.Rule;

public class Many2ManyRepositoryRuleObject implements Rule {

	private Object master;
	private Object detail;
	private Method masterMethod;
	private Method detailMethod;

	public Many2ManyRepositoryRuleObject(Object master, Object detail, Method masterMethod, Method detailMethod) {
		this.master = master;
		this.detail = detail;
		this.masterMethod = masterMethod;
		this.detailMethod = detailMethod;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void execute() throws Exception {
		List list = (List) masterMethod.invoke(master);
		list.add(detail);

		list = (List) detailMethod.invoke(detail);
		list.add(master);

	}

}
