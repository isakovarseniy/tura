package org.tura.example.ui.hrmanager;

import org.jboss.arquillian.core.spi.LoadableExtension;

public class LifecycleExtension implements LoadableExtension
{
   @Override
   public void register(ExtensionBuilder builder)
   {
      builder.observer(LifecycleExecuter.class);
   }
}