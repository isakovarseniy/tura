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
import {MenueLayout} from "./layout/MenueLayout";
import {MainMapperLayout} from "./layout/MainMapperLayout";


export class InitMMMapperTriggers{

    init( registry,fn){
        registry.addComponentLayoutManager("2594572a-9755-44d4-b453-8733998f82f6",new MenueLayout());
        registry.addComponentLayoutManager("96bc452d-f48d-4e8c-8e70-d247c88316b0",new MainMapperLayout());
        registry.setPluginMode();
    }
}


