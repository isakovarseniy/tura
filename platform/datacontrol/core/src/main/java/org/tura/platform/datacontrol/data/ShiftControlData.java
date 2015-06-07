package org.tura.platform.datacontrol.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ShiftControl;

public class ShiftControlData {

	private HashMap<String, ShiftControl> shifterHash= new HashMap<>();
	private int addOpr;
	private int removeOpr;
	private long actualRowNumber = -1L;
	private List<Element> shifterArray = new ArrayList<>();
	private long lastUpdate;
	
	
	public static Object factory(Object obj){
		if (obj == null)
			return new ShiftControlData();
		if (obj instanceof ShiftControlData)
			return new ShiftControlData((ShiftControlData)obj);
		return null;
	}
	
	
	public ShiftControlData(){
		
	}

	public ShiftControlData(ShiftControlData d){
		this.addOpr = d.getAddOpr();
		this.removeOpr = d.getRemoveOpr();
		this.actualRowNumber = d.getActualRowNumber();
		this.shifterArray.addAll(d.getShifterArray());
		this.lastUpdate = d.getLastUpdate();
		
		for (String key : shifterHash.keySet())
			this.shifterHash.put(key, shifterHash.get(key));
	}
	
	public HashMap<String, ShiftControl> getShifterHash() {
		return shifterHash;
	}
	public void setShifterHash(HashMap<String, ShiftControl> shifterHash) {
		this.shifterHash = shifterHash;
	}

	public int getAddOpr() {
		return addOpr;
	}
	public void setAddOpr(int addOpr) {
		this.addOpr = addOpr;
	}
	public int getRemoveOpr() {
		return removeOpr;
	}
	public void setRemoveOpr(int removeOpr) {
		this.removeOpr = removeOpr;
	}
	public long getActualRowNumber() {
		return actualRowNumber;
	}
	public void setActualRowNumber(long actualRowNumber) {
		this.actualRowNumber = actualRowNumber;
	}
	public List<Element> getShifterArray() {
		return shifterArray;
	}

	public long getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	
	
}
