/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

export class BlockerSystem {


    setContextManager(contextManager) {
        this.contextManager = contextManager;
    }

    setEvent(event) {
        this.event = event;
    }


    blockOn( arrayOfComponents ){
        if ( typeof arrayOfComponents === "undefined" || arrayOfComponents === null){
            return;
        }
        for (let i=0 ; i < arrayOfComponents.length; i++ ) {
            var componentId = arrayOfComponents[i];
            let registeredComponent = this.contextManager.getComponent(componentId);
            if ( typeof registeredComponent !== "undefined" && registeredComponent !== null){
                registeredComponent.blockOn();
            }
        }
    }

    blockOff( arrayOfComponents ){
        if ( typeof arrayOfComponents === "undefined" || arrayOfComponents === null){
            return;
        }

        for (let i=0 ; i < arrayOfComponents.length; i++ ) {
            var componentId = arrayOfComponents[i];
            let registeredComponent = this.contextManager.getComponent(componentId);
            if ( typeof registeredComponent !== "undefined" && registeredComponent !== null){
                registeredComponent.blockOff();
            }
        }


    }



}
