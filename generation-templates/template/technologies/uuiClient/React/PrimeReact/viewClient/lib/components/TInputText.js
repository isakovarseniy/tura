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
import {InputText} from 'primereact/inputtext';
import {ValidatedComponent} from "../core/ValidatedComponent"
import {Transformation} from "../core/Transformation";
import {EventExecuter} from "../core/EventExecutor";

export class TInputText extends ValidatedComponent {

    constructor(props) {
        super(props);
        this.handleChange = this.handleChange.bind(this);
        this.handleOnBlur = this.handleOnBlur.bind(this);

    }

    handleChange(e){
        this.validate(e);
    }

    performChange( e){
        this.setState({value: e.target.value});
    }

    handleOnBlur(e){
        let eventPreBlur = this.getEvent('react.preBlur');
        let eventOnBlur = this.getEvent('react.onBlur');

        let result = true;
        if ( typeof eventPreBlur !== "undefined" && eventPreBlur !== null){
            result =  new EventExecuter(eventPreBlur, this.contextManager ).run(this,e);
        }
        if ( result && typeof eventOnBlur !== "undefined" && eventOnBlur !== null){
            new EventExecuter(eventOnBlur, this.contextManager ).run(this,e);
        }
    }


    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        return (
            <InputText id={this.id} value={this.state.value}  onChange={this.handleChange} style={this.state.style} className={this.state.className} required={this.state.required} readOnly={this.state.readOnly}
             onBlur={this.handleOnBlur}
            >
                {this.props.children}
            </InputText>
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