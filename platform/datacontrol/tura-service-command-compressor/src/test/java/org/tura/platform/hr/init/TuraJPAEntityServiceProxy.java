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
package org.tura.platform.hr.init;

import java.util.List;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.persistence.TuraObject;

public class TuraJPAEntityServiceProxy extends TuraJPAEntityService {
    private static final long serialVersionUID = 1L;
    
    private List<Object> list;
    
    
    public TuraJPAEntityServiceProxy(List<Object> list){
    	this.list = list;
    }
    
    
    @Override
	public TuraObject create(String objectClass) throws Exception {
    	try{
    		getEntityManager().getTransaction().begin();
    		
    		return super.create(objectClass);
    	}finally{
       		getEntityManager().getTransaction().commit();
       	    		
    	}
    }    
    
    
	public void update(TuraObject entity) {
		list.add(new Object[]{entity,'U'});
		super.update(entity);

	}

	public void insert(TuraObject entity) {
		list.add(new Object[]{entity,'I'});
		super.insert(entity);
	}

	public void remove( TuraObject entity) throws ClassNotFoundException  {
		list.add(new Object[]{entity,'R'});
		super.remove(entity);
	}
	
}
