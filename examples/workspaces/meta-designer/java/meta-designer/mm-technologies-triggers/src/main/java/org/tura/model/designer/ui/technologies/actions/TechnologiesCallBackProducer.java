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

package org.tura.model.designer.ui.technologies.actions;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;

import org.tura.model.designer.ui.technologies.mmdesigner.technologies.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.uuiclient.model.CallbackProducer;



@Alternative
@Priority(10)
@Selector("mmdesigner.technologies")
public class TechnologiesCallBackProducer implements Serializable, CallbackProducer{
    
    private static final long serialVersionUID = 3136401614144775869L;

    @Inject
    ELResolver elResolver;

    private Map<String,Object> map = new HashMap<>();
    
    
    @Override
    public Object getCallBackObject(String id) {
        return map.get(id);
    }

    
    @PostConstruct
    public void init() {
        map.put(IBeanFactory.TECHNOLOGIESTREE, new TechnologiesSelectionTreeTriggers(elResolver));
    }
    
    
}