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

import java.text.ParseException;
import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.Employee;
import org.tura.platform.hr.objects.jpa.File;

public class FileInit {

	private EntityManager em;

	public FileInit(EntityManager em) {
		this.em = em;
	}

	public void init() throws ParseException {

		createEmploeeFolder(1L, 100L, "File1");
		createEmploeeFolder(2L, 100L, "File2");
		createEmploeeFolder(3L, 100L, "File3");
		createEmploeeFolder(4L, 100L, "File4");

		create(5L, 1L, "File5");
		create(6L, 1L, "File6");
		create(7L, 1L, "File7");

	}

	private void createEmploeeFolder(Long obj_id, Long parentId, String fileName) {
		File file = new File();
		file.setObjId(obj_id);
		file.setFileName(fileName);

		Employee cmp = em.find(Employee.class, parentId);
		cmp.setFile(file);

		em.persist(file);

	}

	private void create(Long obj_id, Long parentId, String fileName) {
		File file = new File();
		file.setObjId(obj_id);
		file.setFileName(fileName);

		File cmp = em.find(File.class, parentId);
		if ( cmp.getFile() == null){
			cmp.setFile(new ArrayList<File>()); 	     
		}
		cmp.getFile().add(file);
		
		em.persist(file);

	}

}
