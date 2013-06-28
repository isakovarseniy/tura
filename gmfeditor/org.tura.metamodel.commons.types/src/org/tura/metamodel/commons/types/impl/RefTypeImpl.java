package org.tura.metamodel.commons.types.impl;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RefTypeImpl {

	private String packageName;
	private String typeName;

	public static RefTypeImpl valueOf(String initvalue) throws ParseException {
		JSONParser parser = new JSONParser();
		Map<?,?> json = (Map<?,?>) parser.parse(initvalue);
		RefTypeImpl result = new RefTypeImpl();
		result.setPackageName((String) json.get("p"));
		result.setTypeName((String) json.get("t"));

		return result;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@SuppressWarnings("unchecked")
	public String toString() {

		JSONObject obj = new JSONObject();
		obj.put("t", typeName);
		obj.put("p", packageName);

		return obj.toJSONString();
	}
	
}
