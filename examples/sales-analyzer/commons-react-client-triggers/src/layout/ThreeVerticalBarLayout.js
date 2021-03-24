/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

export class ThreeVerticalBarLayout{


    constructor( leftMenuId) {
        this.leftMenuId = leftMenuId;
    }

    getLayout( children,contextManager, state){

        let ch = React.Children.toArray(children);
        let left =[];
        let center =[];

        for ( var i = 0, j = 0; i< ch.length;i++  ){
            if ( ch[i].props.id === this.leftMenuId  ){
                left.push(ch[i]);
            }else{
                center.push(ch[i]);
            }
        }
        return (
            <div className="p-grid">
                <div className="p-col-fixed" style={{width:'300px'}}>{left}</div>
                <div className="p-col-fixed" style={{width:'1100px'}}>{center}</div>
                <div className="p-col"></div>
            </div>

        );

    }

}
