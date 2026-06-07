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


export class MainTypesLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
        <div className="p-d-flex">
            <div style={{width:'20%'}} className="p-mr-3 p-mb-3">{this.getElement("31a7502f-0152-42d4-b05e-c054bf7665bd")}</div>
            <div className="p-mr-3 p-mb-3">{this.getElement("05f64341-7fa7-419e-a75b-9d44ebe8959d")}</div>
            <div style={{width:'40%'}} className="p-mr-3 p-mb-3">{this.getElement("6268768d-41c3-46af-bbeb-350b8ae79124")}</div>
        </div>

    );
  }
}