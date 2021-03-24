/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import {registry} from "../plugin/Registry";

export class TImage extends TuraComponent {

    constructor(props) {
        super(props);
    }


    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }
        let externalLayoutManager = registry.getComponentLayoutManager(this.id);
        if ( externalLayoutManager !== null && typeof externalLayoutManager !== "undefined" ){
            return externalLayoutManager.getLayout(this.props.children, this.contextManager, this.state,this);
        }

        return (
            <img id={this.id} src={this.state.value} style={this.state.style} className={this.state.className} />
        );

    }

    componentPostProcessState( obj){
        obj.style = JSON.stringify(obj.style);
        if (obj.style  === "{}"){
            obj.style="";
        }

        return obj;
    }

    componentPreProcessSate( obj){
        if ( obj.style === ""){
            obj.style = {};
        }

        return obj;
    }


}