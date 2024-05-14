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


export class MainRecipeLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
        <div className="p-d-flex">
            <div style={{width:'20%'}} className="p-mr-3 p-mb-3">{this.getElement("4eee03f2-b43d-4756-a93d-0488386d76fe")}</div>
            <div className="p-mr-3 p-mb-3">{this.getElement("390ca9d7-ab46-42cd-a238-89a1bd496bd0")}</div>
            <div style={{width:'40%'}} className="p-mr-3 p-mb-3">{this.getElement("0bd9b37d-0503-41da-b60c-49a4d41baa46")}</div>
        </div>

    );
  }
}