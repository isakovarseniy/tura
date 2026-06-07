/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.neo4j.operation;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.transaction.Transaction;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.TransactionAdapter;

public class Neo4jTransactionAdapter extends TransactionAdapter{
	
	private static final long serialVersionUID = -2220550456376050658L;
	private Session session;
	private Transaction tx;
	
	public Neo4jTransactionAdapter (Session session ,Registry registry){
		super(registry);
		this.session = session;
	}
	
	@Override
	protected void executeBeginTransaction() {
		 tx  = session.beginTransaction();
	}

	@Override
	protected void executeCommitTransaction() {
		tx.commit();;
	}

	@Override
	protected void executeRollbackTransaction() {
		tx.rollback();
	}

}
