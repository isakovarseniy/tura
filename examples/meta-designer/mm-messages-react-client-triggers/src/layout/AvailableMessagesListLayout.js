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

export class AvailableMessagesListLayout extends DynamicLayout{

    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
          <div className="p-d-flex p-flex-column" style={{width:'100%'}}>
              <div style={{width:'100%'}}>
                 {this.getElement("turaf85dcc77_cda6_4f77_8e29_d576f6610cd8")}
              </div>
          </div>

    );
        }


}