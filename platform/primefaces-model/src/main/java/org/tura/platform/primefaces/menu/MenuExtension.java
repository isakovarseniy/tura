/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.primefaces.menu;

import java.util.HashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessBean;

@ApplicationScoped
public class MenuExtension implements Extension {
	
    private HashMap<String, Bean<?>> menuBeans = new HashMap<>();
 
    public <T> void collect(@Observes ProcessBean<T> event) {
        if (event.getAnnotated().isAnnotationPresent(Menu.class)
            && event.getAnnotated().isAnnotationPresent(RequestScoped.class)) {
        	
        	Menu annotetion = event.getAnnotated().getAnnotation(Menu.class);
        	menuBeans.put(annotetion.value(),event.getBean());
        }
    }
    
    
    public AbsractMenuProvider getMenu(String menu){
    	Bean<?> bean = menuBeans.get(menu);
		BeanManager bm = CDI.current().getBeanManager();
   	
    	CreationalContext<?> ctx = bm.createCreationalContext(bean);
    	AbsractMenuProvider menuProvider = (AbsractMenuProvider) bm.getReference(bean, AbsractMenuProvider.class, ctx);   	
    	
    	return menuProvider;
    }
}
