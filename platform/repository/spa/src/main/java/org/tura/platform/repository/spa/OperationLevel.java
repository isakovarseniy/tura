/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
	UPDATE( new UpdateMergeRule(),100),
	INSERT(new InsertMergeRule(),100),
	DELETE( new DeleteMergeRule(),100),
	OPERATION(null,120),
	CONNECT(null,110),
	DISCONNECT(null,90);
	
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
