/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import 'primereact/resources/themes/nova/theme.css';
import 'commons-react-client-triggers/style/css/sales-analyzer.css';
import {KeyCloakInitializer} from "commons-react-client-triggers/KeyCloakInitializer";
import  {JwtSetup} from "commons-react-client-triggers/JwtSetup";
import {ThreeVerticalBarLayout} from "commons-react-client-triggers/layout/ThreeVerticalBarLayout";
import {ComunicationErrorProcessor} from "./ComunicationErrorProcessor";


export class InitCaseManagerTriggers{

    init( registry,fn){
        registry.setConnectionConfigurationTrigger("analysis.casemanager",new JwtSetup());
        registry.addComponentLayoutManager("ef4d1512-69ce-48f5-a82f-029fea14a6e2",new ThreeVerticalBarLayout("4371c855-48f3-4118-bacc-952c8633baa9"));
        registry.setComunicationErrorProcessor(new ComunicationErrorProcessor());

        new KeyCloakInitializer().initKeyCloak(fn);
    }
}
