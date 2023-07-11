/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrcontroller.simpleform;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.uuiclient.model.CallbackProducer;

@Alternative
@Priority(10)
@Selector("hrmanager.simpleform")
public class FullCalendarCallbackProducer implements Serializable, CallbackProducer{
    
    private static final long serialVersionUID = 3136401614144775869L;

    @Inject
    ELResolver elResolver;
    
    private Map<String,Object> map = new HashMap<>();
    
    public static String FULL_CALENDAR = "tura"+"4f2a4681-794b-4e7f-8b90-f48386c3f72b".replace("-", "_");
    
    @Override
    public Object getCallBackObject(String id) {
        return map.get(id);
    }

    
    @PostConstruct
    public void init() {
        map.put(FULL_CALENDAR, new SimpleFormCalendarTriggers(elResolver));
    }
    
    
}