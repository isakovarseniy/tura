/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import 'primereact/resources/themes/nova-light/theme.css';
import 'commons-react-client-triggers/style/css/sales-analyzer.css';
import {KeyCloakInitializer} from "commons-react-client-triggers/KeyCloakInitializer";
import  {JwtSetup} from "commons-react-client-triggers/JwtSetup";
import {ThreeVerticalBarLayout} from "commons-react-client-triggers/layout/ThreeVerticalBarLayout";
import {ComunicationErrorProcessor} from "./ComunicationErrorProcessor";


export class InitEtlControllerTriggers{

    init( registry,fn){
        registry.setConnectionConfigurationTrigger("dataloader.etlcontroller",new JwtSetup());
        registry.addComponentLayoutManager("220a2954-a6e2-432e-8d0c-82916014f494",new ThreeVerticalBarLayout("e75ad417-9da6-474a-b87f-d92584153c10"));
        registry.setComunicationErrorProcessor(new ComunicationErrorProcessor());

        new KeyCloakInitializer().initKeyCloak(fn);
    }
}
