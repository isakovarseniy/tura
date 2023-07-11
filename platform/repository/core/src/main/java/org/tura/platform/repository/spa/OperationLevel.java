/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.spa;

import org.tura.platform.repository.spa.merge.rules.DeleteMergeRule;
import org.tura.platform.repository.spa.merge.rules.InsertMergeRule;
import org.tura.platform.repository.spa.merge.rules.MergeRule;
import org.tura.platform.repository.spa.merge.rules.UpdateMergeRule;

public enum OperationLevel {
	LINK(null,0),
	UNLINK(null,0),
	CREATE(new InsertMergeRule(),0),
	LOAD(new InsertMergeRule(),0),
	UNLOAD(null,0),
	DISCONNECT(null,100),                           //1
	INSERT(new InsertMergeRule(),200),       //2
	UPDATE( new UpdateMergeRule(),300),  //3
	DELETE( new DeleteMergeRule(),300),    //3
	CONNECT(null,400),                                 //4
	OPERATION(null,500),                              //5
	NOTIFICATION(null,900),
	NOP(null,1000);                              
	
	private MergeRule rule;
	private int priority;
	
	
	public int getPriority() {
		return priority;
	}

	OperationLevel(MergeRule rule,int priority){
		this.rule = rule;
		this.priority = priority;
	}

	public MergeRule getRule() {
		return rule;
	}
	

}
