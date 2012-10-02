package org.eclipse.e4.xwt.elsoft.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class RolesProperty {
	private ArrayList<String> roles = new ArrayList<String>();

	public RolesProperty(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, " ");

		while (tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			roles.add(token);
		}

	}

	public ArrayList<String> getRoles() {
		return roles;
	}

	public String toString() {
		Iterator<String> itr = roles.iterator();
		String result = ""; 
		while(itr.hasNext()){
			result=result+" "+itr.next();
		}
 		return result.substring(1);
	}

}
