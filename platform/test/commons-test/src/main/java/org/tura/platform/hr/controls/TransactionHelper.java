/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.hr.controls;

import javax.persistence.EntityManager;

public class TransactionHelper {

	private static int level = 0;
	
	public static  void beginTransaction(EntityManager em){
		level++;
		if (level == 1){
			em.getTransaction().begin();
		}
	}
	
	public static   void commitTransaction(EntityManager em){
		level--;
		if (level == 0){
			em.getTransaction().commit();
		}
		
	}	
	
	public static  void rollbackTransaction(EntityManager em){
		em.getTransaction().rollback();
	}
	
	
}
