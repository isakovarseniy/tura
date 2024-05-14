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


export class MainMapperLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
        <div className="p-d-flex p-flex-column">
            {this.getElement("7e81b09c-ab55-4a34-863f-59848b6f58a6")}
            <div className="p-d-flex">
                <div style={{width:'40%'}} className="p-mr-3 p-mb-3">{this.getElement("1071f90f-642d-4b50-91a6-6b9b8d588cf8")}</div>
                <div className="p-mr-3 p-mb-3">{this.getElement("1bcd8a2c-78f1-4a72-b7d5-a2aa5ffed7df")}</div>
                <div style={{width:'40%'}} className="p-mr-3 p-mb-3">
                    <div className="p-d-flex p-flex-column">
                    {this.getElement("94a0143d-c5e5-4172-9043-a92d5d3f77e8")}
                    {this.getElement("18ee2cee-7882-4347-beff-3f03692a39f7")}
                    </div>
                </div>
            </div>
        </div>

    );
  }
}