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

import org.tura.platform.object.model.RepositoryException;
import org.tura.platform.repository.Repository;
import org.tura.platform.tura.simple.domain.provider.SimpleTuraProvider;

public class TestingRepositoryProvider extends SimpleTuraProvider{

	
    private List<Object> list;
    
	public TestingRepositoryProvider(Repository repository,List<Object> list) {
		super(repository);
    	this.list = list;
	}

	
	public void update(Object requerst, String objectType) throws RepositoryException {
		list.add(new Object[]{requerst,'U'});
		super.update(requerst,objectType);

	}

	public void insert(Object requerst, String objectType) throws RepositoryException {
		list.add(new Object[]{requerst,'I'});
		super.insert(requerst,objectType);
	}

	public void remove(Object requerst, String objectType) throws RepositoryException {
		list.add(new Object[]{requerst,'R'});
		super.remove(requerst,objectType);
	}
	
	
	
	
}
