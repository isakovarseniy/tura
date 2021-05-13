/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import React from 'react';
import {TuraComponent} from "../core/TuraComponent";
import {Menubar} from 'primereact/menubar';
import {Transformation} from "../core/Transformation";

export class TMenu extends TuraComponent {

    constructor(props) {
        super(props);
    }


    render() {
        if (!this.state.rendered) {
            return (
                <></>
            );
        }
        return (

          <Menubar model={this.state.model.items} className = {this.state.className}/>

        );
    }


    componentPreProcessSate( obj){
        obj =  new Transformation().stylePreProcessor(obj);

        if (obj.model !== null){
            this.menuModelUpdate(obj.model);
        }

        if (process.env.REACT_APP_ROUTER_BASE){
           new Transformation().menuPreProcessor(obj.model.items,process.env.REACT_APP_ROUTER_BASE);
        }
        return obj;
    }

}
