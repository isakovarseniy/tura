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

import 'primereact/resources/themes/nova/theme.css';
import 'commons-react-client-triggers/style/css/mm-designer.css';
import {TechTreeLayout} from "./layout/TechTreeLayout";


export class InitMMTechnologiesTriggers{

    init( registry,fn){
        registry.addComponentLayoutManager("922ba6b4-9ffe-479a-aef1-b73deaa66087",new TechTreeLayout("tura37a2d284_eb2b_452d_b501_27d6443ad0ac","turae56e941a_182b_40f9_9225_58d7058de901"));
        registry.setPluginMode();
    }
}
