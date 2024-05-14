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

import 'primereact/resources/themes/nova/theme.css';
import 'commons-react-client-triggers/style/css/mm-designer.css';
import {NavigatorLayout} from "./layout/NavigatorLayout";


export class InitMMNavigatorTriggers{

    init( registry,fn){
        registry.addComponentLayoutManager("1600c038-5880-484f-a171-760ba003faf0",new NavigatorLayout("turad3fd44fc_49d3_4b40_9f86_58a8ca611e8c","turae1979725_2720_450b_8ab4_5fec6a83f353","turae9e8ceb3_9083_4037_8704_c9fbf37f71e7"));
        registry.setPluginMode();
    }
}
