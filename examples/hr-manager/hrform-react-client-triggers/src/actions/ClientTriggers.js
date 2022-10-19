/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import {ClientSystem} from "tura-lib/lib/ClientSystem";

export class ClientTriggers{

    setContextManager(contextManager){
        this.contextManager = contextManager;

    }

    setEvent(event){
        this.event = event;
    }

    setArgs(args){
        this.args = args;

    }

    showParam(){
        let prm = this.contextManager.getParam("param1");
        if ( typeof prm !== "undefined" && prm !== null ){
            window.alert(prm);
        }else{
            window.alert("Parameter is undefined");
        }

    }

    enableUpdateForTree(clientId){
        let  clientSystem = new ClientSystem();
        clientSystem.setContextManager(this.contextManager);
        clientSystem.enableEditModeFotTree(clientId);
    }


    processMenu (){
        var treeComponent = this.args[1];
        var cm = treeComponent.getContextMenu();
        var action = false;

        if ( treeComponent.isEditMode()){
            action = true;
        }
        for ( let item of cm.items){
            item.disabled = action;
        }
        treeComponent.setContextMenu(cm);
    }

}
