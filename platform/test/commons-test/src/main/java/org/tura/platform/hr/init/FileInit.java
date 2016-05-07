package org.tura.platform.hr.init;

import java.text.ParseException;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.jpa.simple.model.FileJPA;

public class FileInit {

	private EntityManager em;

	public FileInit(EntityManager em) {
		this.em = em;
	}

	public void init() throws ParseException {
		em.getTransaction().begin();
	
		create(1L,100L,"File1");
		create(2L,100L,"File2");
		create(3L,100L,"File3");
		create(4L,100L,"File4");
		
		create(5L,1L,"File5");
		create(6L,1L,"File6");
		create(7L,1L,"File7");
		
		em.getTransaction().commit();
		
		
	}
	
	
	
	private void create(Long obj_id, Long parentId, String fileName) {
		FileJPA file = new FileJPA();
		file.setObjId(obj_id);
		file.setParentId(parentId);
		file.setFileName(fileName);
		em.persist(file);

	}
	
}
