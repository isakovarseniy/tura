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
import {InputText} from 'primereact/inputtext';

export class TOutputText extends TuraComponent {

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
            <InputText  key={this.id} id={this.id} value={this.state.value} style={this.state.style} className={this.state.className} readOnly={true}  />


        );

    }

    componentPreProcessSate( obj){
        if ( obj.value === null){
            obj.value = "";
        }
        return new Transformation().stylePreProcessor(obj);
    }



    componentPostProcessState( obj){
        if ( obj.value === ""){
            obj.value = null;
        }
        return new Transformation().stylePostProcessor(obj);
    }



}
