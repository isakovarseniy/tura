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


export class MainLangLayout extends DynamicLayout{
    getDynamicLayout(children,contextManager, state, _THIS_){
        return (
          <div className="p-d-flex p-flex-column">
              <div style={{fontSize:'25px', marginTop:'10px', marginBottom:'10px'}}>{this.getElement("turabcf1459a_3d70_4b2e_a15e_dfd7afbadf9d")}</div>
              <div style={{width:'30%'}}>
                 {this.getElement("tura6a5f14f7_f0ba_43e3_a81d_06e14461a293")}
              </div>
              <div>
                <div style={{marginTop:'10px'}} className="p-d-flex">
                    <div className="p-mr-2 p-mb-2">{this.getElement("turac08a549e_e851_4291_9bfc_f6dcc8954948")}</div>
                    <div className="p-mr-2 p-mb-2">{this.getElement("tura8f7fef7a_1493_4afb_8631_23f5f45103b1")}</div>
                </div>
              </div>
          </div>

    );
        }
}