package org.tura.platform.datacontrol.data;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.pool.PoolElement;

public class PoolData {

	private List<PoolElement> poolElement = new ArrayList<>();
	private long id;
	
	
	public static Object factory(Object obj){
		if (obj == null)
			return new PoolData();
		if (obj instanceof PoolData)
			return new PoolData((PoolData)obj);
		return null;
	}
	
	public  PoolData(){
		
	}
	
	public PoolData(PoolData p){
		this.id = p.id;
		this.poolElement.addAll(p.getPoolElement());
	}
	
	public List<PoolElement> getPoolElement() {
		return poolElement;
	}

	public long getNextId() {
		return ++id;
	}
	
	
}
