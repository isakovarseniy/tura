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


export class StylesLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
        <div className="p-d-flex p-flex-column">
            <div style={{fontSize:'25px', marginTop:'10px', marginBottom:'10px'}}>{this.getElement("c3de5fba-8b57-4894-9034-917d14c2bba5")}</div>
            <div style={{marginTop:'10px'}} className="p-d-flex">
                    <div className="p-mr-3 p-mb-3">{this.getElement("6ca91a4e-7c6b-4cc9-af08-74f8e7c28f85")}</div>
                    <div className="p-mr-3 p-mb-3">{this.getElement("4a3452ee-2f4f-4591-b00a-f6b65fc2becd")}</div>
                    <div className="p-mr-3 p-mb-3">{this.getElement("a1cbe250-f57c-443d-9b1f-9488d693604a")}</div>
            </div>
        </div>

    );
  }
}