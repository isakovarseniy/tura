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


export class ArtifactLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
        <div className="p-d-flex p-flex-column">
            <div style={{fontSize:'25px', marginTop:'10px', marginBottom:'10px'}}>{this.getElement("2cd3b389-424e-480c-a2e7-cebb1cc9ad5c")}</div>
            <div style={{marginTop:'10px'}} className="p-d-flex">
                    <div className="p-mr-3 p-mb-3">{this.getElement("f55fa364-ce9e-4c24-93b9-f55fb6bf0f05")}</div>
                    <div className="p-mr-3 p-mb-3">{this.getElement("d7767853-d074-4c5b-b6bd-35fcf2e4f55e")}</div>
                    <div className="p-mr-3 p-mb-3">
                       <div>
                          <div>{this.getElement("f620a507-4238-4a40-9fb6-ec7b3d30aebb")}</div>
                          <div>{this.getElement("4e1f9900-faba-4964-b7ed-350394eb1ca3")}</div>
                       </div>
                    </div>
            </div>
        </div>

    );
  }
}