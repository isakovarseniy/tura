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

import {TuraComponent} from "./TuraComponent";
import {registry} from "../plugin/Registry";

export class ValidatedComponent extends TuraComponent{

    constructor(props) {
        super(props);

        if ( typeof props.type !== "undefined" && props.type !== null){
            this.inputTypeValidator = registry.getInputValidatorByType(props.type);
            this.typeValidator =  registry.getValidatorByType(props.type);
        }
        this.componentInputValidator = registry.getInputValidatorByComponent(this.id);
        this.componentValidator = registry.getValidatorByComponent(this.id);

        this.validateForm = this.validateForm.bind(this);

    }


    showMessage(message, details, severity){
        if ( typeof this.message !== "undefined" && this.message !== null){
            let messageComponent = this.contextManager.getComponent(this.message);
            messageComponent.showMessage(message, details, severity);
        }
    }

    showMessageByCode(messageCode, detailsCode, severity){
        if ( typeof this.message !== "undefined" && this.message !== null){
            let messageComponent = this.contextManager.getComponent(this.message);
            messageComponent.showMessageByCode(messageCode, detailsCode, severity);
        }
    }



    validate(e){
        if ( typeof this.inputTypeValidator !== "undefined" && this.inputTypeValidator !==null){
            let result = this.inputTypeValidator(this, e);
            if (result.success !== true ){
                this.showMessageByCode(result.messageCode,result.detailsCode,result.severity);
                return;
            }
        }

        if ( typeof this.componentInputValidator !== "undefined" && this.componentInputValidator !==null){
            let result = this.componentInputValidator(this, e);
            if (result.success !== true ){
                this.showMessageByCode(result.messageCode,result.detailsCode,result.severity);
                return;
            }
        }

        let updateProcessor = registry.getComponentUpdaterByComponentId(this.id);
        if ( typeof  updateProcessor !== "undefined" && updateProcessor !== null ){
            updateProcessor.performChange(this.contextManager,this,e);
        }
        this.performChange(e);
        this.showMessage(null,null,null);

    }


    validateForm(){
        let result = this.validateRequred();
        if ( !result){
            return result;
        }

        if ( typeof this.typeValidator !== "undefined" && this.typeValidator !==null){
            let result = this.typeValidator(this);
            if (result.success !== true ){
                this.showMessageByCode(result.messageCode,result.detailsCode,result.severity);
                return false;
            }
        }

        if ( typeof this.componentValidator !== "undefined" && this.componentValidator !==null){
            let result = this.componentValidator(this);
            if (result.success !== true ){
                this.showMessageByCode(result.messageCode,result.detailsCode,result.severity);
                return false;
            }
        }
        return true;

    }


    validateRequred(){
        if ( this.ifRequred() && (this.getComponentValue() === null || this.getComponentValue()  === "") ){
            this.showMessageByCode("REQUIRED_CODE","REQUIRED_CODE","error");
            return false;
        }
        return true;
    }

    ifRequred(){
        return false;
    }

    getComponentValue(){
        return null;
    }


}