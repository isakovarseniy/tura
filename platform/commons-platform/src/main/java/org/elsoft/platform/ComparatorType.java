/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.elsoft.platform;

import java.util.Arrays;

public enum ComparatorType {
	GT(">",1),
	GTEQ(">=",0,1),
	LT("<",-1),
	LTEQ("<=",-1,0),
    EQ("=",0),
    LIKE("LIKE",0);
    
    private String comp;
    private Integer [] integers;
     
	ComparatorType(String comp, Integer...integers ) {
        this.comp = comp;
        this.integers=integers;
    }
    
	public String getComp(){
		return comp;
	}

	public boolean compare(Integer i){
		if ( Arrays.binarySearch(integers, i) >=0)
			return true;
		else 
			return false;
	}
	
}
