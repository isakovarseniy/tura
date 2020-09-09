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

import {registry} from "../plugin/Registry";

export class EventExecuter{

    constructor(eventState, contextManager) {
        this.eventState = eventState;
        this.contextManager = contextManager;
    }
    run(_THIS_, ...args) {
        if ( this.eventState.executionSide ==='client' ){
            return this.runLocal(_THIS_,...args);
        }
        if ( this.eventState.executionSide ==='server' ){
            if ( this.contextManager.startCriticalSection()){
                return this.runRemote(_THIS_,...args);
            }else{
                this.contextManager.queueEvent({ "state" :this.eventState ,"this_":_THIS_,"args":args});
                return true;
            }
        }
    }

    runLocal(_THIS_,...args){
        let commandProcessor =  registry.getCommand(this.eventState.id);
        if(typeof commandProcessor !== "undefined" && commandProcessor !== null ){
            return commandProcessor.execute(this.eventState,this.contextManager,...args);
        }
        return false;
    }


    runRemote(_THIS_,...args){
        let processIds = this.eventState.process;
        let topProcessElementIds = [];
        if ( processIds !== null && typeof processIds !== "undefined" ){
            topProcessElementIds = processIds.split(',');
        }

        let updateIds = this.eventState.update;
        let topUpdateElementIds = [];
        if ( updateIds !== null && typeof updateIds !== "undefined"){
            topUpdateElementIds = updateIds.split(',');
        }

        this.contextManager.processUpdate(this.eventState,topProcessElementIds, topUpdateElementIds,_THIS_);

        return true;

    }

}
