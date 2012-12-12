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
package org.elsoft.platform.datacontrol;

import java.util.ArrayList;
import java.util.Iterator;

public class RootModeSwitch {
	public static Integer INSERT_MODE = new Integer("0"); 
	public static Integer QUERY_MODE = new Integer("1"); 
	
	private ArrayList<Mode<?>> ls = new ArrayList<Mode<?>>();
	

	private Integer mode = INSERT_MODE;

	public Integer getMode() {
		return mode;
	}
	
	public void addRootMode(Mode<?> md){
		ls.add(md);
	}

	public void setMode(Integer mode) {
		this.mode = mode;
		Iterator< Mode<?>> itr = ls.iterator();
		while(itr.hasNext()){
			Mode <?> md = itr.next();
			md.setMode(mode);
		}
	}

}
