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
import {TReactPolling} from "./TReactPolling";
import {EventExecuter} from "../core/EventExecutor";
import {Messages} from "primereact/messages";
import {Transformation} from "../core/Transformation";

export class TPoll extends TuraComponent {

    constructor(props) {
        super(props);
        this.onPoll=this.onPoll.bind(this);
        this.onPoll=this.onPoll.bind(this);
        this.stopPolling=this.stopPolling.bind(this);
        this.startPolling=this.startPolling.bind(this);
    }


    onPoll(){
        let eventOnClick = this.getEvent('react.onClick');

        if ( typeof eventOnClick !== "undefined" && eventOnClick !== null){
            new EventExecuter(eventOnClick, this.contextManager ).run(this,null);
        }
    }


    stopPolling(){
        this.polling.stopPolling();
    }

    startPolling(){
        this.polling.startPolling();
    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }
        return (
            <TReactPolling id={this.id+"_poll"} ref={(el) => this.polling = el}  interval={3000} onPoll={this.onPoll} start="false" />
        );

    }

    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }


    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }



}
