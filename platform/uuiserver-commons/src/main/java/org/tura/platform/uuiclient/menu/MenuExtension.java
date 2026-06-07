/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.uuiclient.menu;

import java.util.HashMap;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.spi.CreationalContext;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.inject.spi.Extension;
import jakarta.enterprise.inject.spi.ProcessBean;

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
