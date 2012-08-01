package org.eclipse.e4.xwt.elsoft.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class VisualDependencyProperty {
	
	private ArrayList<String> dependencies = new ArrayList<String>();
	
	public VisualDependencyProperty(String bo) {
		StringTokenizer tokenizer = new StringTokenizer(bo, " ");
		
		while (tokenizer.hasMoreElements()){
			String token = tokenizer.nextToken();
			dependencies.add(token);
		}
	}

	public ArrayList<String> getDependencies() {
		return dependencies;
	}

	public void setDependencies(ArrayList<String> dependencies) {
		this.dependencies = dependencies;
	}
	
	public String toString() {
		Iterator<String> itr = dependencies.iterator();
		String result = ""; 
		while(itr.hasNext()){
			result=result+" "+itr.next();
		}
 		return result.substring(1);
	}
}
