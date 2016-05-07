package org.tura.platform.tura.complex.domain.livecycle;

import java.util.List;

import org.elsoft.platform.hr.objects.complex.model.FileObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.FileJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class FileObjectLiveCycle extends ObjectLiveCycle{

	public FileObjectLiveCycle(JPAService service) {
		super(service);
	}

	public ObjectLiveCycle getLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(FileObject.class.getName());
	}
	
	@Override
	public Object load(Object persistedObject) throws Exception {
        check(persistedObject,FileJPA.class);
		DomainObject domainObject = loadObject(persistedObject, FileObject.class);

		loadChildren(domainObject,getLiveCycle(), "FileObject", FileJPA.class);		
		return domainObject;
	}	
	

	@Override
	public void save(Object object) throws Exception {
        check(object,FileObject.class);
        FileObject domainObject = (FileObject) object;
        
		saveObject(domainObject,FileJPA.class);
		saveChildren(domainObject, getLiveCycle(), domainObject.getFileObject(), FileJPA.class,FileObject.class);

	}
	
	@Override
	public void remove(Object object) throws Exception {
        check(object,FileObject.class);
        FileObject domainObject = (FileObject) object;

	   	@SuppressWarnings("rawtypes")
		List list = findChildren(domainObject, FileJPA.class);
 
    	if (list.size() != 0 ){
			for (Object obj : list){
				FileObject dObject = new FileObject();
				dObject.setObjId(((PersistenceObject)obj).getObjId());
				getLiveCycle().remove(dObject);
			}
	    }		
    	
		PersistenceObject persistedObject =  findObjectByDomainObject(domainObject, FileJPA.class);		
		if (persistedObject != null)
		getService().remove(persistedObject);
	}
	
}
