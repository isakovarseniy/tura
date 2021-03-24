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

import {ThreeVerticalBarLayout} from "./layout/ThreeVerticalBarLayout";
import {DynamicLayerHolder} from "./layout/DynamicLayerHolder";
import {DynamicWindowLayer} from "./layout/DynamicWindowLayer";
import {HrformCmz} from "./custonizer/HrformCmz";
import 'primereact/resources/themes/nova/theme.css';
import './style/css/hrcontrol-style.css';
import {ImageIcon} from "./layout/ImageIcon";
import {TimeLineContent} from "./layout/TimeLineContent";


export class InitHrTriggers{

    init( registry){
        registry.addComponentLayoutManager("a29ed4f1-c30e-4673-8642-04fb7f5260b6",new ThreeVerticalBarLayout());
        registry.addComponentLayoutManager("8e60dfc2-5535-4f84-be55-7a7027438d44",new ImageIcon());
        registry.addComponentLayoutManager("6462b8c2-1ad1-4e1a-8fc9-182f4c1259d2",new TimeLineContent());
        registry.addComponentLayoutManager("d45cc88d-c94d-42ca-b2e3-45c150cf8ef6",new DynamicLayerHolder());
        registry.addComponentLayoutManager("d89a99c9-6bc1-48db-8502-50ad67ee4ffc",new DynamicWindowLayer());

        new HrformCmz().initCustomization(registry);
    }
}
