package sales.analyzer.commons;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.infinispan.manager.EmbeddedCacheManager;

@ApplicationScoped
public class CacheProducer {
  
   @Produces
   @Resource(name="userPreferencesCache")
   private EmbeddedCacheManager  cacheManager;
  
}