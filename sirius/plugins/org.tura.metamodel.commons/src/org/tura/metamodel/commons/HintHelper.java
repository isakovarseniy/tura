package org.tura.metamodel.commons;

import java.util.HashMap;

public class HintHelper {
    private HashMap<String,String[]> hash = new HashMap<>();
    
    public HintHelper(){
    	hash.put("Model.Form.DataControl.Command", new String[]{"Model","Form","Data Control","command"});
    }
    
    public String[] get(String key){
    	return hash.get(key);
    }
    
}
