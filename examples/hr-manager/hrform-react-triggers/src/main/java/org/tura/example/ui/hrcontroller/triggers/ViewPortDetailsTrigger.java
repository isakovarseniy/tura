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

package org.tura.example.ui.hrcontroller.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.ViewPortTrigger;
import org.tura.platform.datacontrol.command.ViewPortCommand;
import org.tura.platform.hr.objects.serialization.City;
import org.tura.platform.hr.objects.serialization.Country;
import org.tura.platform.hr.objects.serialization.State;
import org.tura.platform.hr.objects.serialization.Street;

@Alternative
@Priority(10)
@Selector("hrmanager.hrcontroller")
@ViewPortTrigger("details")
public class ViewPortDetailsTrigger extends ViewPortCommand {
     
    @Inject
    ELResolver elResolver;

    @Override
    public Object execute() {
        
        Object obj = elResolver.getValue("#{beanFactoryHrManagerHRController.treeRootCountry.currentObject}");
        if (obj instanceof Country)
            return "/hrmanager/hrcontroller/countryDetails";
        
        if (obj instanceof State)
            return "/hrmanager/hrcontroller/stateDetails";

        if (obj instanceof City)
            return "/hrmanager/hrcontroller/cityDetails";
        
        if (obj instanceof Street)
            return "/hrmanager/hrcontroller/departmentsDetails";

        return this.port;
    }

}