/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import React from "react";
import {ValidatedComponent} from "../core/ValidatedComponent";

export class ClientSystem{


    setContextManager(contextManager ){
        this.contextManager = contextManager;
    }

    setEvent(event ){
        this.event = event;
    }


    validateForm(componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent === "undefined" || registeredComponent === null){
            return;
        }
        return  this.traverseTreeForValidation(registeredComponent);

    }


    traverseTreeForValidation( component ){
        let validationResult = true;

        let children = React.Children.toArray(component.props.children);
        for ( let i = 0 ; i < children.length ; i++){
            let child = children[i];
            validationResult = this.traverseTreeForValidation(child) && validationResult;
            let component = this.contextManager.getComponent(child.props.id);

            if ( typeof component.validateForm !== "undefined" ){
                let result = component.validateForm();
                if ( !result ){
                    validationResult = false;
                }
            }
        }
        return validationResult;
    }


    cleanForm( componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent === "undefined" || registeredComponent === null){
            return;
        }
        this.traverseTreeForCleaning(registeredComponent);
    }


    traverseTreeForCleaning( component ){
        let validationResult = true;

        let children = React.Children.toArray(component.props.children);
        for ( let i = 0 ; i < children.length ; i++){
            let child = children[i];
            this.traverseTreeForCleaning(child);
            let component = this.contextManager.getComponent(child.props.id);

            if ( component instanceof ValidatedComponent){
                component.showMessage(null,null,null);
            }
        }
    }


    openOverlay(componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent === "undefined" || registeredComponent === null){
            return;
        }
        registeredComponent.show(this.event);
    }



    downloadData(data, fileName, type="text/plain") {
        // Create an invisible A element
        const a = document.createElement("a");
        a.style.display = "none";
        document.body.appendChild(a);

        // Set the HREF to a Blob representation of the data to be downloaded
        a.href = window.URL.createObjectURL(
            new Blob([data], { type })
        );

        // Use download attribute to set set desired file name
        a.setAttribute("download", fileName);

        // Trigger the download by simulating click
        a.click();

        // Cleanup
        window.URL.revokeObjectURL(a.href);
        document.body.removeChild(a);
    }

    downloadFile(url ) {
        // Create an invisible A element
        const a = document.createElement("a");
        a.style.display = "none";
        document.body.appendChild(a);

        // Set the HREF to a Blob representation of the data to be downloaded
        a.href = url;

        // Trigger the download by simulating click
        a.click();

        // Cleanup
        window.URL.revokeObjectURL(a.href);
        document.body.removeChild(a);
    }

    startPolling(componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent === "undefined" || registeredComponent === null){
            return;
        }
        registeredComponent.startPolling();

    }

    stopPolling(componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent === "undefined" || registeredComponent === null){
            return;
        }
        registeredComponent.stopPolling();

    }


    hidepopup ( componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent !== "undefined" && registeredComponent !== null){
            registeredComponent.hide();
        }
    }


    enableEditModeFotTree(componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent !== "undefined" && registeredComponent !== null){
            registeredComponent.enableEditMode();
        }
    }

    disableEditModeFotTree(componentId){
        let registeredComponent = this.contextManager.getComponent(componentId);
        if ( typeof registeredComponent !== "undefined" && registeredComponent !== null){
            registeredComponent.disableEditMode();
        }
    }


}
