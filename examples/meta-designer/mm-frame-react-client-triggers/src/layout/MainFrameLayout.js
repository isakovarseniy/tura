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

import React from "react";
import {DynamicLayout} from "tura-lib/plugin/DynamicLayout";


export class MainFrameLayout extends DynamicLayout{


    getDynamicLayout(children,contextManager, state, _THIS_){

        return (
            <div>
                <div>
                    <div>{this.getElement("turac986a686_6f3b_4d49_b60e_4fe2996f78a6")}</div>
                </div>
                <div className="p-d-flex p-ai-start">
                    <div  style={{height:'98vh'}}>{this.getElement("turad73fad74_d9ac_4f34_abfa_f74675459100")}</div>
                    <div style={{height:'98vh'}}>{this.getElement("tura1eedcb43_5299_46b2_aa0b_4151f222fb10")}</div>
                </div>
            </div>

        );

    }


}