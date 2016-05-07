package org.tura.platform.test;

import java.util.List;

import org.tura.platform.object.TuraObject;
import org.tura.platform.services.JPAService;

public class TestingJpaService extends JPAService{

	private static final long serialVersionUID = 1L;
    private List<Object> list;

    public TestingJpaService(List<Object> list){
    	this.list = list;
    }
    
    
	public void update(TuraObject entity) {
		list.add(new Object[]{entity,'U'});
		super.update(entity);

	}

	public void insert(TuraObject entity) {
		list.add(new Object[]{entity,'I'});
		super.insert(entity);
	}

	public void remove(TuraObject entity) throws ClassNotFoundException {
		list.add(new Object[]{entity,'R'});
		super.remove(entity);
	}


	
	
	
	
}
