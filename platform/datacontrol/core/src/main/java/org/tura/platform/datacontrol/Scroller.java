package org.tura.platform.datacontrol;

import java.util.AbstractList;

import org.tura.platform.datacontrol.commons.TuraException;

public class Scroller<T>  extends AbstractList<T> {

	private Pager<T> pager;
	
	public Scroller(Pager<T> pager ){
		this.pager=pager;
	}
	
	@Override
	public T get(int index) {
		try {
			return pager.getObject(index);
		} catch (TuraException e) {
			throw new IndexOutOfBoundsException(e.getMessage());
		}
	}

	@Override
	public int size() {
		return (int)pager.actualListSize();
	}

}
