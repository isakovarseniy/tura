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

import React from 'react';
import {DynamicLayout} from "tura-lib/plugin/DynamicLayout";

export class PopulLanguageSelector extends DynamicLayout{

    constructor(){
        super();
     }
 
    getDynamicLayout(children,contextManager, state, _THIS_){
        return ( 
            <div className="p-d-flex p-flex-column">
            <div style={{fontSize:'25px', marginTop:'10px', marginBottom:'10px'}}>{this.getElement("tura4460e99f_4a00_4920_8bff_7bcd8b7a858d")}</div>
            <div style={{width:'40vw'}}>
               {this.getElement("tura61cefff5_144b_4fed_bccf_c6e635d4c06b")}
            </div>
            <div>
              <div style={{marginTop:'10px'}} className="p-d-flex">
                  <div className="p-mr-2 p-mb-2">{this.getElement("tura4cc10339_0874_414d_97a5_b78cfcfed563")}</div>
                  <div className="p-mr-2 p-mb-2">{this.getElement("tura2c421962_6235_4ddb_a4a4_3a8351ca2ba8")}</div>
              </div>
            </div>
        </div>

         );
    }

}