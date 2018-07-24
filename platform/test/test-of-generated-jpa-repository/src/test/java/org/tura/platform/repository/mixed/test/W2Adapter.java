package org.tura.platform.repository.mixed.test;

import org.tura.jpa.test.W1;
import org.tura.jpa.test.W2;

public class W2Adapter extends W2 {
	
	private W2Source w2Source;
	public W2Adapter( Object obj){
		this.w2Source = (W2Source) obj;
	    w1DirectMapping = false;
		
	}
	
	public W2Source getObj() {
		return w2Source;
	}

	@Override
	public Object getObject(String event) {
		return w2Source;
	}

	@Override
	protected Long delegateGetObjId() {
		throw new RuntimeException();
	}

	@Override
	protected void delegateSetObjId(Long objId) {
		throw new RuntimeException();
		
	}

	@Override
	protected W1 delegateGetW1() {
		return  new W1Adapter( w2Source.getHash().get("W1"));
	}

	@Override
	protected void delegateSetW1(W1 w1) {
		W1Adapter w = (W1Adapter) w1;
		w2Source.getHash().put("W1",w.getObj());
	}


}
