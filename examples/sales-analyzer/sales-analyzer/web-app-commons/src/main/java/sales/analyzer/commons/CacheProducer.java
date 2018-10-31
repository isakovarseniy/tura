package sales.analyzer.commons;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.infinispan.Cache;

@ApplicationScoped
public class CacheProducer {
  
   @SuppressWarnings("rawtypes")
   @Produces
   @Resource(name="userPreferencesCache")
   private Cache  cache;
  
}