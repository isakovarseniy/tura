/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.types.actions;

import static org.tura.model.designer.ui.tree.actions.CommonFunctions.fromd;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.model.designer.Constants;
import org.tura.model.designer.ui.types.mmdesigner.types.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.uuiclient.model.CallbackProducer;


@Alternative
@Priority(10)
@Selector("mmdesigner.types")
public class TypesCallbackProducer implements Serializable, CallbackProducer{
    
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
        map.put(IBeanFactory. TYPEELEMENTSTABLE, new TypeElementGridTriggers(elResolver));

        map.put(IBeanFactory. TYPEOPERATIONSTABLE, new OperationsGridTriggers(elResolver));
        map.put(IBeanFactory. TYPEATTRIBUTESTABLE, new AttributesGridTriggers(elResolver));

        
        map.put(fromd(Constants.TYPE_PROPERTIES_PLUGIN_WIN), new PropertiesWindowPluginModelTriggers(elResolver));
        
    }
    
    
}
