/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import uuid from "uuid/v1";

export class SharedContext{

    constructor(){
        this.ifIFrame  = this.ifIFrame.bind(this);        
    }

    initContext(){
        if ( this.ifIFrame() !== true){
            sessionStorage.removeItem("tura.shared.context");
            sessionStorage.setItem("tura.shared.sessionId",uuid());
            sessionStorage.setItem("tura.critical.section",0);
        }
    }

    setSharedContext(sharedCtx){
        if ( typeof sharedCtx === "undefined" || sharedCtx === null){
            return;
        }
        sessionStorage.setItem("tura.shared.context",sharedCtx);
    }

    getSharedContext(){
        var sharedCtx =  sessionStorage.getItem("tura.shared.context");
        if  (typeof sharedCtx === "undefined" ){
            return null;
        }
        return sharedCtx;
    }

    getSharedSessionId(){
        return sessionStorage.getItem("tura.shared.sessionId");
    }



    ifIFrame(){
        if ( typeof window.isMicroUIFrame  !== "undefined"  ){
         return true;
        } 
        else {
            return false;
        }
    }

    startCriticalSection(){
        var criticalSection = sessionStorage.getItem("tura.critical.section");
        if ( criticalSection > 0){
            return false;
        }
        criticalSection++;
        sessionStorage.setItem("tura.critical.section",criticalSection);
        return true;
    }

    endtCriticalSection(){
        var criticalSection = sessionStorage.getItem("tura.critical.section");
        if ( criticalSection > 0){
            criticalSection--;
            sessionStorage.setItem("tura.critical.section",criticalSection);
            return true;
        }
        return false;
    }    

}