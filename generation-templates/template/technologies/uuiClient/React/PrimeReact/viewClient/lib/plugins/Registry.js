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

class Registry{
    commands = new Map();
    validatorByType = new Map();
    validatorByComponentId = new Map();
    inputValidatorByType = new Map();
    inputValidatorByComponentId = new Map();
    statePrePocessorByComponentId = new Map();
    statePostPocessorByComponentId = new Map();
    componentUpdatebyComponentId = new Map();
    componentLayoutManager = new Map();
    connectionConfigurationTrigger = new Map();
    elementCustomizer = new Map();


    addElementCustomizer(key, obj){
        this.elementCustomizer.set(key,obj);
    }

    addCommand( key, obj ){
        this.commands.set(key, obj);
    }

    addValidatorByComponentType( key, obj ){
        this.validatorByType.set(key, obj);
    }

    addValidatorByComponentId( key, obj ){
        this.validatorByComponentId.set(key, obj);
    }


    addInputValidatorByComponentType( key, obj ){
        this.inputValidatorByType.set(key, obj);
    }

    addInputValidatorByComponentId( key, obj ){
        this.inputValidatorByComponentId.set(key, obj);
    }

    addStatePrePocessorByComponentId(key, obj ){
        this.statePrePocessorByComponentId.set(key,obj);
    }

    addStatePostPocessorByComponentId(key, obj ){
        this.statePostPocessorByComponentId.set(key,obj);
    }

    addComponentUpdaterByComponentId( key, obj){
        this.componentUpdatebyComponentId.set(key, obj);
    }

    addComponentLayoutManager( key, obj){
        this.componentLayoutManager.set(key, obj);
    }

    getCommand( key ){
        var cmd = this.commands.get( key);
        return this.getObject(cmd);
    }

    getValidatorByType(key){
        var validator = this.validatorByType.get( key);
        return this.getObject(validator);
    }

    getValidatorByComponent(key){
        var validator = this.validatorByComponentId.get( key);
        return this.getObject(validator);
    }

    getInputValidatorByType(key){
        var validator = this.inputValidatorByType.get( key);
        return this.getObject(validator);
    }

    getInputValidatorByComponent(key){
        var validator = this.inputValidatorByComponentId.get( key);
        return this.getObject(validator);
    }

    getStatePostProcessorByComponentId( key){
        var postProcessor = this.statePostPocessorByComponentId.get( key);
        return this.getObject(postProcessor);
    }

    getStatePreProcessorByComponentId( key){
        var preProcessor = this.statePrePocessorByComponentId.get( key);
        return this.getObject(preProcessor);
    }

    getComponentUpdaterByComponentId(key){
        var componentUpdateProcessor = this.componentUpdatebyComponentId.get( key);
        return this.getObject(componentUpdateProcessor);
    }

    getComponentLayoutManager(key){
        var componentLayoutManager = this.componentLayoutManager.get( key);
        return this.getObject(componentLayoutManager);
    }


    getObject ( obj){
        if ( typeof obj !== "undefined" && obj !== null){
            let clone = Object.assign( Object.create( Object.getPrototypeOf(obj)), obj);
            return  clone;
        }else{
            return null;
        }
    }

    setComunicationErrorProcessor(comunicationErrorProcessor){
        this.comunicationErrorProcessor = comunicationErrorProcessor;
    }

    getComunicationErrorProcessor(){
        return this.comunicationErrorProcessor;
    }


    setConnectionConfigurationTrigger(formSelector, trigger){
        this.connectionConfigurationTrigger.set(formSelector,trigger);
    }

    getConnectionConfigurationTrigger(formSelector){
        return this.connectionConfigurationTrigger.get(formSelector);
    }

    getElementCustomizer(key) {
        return this.elementCustomizer.get(key);
    }


}

var registry = new Registry();
export {registry};
