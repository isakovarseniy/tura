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

import React from "react";
import {DynamicLayout} from "tura-lib/plugin/DynamicLayout";

export class MessageLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
        <div className="p-d-flex p-flex-column">
            <div style={{fontSize:'25px', marginTop:'10px', marginBottom:'10px'}}>{this.getElement("tura015e810d_71f0_43c6_89de_e3ab8fba870e")}</div>
            <div style={{marginTop:'10px'}} className="p-d-flex">
                    <div className="p-mr-3 p-mb-3">{this.getElement("tura6b784a60_36f4_458b_b8d9_f83c2de634e0")}</div>
                    <div className="p-mr-3 p-mb-3">{this.getElement("tura1141f3fe_3d61_4ded_ba41_ada95515bd9a")}</div>
                    <div className="p-mr-3 p-mb-3">{this.getElement("turae1330441_d333_4da2_8c4e_c7bcde58505d")}</div>
            </div>
        </div>

    );
  }
}