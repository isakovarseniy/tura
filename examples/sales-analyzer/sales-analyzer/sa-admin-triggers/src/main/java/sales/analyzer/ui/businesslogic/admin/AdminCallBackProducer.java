/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.ui.businesslogic.admin;

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
@Selector("admin.administration")
public class AdminCallBackProducer implements Serializable, CallbackProducer{
    
    private static final long serialVersionUID = 3136401614144775869L;

    @Inject
    ELResolver elResolver;

    private Map<String,Object> map = new HashMap<>();
    
    public static String ROLE_SELECTION_TABLE = "tura"+"dce48561-8d19-475d-b3dd-fee6f5ce6ea1".replace("-", "_");
    
    public static String  PERMISSION_SELECTION_TABLE =  "tura"+"da7d6000-299d-4f95-a7e7-e9117ebfb94f".replace("-", "_");
    
    public static String   USER_SELECTION_TABLE =    "tura"+ "d8bdfe00-910f-4baa-9c1e-e203c4eeb2a6".replace("-", "_");
    
    @Override
    public Object getCallBackObject(String id) {
        return map.get(id);
    }

    
    @PostConstruct
    public void init() {
        map.put(ROLE_SELECTION_TABLE, new RoleSelectionGridTriggers(elResolver));
        map.put(PERMISSION_SELECTION_TABLE, new PermissionSelectionGridTrigger(elResolver));
        map.put(USER_SELECTION_TABLE, new UserSelectionGridTrigger(elResolver));
    }
    
    
}