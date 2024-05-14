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


export class MessageDetailsLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
              <div>
                <div style={{marginTop:'10px'}} className="p-d-flex">
                    <div className="p-mr-2 p-mb-2">{this.getElement("tura5146c28a_3da3_4d23_9987_246415b81530")}</div>
                    <div className="p-mr-2 p-mb-2">{this.getElement("tura88f84202_d811_4e60_b82b_717c32eaf540")}</div>
                </div>
              </div>

    );
        }
}