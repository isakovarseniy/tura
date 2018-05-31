package org.tura.platform.repository.spa.test;

import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class CRUDService implements CRUDProvider{

	@Override
	public void execute(SpaControl control) throws Exception {
		if (control.getLevel().equals(OperationLevel.INSERT)) {
			insert(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.UPDATE)) {
			update(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			delete(control);
			return;
		}
		throw new Exception("Unknown operation");
		
	}
	
	
	private void insert(SpaControl control) throws Exception {
		 Map<Object,Object> h = SearchService.base.get(control.getObject().getClass().getName());
		 if (h == null){
			 h = new HashMap<>();
			 SearchService.base.put(control.getObject().getClass().getName(), h);
		 }
		 Object obj = h.get(control.getKey());
		 if (obj != null) {
			 throw new Exception("Object already exists");
		 }
		 h.put(control.getKey(), control.getObject());
	}
	
	private void update(SpaControl control) throws Exception {
		 Map<Object,Object> h = SearchService.base.get(control.getObject().getClass().getName());
		 Object obj = h.get(control.getKey());
		 if (obj == null) {
			 throw new Exception("Could not find an object");
		 }
		 h.put(control.getKey(), control.getObject());
	}

	private void delete(SpaControl control) throws Exception {
		 Map<Object,Object> h = SearchService.base.get(control.getObject().getClass().getName());
		 Object obj = h.get(control.getKey());
		 if (obj == null) {
			 throw new Exception("Could not find an object to delete");
		 }
		 h.remove(control.getKey());
	}
	
}

