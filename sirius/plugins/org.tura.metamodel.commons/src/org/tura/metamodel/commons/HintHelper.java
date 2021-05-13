/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import java.util.HashMap;

public class HintHelper {
    private HashMap<String,String[]> hash = new HashMap<>();
    
    public HintHelper(){
    	hash.put("Model.Form.DataControl.Command", new String[]{"Model","Form","Data Control","command"});
    	hash.put("Model.Form.DataControl.NestedCommand", new String[]{"Model","Form","Data Control","nested.command"});
    }
    
    public String[] get(String key){
    	return hash.get(key);
    }
    
}
