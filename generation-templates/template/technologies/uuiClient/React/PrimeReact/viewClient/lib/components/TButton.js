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
import {Button} from 'primereact/button';
import {EventExecuter} from "../core/EventExecutor";
import {registry} from "../plugin/Registry";
import {Transformation} from "../core/Transformation";

export class TButton extends TuraComponent {

    constructor(props) {
        super(props);
        this.handleClick = this.handleClick.bind(this);

    }

    handleClick(e){
        let eventPreClick = this.getEvent('react.preClick');
        let eventOnClick = this.getEvent('react.onClick');



        let result = true;
        if ( typeof eventPreClick !== "undefined" && eventPreClick !== null){
            this.setRowKey(eventPreClick);
            result =  new EventExecuter(eventPreClick, this.contextManager ).run(this,e);
        }
        if ( result && typeof eventOnClick !== "undefined" && eventOnClick !== null){
            this.setRowKey(eventOnClick);
            new EventExecuter(eventOnClick, this.contextManager ).run(this,e);
        }
    }

    setRowKey(event){
        if ( typeof this.props.rowkey !== "undefined"){
            let rowkeyPrm = this.getParameter(event,"rowkey");
            if( rowkeyPrm === null ){
                event.parameters.push({"parameter":"rowkey","value":this.props.rowkey });
            }else{
                rowkeyPrm.value = this.props.rowkey;
            }
        }
    }


    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        let externalLayoutManager = registry.getComponentLayoutManager(this.id);
        if ( externalLayoutManager !== null && typeof externalLayoutManager !== "undefined" ){
            return externalLayoutManager.getLayout(this.props.children, this.contextManager, this.state, this);
        }


        return (
            <Button id={this.id}  onClick={this.handleClick}  label={this.state.label}  icon={this.state.icon} style={this.state.style}
                    className = {this.state.className}>
            </Button>

        );

    }

    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }

    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }


}
