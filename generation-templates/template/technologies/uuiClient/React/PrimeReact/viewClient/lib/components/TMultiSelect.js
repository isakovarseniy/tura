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
import {MultiSelect} from "primereact/multiselect";
import {ValidatedComponent} from "../core/ValidatedComponent"
import {EventExecuter} from "../core/EventExecutor";
import {Transformation} from "../core/Transformation";

export class TMultiSelect extends ValidatedComponent {

    constructor(props) {
        super(props);
        this.handleChange = this.handleChange.bind(this);


    }

    handleChange(e){
        this.validate(e);
        let eventOnChange = this.getEvent('onChange');
        if ( typeof eventOnChange !== "undefined" && eventOnChange !== null) {
            let newValue = this.getParameter( eventOnChange, "newValue");
            newValue.value = e.target.value;
            new EventExecuter(eventOnChange, this.contextManager ).run(this);
        }

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
            <MultiSelect id={this.id} value={this.state.value} options={this.state.options} onChange={this.handleChange} style={this.state.style} className={this.state.className}
                      placeholder={this.state.initialMessage}>
            </MultiSelect>
        );

    }



    componentPreProcessSate( obj){
        if ( obj.value === null){
            obj.value = [];
        }
        if ( obj.options === null){
            obj.options = [];
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