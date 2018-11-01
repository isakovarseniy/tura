package sales.analyzer.commons;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import sales.analyzer.commons.service.impl.UserPreferencesLoader;

@Alternative
@Priority(0)
public class UserPreferencesLoaderProducer {

	@Inject
	private Repository repository;

	@SuppressWarnings("rawtypes")
	private  List commandStack = new ArrayList<>();

	
	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider() {

		@SuppressWarnings("unchecked")
		@Override
		public void addCommand(Object cmd) throws Exception {
			commandStack.add(cmd);

		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Object> getListOfCommand() throws Exception {
			return commandStack;
		}

		@Override
		public void clear() throws Exception {
			commandStack.clear();

		}

	};
	
	@Produces
	public UserPreferencesLoader getUserPreferencesLoader(InjectionPoint injectionPoint) throws Exception {

		UserPreferencesLoader loader = new UserPreferencesLoader();
		ProxyRepository proxyRepository = new ProxyRepository(repository, stackProvider);
		loader.setRepository(proxyRepository);

		return loader;
	}

}
