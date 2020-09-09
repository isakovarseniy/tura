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

import {ThreeVerticalBarLayout} from "./layout/ThreeVerticalBarLayout";
import {HrformCmz} from "./custonizer/HrformCmz";
import 'primereact/resources/themes/nova-light/theme.css';
import './style/css/hrcontrol-style.css';


export class InitHrTriggers{

    init( registry){
        registry.addComponentLayoutManager("a29ed4f1-c30e-4673-8642-04fb7f5260b6",new ThreeVerticalBarLayout());
        new HrformCmz().initCustomization(registry);
    }
}
