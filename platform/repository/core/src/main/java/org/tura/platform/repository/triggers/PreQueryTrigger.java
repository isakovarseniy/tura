package org.tura.platform.repository.triggers;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;

public interface PreQueryTrigger {
	
	void preQueryTrigger( List<SearchCriteria> search, List<OrderCriteria> order);
}
