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

package org.tura.platform.repository.core;

import java.io.Serializable;

public abstract class TransactionAdapter  implements Serializable{
	
	private static final long serialVersionUID = -6398776160198075437L;

	protected abstract void executeBeginTransaction() throws Exception;
	protected abstract void executeCommitTransaction() throws Exception;
	protected abstract void executeRollbackTransaction() throws Exception;
	
	@SuppressWarnings("unused")
	private Registry registry;

	public TransactionAdapter(Registry registry ){
		this.registry = registry;
	}
	
	public void begin() throws Exception{
		sendEvent(new BeforeBeginTransaction());
		executeBeginTransaction();
		sendEvent(new AfterBeginTransaction());
	}
	
	public void commit() throws Exception{
		sendEvent(new BeforeCommitTransaction());
		executeCommitTransaction();
		sendEvent(new AfterCommitTransaction());
	}
	

	public void rollback() throws Exception{
		sendEvent(new BeforeRollbackTransaction());
		executeRollbackTransaction();
		sendEvent(new AfterRollbackTransaction());
	}

	private void sendEvent( RepositoryEvent event) throws Exception{
		
	}

	
}
