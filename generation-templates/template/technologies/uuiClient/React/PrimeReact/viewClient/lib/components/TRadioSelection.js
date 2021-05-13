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
import {ValidatedComponent} from "../core/ValidatedComponent"
import {EventExecuter} from "../core/EventExecutor";
import {RadioButton} from "primereact/radiobutton";
import {Transformation} from "../core/Transformation";


export class TRadioSelection extends ValidatedComponent {

    constructor(props) {
        super(props);
        this.handleChange = this.handleChange.bind(this);

    }

    handleChange(e){
        this.validate(e);
        let eventOnChange = this.getEvent('onChange');
        if ( typeof eventOnChange !== "undefined" && eventOnChange !== null) {
            let newValue = this.getParameter( eventOnChange, "newValue");
            newValue.value = this.translatelabel(this.state.options,e.value);
            new EventExecuter(eventOnChange, this.contextManager ).run(this);
        }

    }

    performChange( e){
        this.setState({value: e.value});
    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }
        let lines = [];
        let grpid= this.id+ "_radiogrp";
        for ( let i=0 ; i < this.state.options.length; i++){
            let rdId = this.id+"_"+i;
            let v = this.state.options[i].label;
            lines.push(
                <div key={i}  className="p-col-12">
                 <RadioButton inputId={rdId} name={grpid} value={v} onChange={this.handleChange} checked={this.state.value === v} disabled={this.state.disabled}/>
                 <label htmlFor={rdId} className="p-radiobutton-label">{v}</label>
                </div>
            );

        }

        return (
            <div id={this.id}>
                {lines}
            </div>
        );

    }


    translatelabel ( options, label ){
        for ( let i=0 ; i < options.length; i++){
            if (options[i].label === label){
                return options[i].value;
            }
        }
        return null;
    }

    translatevalue ( options,value ){
        for ( let i=0 ; i < options.length; i++){
            if (options[i].value === value){
                return options[i].label;
            }
        }
        return null;
    }


    componentPreProcessSate( obj){
        if ( obj.value === null){
            obj.value = "";
        }else{
            obj.value = this.translatevalue(obj.options,obj.value);
        }
        return new Transformation().stylePreProcessor(obj);
    }


    componentPostProcessState( obj){
        if ( obj.value === ""){
            obj.value = null;
        }else{
            obj.value = this.translatelabel(obj.options, obj.value);
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