/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import {ClientSystem} from "../lib/ClientSystem";

export class DynamicLayout{
    constructor(){
       this.children = []; 
       this.getDynamicLayout = this.getDynamicLayout.bind(this);
       this.getElement = this.getElement.bind(this);
       this.getLayout = this.getLayout.bind(this);
       this.cs = new ClientSystem();
    }

    getElement(elementId_){
       var elementId = this.cs.toVar(elementId_);
       var el =  this.children[elementId];
       delete this.children[elementId];
       return el;
    } 

    getLayout( children,contextManager, state, _THIS_){
        this.children = children;
        var dynn = this.getDynamicLayout(children,contextManager, state, _THIS_);
        var rest = [];
        for (var prop in children) {
            rest.push(this.children[prop]);
        }

        return (
                <>
                {dynn}
                {rest}
                </>

        );

    }
    getDynamicLayout(children,contextManager, state, _THIS_){

    }

}