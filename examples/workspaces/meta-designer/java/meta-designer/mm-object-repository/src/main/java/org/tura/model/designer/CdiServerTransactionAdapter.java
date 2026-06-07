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

package org.tura.model.designer;

import jakarta.enterprise.context.spi.CreationalContext;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.transaction.Transaction;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.TransactionAdapter;

public class CdiServerTransactionAdapter extends TransactionAdapter {

	private static final long serialVersionUID = -3072200527794563479L;
	private Transaction tx;

	public CdiServerTransactionAdapter(Registry registry) {
		super(registry);
	}

	@Override
	protected void executeBeginTransaction() throws Exception  {
	  tx =  getSession().beginTransaction();
	}

	@Override
	protected void executeCommitTransaction() throws Exception  {
		tx.commit();
	}

	@Override
	protected void executeRollbackTransaction() throws Exception {
		tx.rollback();
	}

	public static Session getSession(){
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<Session> bean = (Bean<Session>) bm.getBeans(Session.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		Session session = (Session) bm.getReference(bean, Session.class, ctx);
		return session;
	}
	
	
	
}
