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


export class MenueLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
        <div className="p-d-flex p-flex-column">
            <div style={{fontSize:'25px', marginTop:'10px', marginBottom:'10px'}}>
                <div className="p-d-flex">
                    <div className="p-mr-3 p-mb-3">{this.getElement("6107eecb-1cd0-4f2b-9a14-f332936fdb0e")}</div>
                    <div className="p-mr-3 p-mb-3">{this.getElement("068ba6e9-22a1-4008-a2ec-881ef7c9ac30")}</div>
                </div>
            </div>
            {this.getElement("0dfaf413-0013-4f7e-b56f-3976e14d8ecb")}
        </div>

    );
  }
}