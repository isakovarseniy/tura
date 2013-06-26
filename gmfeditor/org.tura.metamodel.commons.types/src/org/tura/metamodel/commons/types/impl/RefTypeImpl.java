package org.tura.metamodel.commons.types.impl;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RefTypeImpl {

	private String packageName;
	private String typeName;

	public static RefTypeImpl valueOf(String initvalue) throws ParseException {
		JSONParser parser = new JSONParser();
		Map json = (Map) parser.parse(initvalue);
		RefTypeImpl result = new RefTypeImpl();
		result.setPackageName((String) json.get("packageName"));
		result.setTypeName((String) json.get("typeName"));

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

	public String toString() {

		JSONObject obj = new JSONObject();
		obj.put("packageName", packageName);
		obj.put("typeName", typeName);

		return obj.toJSONString();
	}
	
}
