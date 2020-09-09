/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import React from 'react';
import {TuraComponent} from "../core/TuraComponent";
import {Transformation} from "../core/Transformation";

export class TLabel extends TuraComponent {

    constructor(props) {
        super(props);
    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        return (
            <label id={this.id} style={this.state.style} >{this.state.value}</label>
        );

    }

    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }

    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }


}