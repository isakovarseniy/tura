package org.tura.metamodel.commons.types.impl;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RefMethodImpl extends RefTypeImpl{
	private String methodName;

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public static RefTypeImpl valueOf(String initvalue) throws ParseException {
		JSONParser parser = new JSONParser();
		Map<?,?> json = (Map<?,?>) parser.parse(initvalue);
		RefMethodImpl result = new RefMethodImpl();
		result.setPackageName((String) json.get("p"));
		result.setTypeName((String) json.get("t"));
		result.setMethodName((String) json.get("m"));

		return result;
	}
	
	@SuppressWarnings("unchecked")
	public String toString() {

		JSONObject obj = new JSONObject();
		obj.put("t", getTypeName());
		obj.put("p", getPackageName());
		obj.put("m", getMethodName());

		return obj.toJSONString();
	}

}
