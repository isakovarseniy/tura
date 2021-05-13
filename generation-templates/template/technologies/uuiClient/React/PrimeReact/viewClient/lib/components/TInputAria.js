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
import {InputTextarea} from 'primereact/inputtextarea';
import {ValidatedComponent} from "../core/ValidatedComponent"
import {Transformation} from "../core/Transformation";

export class TInputTextAria extends ValidatedComponent {

    constructor(props) {
        super(props);
        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(e){
        this.validate(e);
    }

    performChange( e){
        this.setState({value: e.target.value});
    }



    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        return (
            <InputTextarea id={this.id} rows={this.state.rows}  cols={this.state.cols} value={this.state.value}  onChange={this.handleChange} autoResize={this.state.autoResize} style={this.state.style} >
            </InputTextarea>
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

    ifRequred(){
        if (typeof this.state.required === "undefined"){
            return false;
        }
        return this.state.required;
    }

    getComponentValue(){
        return this.state.value;
    }



}
