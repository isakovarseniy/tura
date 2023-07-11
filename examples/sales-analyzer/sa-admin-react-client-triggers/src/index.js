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

import 'primereact/resources/themes/nova/theme.css';
import 'commons-react-client-triggers/style/css/sales-analyzer.css';
import {KeyCloakInitializer} from "commons-react-client-triggers/KeyCloakInitializer";
import  {JwtSetup} from "commons-react-client-triggers/JwtSetup";
import {ThreeVerticalBarLayout} from "commons-react-client-triggers/layout/ThreeVerticalBarLayout";
import {ComunicationErrorProcessor} from "./ComunicationErrorProcessor";


export class InitSaAdminTriggers{

    init( registry,fn){
        registry.setConnectionConfigurationTrigger("admin.administration",new JwtSetup());
        registry.addComponentLayoutManager("4cdbf7eb-01a5-4076-afe2-55b7aefca072",new ThreeVerticalBarLayout("4a2af076-7353-48b3-8f64-6d5c4bb376f6"));
        registry.setComunicationErrorProcessor(new ComunicationErrorProcessor());

        new KeyCloakInitializer().initKeyCloak(fn);
    }
}
