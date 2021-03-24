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

import axios from "axios";
import {DataUpdateRequest} from "./DataUpdateRequest";
import React from "react";
import {registry} from "../plugin/Registry";
import {EventExecuter} from "./EventExecutor";

export class ContextManager{

    registercontext = new Map();
    arrayOfUpdatedElements = new Map();
    depentedStatesElements = new Map();
    parameters = {};
    initSession = false
    queue = [];
    criticalSection = 0;


    constructor(serverUrl,formSelector, sessionId){
        this.serverUrl = serverUrl;
        this.formSelector = formSelector;
        this.applayResponse = this.applayResponse.bind(this);
        this.comunicationError = this.comunicationError.bind(this);
        this.externalConnectorCallback = null;
        this.sessionId=sessionId;

    }

    startCriticalSection(){
        this.criticalSection++;
        if ( this.criticalSection > 1){
            this.criticalSection--;
            return false;
        }
        return true;
    }
    endtCriticalSection(){
        if ( this.criticalSection > 0){
            this.criticalSection--;
            return true;
        }
        return false;
    }

    queueEvent(event){
        this.queue.push(event);
    }

    unqueueEvent(){
        if (this.queue.length !== 0){
            return this.queue.shift();
        }
        return null;
    }
    clearQueue(){
        this.queue=[];
    }

    getFileUrl(){
        return this.serverUrl+"/file";
    }

    setInit(){
        this.initSession=true;
    }

    addParam(name,value){
        this.parameters[name] = value;
    }

    getParam( name){
        return this.parameters[name];
    }

    addRegistercontext( key, dependId,uielement){
        if ( dependId === null){
            this.registercontext.set(key,uielement);
        }else{
            this.registercontext.set(key+"_"+dependId,uielement);
        }
    }

    removeRegistercontext( key,dependId){
        if ( dependId === null){
            this.registercontext.delete(key);
        }else{
            this.registercontext.delete(key+"_"+dependId);
        }

    }

    getState( id,dependId){
        let newState = this.arrayOfUpdatedElements.get(id);
        if ( typeof dependId !== "undefined" && dependId !== null){
            if ( typeof this.depentedStatesElements.get(id) !== "undefined" && this.depentedStatesElements.get(id) !== null) {
                newState = this.depentedStatesElements.get(id).get(dependId);
            }
        }
        return newState;
    }

    addState(id, newState ){
        this.arrayOfUpdatedElements.set(id, newState );
        this.depentedStatesElements.delete(id);
    }

    addDependentState(id,  dependId,newState ){
        let clonedState = JSON.parse(JSON.stringify(newState));

        let state = this.getState(id);
        if ( state === null){
            throw "Main  state is not defined";
        }
        let dependentStates = this.depentedStatesElements.get(id);
        if ( typeof dependentStates === "undefined" || dependentStates === null){
            dependentStates = new Map();
            this.depentedStatesElements.set(id,dependentStates);
        }
        dependentStates.set(dependId,clonedState);

    }

    setExternalConnectorCallback(externalConnectorCallback){
        this.externalConnectorCallback = externalConnectorCallback;
    }


    getComponent ( key, dependId){
        if ( typeof dependId === "undefined" || dependId === null){
            return this.registercontext.get(key);
        }else{
            return this.registercontext.get(key+"_"+dependId);
        }
    }


    processUpdate( serverAction, topProcessElementIds, topUpdateElementIds,_THIS_ ){
        let req = new DataUpdateRequest();
        let serverActionId = null;
        if (serverAction !== null){
            serverActionId = serverAction.id;
        }
        if ( typeof this.initSession !== "undefined" && this.initSession !== null && this.initSession === true ){
            req.setInitSession();
            this.initSession = false;
        }

        if ( topUpdateElementIds !== null && typeof topUpdateElementIds !== "undefined") {
            req.setTopUpdateElementIds(topUpdateElementIds);
        }
        req.setProcessElements(this.buildProcessElements(topProcessElementIds,_THIS_,serverAction));
        req.setServerActionIds([serverActionId]);
        req.formSelector = this.formSelector;
        req.setParameters(this.parameters);
        req.setSessionId(this.sessionId);
        req.setSessionState(this.sessionState);



        if ( this.externalConnectorCallback === null){
            this.internalConnector(req,this.applayResponse);
        }else{
            this.externalConnectorCallback(req,this.applayResponse);
        }

    }

    internalConnector(req, responseProcessor){
        let trigger = registry.getConnectionConfigurationTrigger(this.formSelector);
        let config = {};
        if ( typeof trigger !== "undefined" && trigger !== null){
            config =trigger.execute("internalConnector");
        }

        axios.post(this.serverUrl,
            req,config).then(
            function (response) {
                let res = response.data['response'];
                if ( typeof res === "undefined"){
                    let data = unescape(response.data);
                    res = data.substr("response=".length);
                    res =res.split('(_)').join(' ');
                    responseProcessor(res);
                }else{
                    res =res[0].split('(_)').join(' ');
                    responseProcessor(res);
                }
            }
        ).catch(
            function (error) {
                console.log(error);
                this.endtCriticalSection();
                this.clearQueue();
                this.comunicationError(error);
            }.bind(this)
        )
    }


