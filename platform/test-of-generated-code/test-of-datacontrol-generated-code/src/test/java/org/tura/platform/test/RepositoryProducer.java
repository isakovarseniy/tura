package org.tura.platform.test;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.tura.example.ui.commons.producer.EntityManagerHelper;
import org.tura.platform.hr.init.TuraJPAEntityServiceProxy;
import org.tura.platform.repository.Repository;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.simple.domain.provider.SimpleTuraProvider;

@Alternative
@Priority(0)
public class RepositoryProducer {
	
	@Inject
	private EntityManagerHelper emHelper;
	
    @Produces
	public Repository getRepository(InjectionPoint injectionPoint) {

		Repository repository = new Repository();
		SimpleTuraProvider provider = new SimpleTuraProvider(repository);
		JPAService service = new TuraJPAEntityServiceProxy();
		service.setEntityManager(emHelper.getEntityManager());
		provider.setService(service);
		
		return repository;
		
	}

}
