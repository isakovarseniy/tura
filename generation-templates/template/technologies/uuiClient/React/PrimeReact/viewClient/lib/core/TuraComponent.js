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
import {registry} from "../plugin/Registry";
import {EventExecuter} from "./EventExecutor";
import {Transformation} from "../core/Transformation";

export class TuraComponent extends  React.Component {

    constructor(props) {
        super(props);
        this.id = props.id;
        this.message = props.message;
        this.contextManager = props.contextManager;
        this.dependId = null;
        if (typeof props.dependId !== 'undefined'){
            this.dependId = props.dependId;
        }

        this.initializeMainState = this.initializeMainState.bind(this);
        this.menuOnClick = this.menuOnClick.bind(this);
        this.getState = this.getState.bind(this);

        var newState = props.contextManager.getState(this.id,this.dependId) ;
        if ( typeof newState !== "undefined" && newState != null){
            this.state = this.preProcessSate(newState);
        }else{
            this.state = {
                rendered:false
            };
        }
    }

    componentDidMount() {
        this.contextManager.addRegistercontext(this.id,this.dependId,this);
        var newState = this.props.contextManager.getState(this.props.id,this.dependId) ;
        if ( typeof newState !== "undefined" && newState != null){
            this.setState(this.preProcessSate(newState));
        }

    }

    componentWillReceiveProps(nextProps){
        let updateState = false;
        if ( this.id !== nextProps.id){
            updateState = true;
        }

        if ( this.dependId !== null && typeof nextProps.dependId !== "undefined" && this.dependId !== nextProps.dependId){
            updateState = true;
        }

        if ( nextProps.rowkey !== null && typeof nextProps.rowkey !== null && this.props.rowkey !== null && typeof this.props.rowkey !== "undefined"
           && nextProps.rowkey !== this.props.rowkey){
            updateState = true;
        }

        if (updateState  === true){
            this.contextManager.removeRegistercontext(this.id,this.dependId);
            this.id = nextProps.id;
            this.dependId = nextProps.dependId;
            var newState = this.contextManager.getState(this.id,this.dependId) ;
            if ( typeof newState !== "undefined" && newState != null){
                this.setState(this.preProcessSate(newState));
            }else{
                this.setState({
                    rendered:false
                });
            }
            this.contextManager.addRegistercontext(this.id,this.dependId,this);
        }
    }


    componentWillUnmount(){
        this.contextManager.removeRegistercontext(this.id,this.dependId);
    }

    initializeMainState(obj,uuid){
        this.dataObject = obj;
        if ( typeof this.state.uuid === "undefined" || this.state.uuid !== uuid){
            this.setState(this.preProcessSate(this.dataObject));
        }

    }

    getEvent( code){
        let events = this.state.events;
        return this.getEventFromState(events,code);
    }

    getEventFromState( events,code ){
        if ( typeof events !== "undefined" && events !== null){
            for( let i = 0; i< events.length; i++){
                let event = events[i];
                if( code === event.event ){
                    return event;
                }
            }
        }
        return null;
    }



    getParameter( event, paramName){
        for ( let i = 0 ; i < event.parameters.length;i++ ){
            let param = event.parameters[i];
            if ( paramName === param.parameter){
                return param;
            }
        }
        return null;
    }


    getState(){
        let clonedState = JSON.parse(JSON.stringify(this.state));
        return this.postProcessState(clonedState );
    }

    getStateWithoutCloning(){
        return this.state;
    }


    preProcessSate( state ){
        var preProcessor = registry.getStatePreProcessorByComponentId(this.id);
        if ( preProcessor !== null && typeof preProcessor !== "undefined"){
            return preProcessor.process(state);
        }
        return this.componentPreProcessSate(state);
    }

    postProcessState( state ){
        var postProcessor = registry.getStatePostProcessorByComponentId(this.id);
        if ( postProcessor !== null && typeof postProcessor !== "undefined"){
            return postProcessor.process(state);
        }
        return this.componentPostProcessState(state);
    }


    componentPreProcessSate( state){
        return state;
    }

    componentPostProcessState( state){
        return state;
    }


    menuModelUpdate( model ){
        if ( model !== null && typeof model !== "undefined" ){
            if ( typeof  model.items !== "undefined"){
                for ( let i = 0; i< model.items.length ; i++){
                    let item =  model.items[i];
                    new Transformation().stylePreProcessor(item);
                    this.menuModelUpdate(item);
                }
            }
        }
        if ( typeof model.events != "undefined" && model.events !== null){
            model.command = this.menuOnClick;
        }
    }


    menuOnClick(e){
        let eventPreClick = this.getEventFromState(e.item.events,'react.preClick');
        let eventOnClick = this.getEventFromState(e.item.events,'react.onClick');

        let result = true;
        if ( typeof eventPreClick !== "undefined" && eventPreClick !== null){
            result =  new EventExecuter(eventPreClick, this.contextManager ).run(this,e);
        }
        if ( result && typeof eventOnClick !== "undefined" && eventOnClick !== null){
            new EventExecuter(eventOnClick, this.contextManager ).run(this,e);
        }

    }

    getComponentCildren(){
        return React.Children.toArray(this.props.children);
    }


}