    comunicationError(error){
        let comunicationErrorProcessor = registry.getComunicationErrorProcessor();
        if ( typeof comunicationErrorProcessor !== "undefined" && comunicationErrorProcessor !== null){
            comunicationErrorProcessor.execute(error,this);
        }
    }


    buildProcessElements(processElementIds, _THIS_,serverAction){
        let processState = [];
        let hash = [];

        if ( typeof processElementIds === "undefined" && typeof _THIS_ === "undefined"){
            return processState;
        }

        if ( processElementIds !== null && typeof processState !== "undefined") {
            for (let i=0 ; i < processElementIds.length; i++ ) {
                let eId = processElementIds[i];
                let uielement = this.registercontext.get(eId);
                if ( typeof uielement !== "undefined"){
                    processState.push(this.processChildren(uielement, hash,_THIS_,serverAction));
                }
            }
        }
        if (_THIS_ !== null  && typeof _THIS_ !== "undefined" &&  !hash.includes(_THIS_.id)  ){
            processState.push(this.processChildren(_THIS_,hash,_THIS_,serverAction));
        }
        return processState;
    }

    processChildren(component,hash,_THIS_,serverAction){
        let componentId = component.props.id;
        let dependId = component.props.dependId;
        let registeredComponent = this.getComponent(componentId,dependId);
        if ( typeof registeredComponent === "undefined" || registeredComponent === null){
            return;
        }

        let componentState = registeredComponent.getState();

        if (typeof componentState === "undefined" || componentState === null ){
            return;
        }
        let clonedState = JSON.parse(JSON.stringify(componentState));
        hash.push(clonedState.id);
        if ( clonedState.id === _THIS_.id){
            this.fixEvent(clonedState.events,serverAction );
        }
        clonedState.childrens=[];

        let children = null;
        if ( typeof component.getComponentCildren === "undefined"){
            children =  React.Children.toArray(component.props.children);
        }else{
            children = component.getComponentCildren();
        }
        for ( let i = 0 ; i < children.length ; i++) {
            let child = children[i];
            clonedState.childrens.push(this.processChildren(child,hash,_THIS_,serverAction));
        }
        return clonedState;
    }


    applayResponse(response) {
        let obj = JSON.parse(response);

        let uuid = obj.uuid;
        this.sessionState = obj.sessionState;


        if (typeof obj.fatalClientErrors !== "undefined" &&  obj.fatalClientErrors.length !== 0  ){
            this.processClientActions(obj.fatalClientErrors);
            return;
        }


        for ( let i = 0; i < obj.updateElements.length; i++){
            let newState = obj.updateElements[i];
            this.traverseResponse(newState,uuid);
            this.performUpdate(newState,uuid);
        }

        if (typeof obj.executeClientActions !== "undefined" &&  obj.executeClientActions.length !== 0  ){
            this.processClientActions(obj.executeClientActions);
        }

        this.endtCriticalSection();
        let event = this.unqueueEvent();
        if ( event !== null){
            new EventExecuter(event.state,this).run(event.this_,event.args);
        }

    }

    traverseResponse(newState ,uuid){
        newState.uuid = uuid;
        this.addState(newState.id, newState );
        if ( typeof newState.childrens !== "undefined" && newState.childrens !== null ){
            for( let i = 0; i< newState.childrens.length; i++){
                let child = newState.childrens[i];
                this.traverseResponse(child,uuid);
            }
        }
    }

    performUpdate(newState ,uuid){
        var component =  this.registercontext.get(newState.id);
        if ( component !== null && typeof component !== "undefined"){
            component.initializeMainState(newState,uuid);
        }
        if ( typeof newState.childrens !== "undefined" && newState.childrens !== null ){
            for( let i = 0; i< newState.childrens.length; i++){
                let child = newState.childrens[i];
                this.performUpdate(child,uuid);
            }
            newState.childrens = [];
        }
    }

    processClientActions( program){
        for ( let i = 0 ; i < program.length; i++){
            var command = program[i];
            let commandProcessor =  registry.getCommand(command.clazz);
            if(typeof commandProcessor !== "undefined" && commandProcessor !== null ){
                commandProcessor.execute(command,this);
            }

        }

    }

    fixEvent( events,fixEvent ){
        if ( typeof events !== "undefined" && events !== null){
            for( let i = 0; i< events.length; i++){
                let event = events[i];
                if( fixEvent.event === event.event ){
                    events[i] = fixEvent;
                    break;
                }
            }
        }
    }

}

