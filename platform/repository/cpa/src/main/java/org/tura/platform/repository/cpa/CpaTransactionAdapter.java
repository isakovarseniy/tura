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

package org.tura.platform.repository.cpa;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.TransactionAdapter;

public class CpaTransactionAdapter   extends TransactionAdapter{

	private static final long serialVersionUID = -502063080373308088L;

	public CpaTransactionAdapter(Registry registry) {
		super(registry);
	}

	@Override
	protected void executeBeginTransaction() throws Exception {
		
	}

	@Override
	protected void executeCommitTransaction() throws Exception {
		
	}

	@Override
	protected void executeRollbackTransaction() throws Exception {
		
	}

}
