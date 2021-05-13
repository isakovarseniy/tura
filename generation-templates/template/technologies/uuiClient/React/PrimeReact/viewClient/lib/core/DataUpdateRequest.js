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

import detectBrowserLanguage from "detect-browser-language";

export class DataUpdateRequest {
    topUpdateElementIds = [];
    processElements=[];
    serverActionIds = [];
    browserLanguage =  detectBrowserLanguage();
    parameters = {};
    initSession = false;
    sessionId = "";
    sessionState="";


    setTopUpdateElementIds(  topUpdateElementIds  ) {
        this.topUpdateElementIds = topUpdateElementIds;
    }

    setProcessElements(processElements ){
        this.processElements = processElements;
    }

    setServerActionIds(serverActionIds){
        this.serverActionIds=serverActionIds;
    }

    setParameters( parameters ){
        this.parameters = parameters;
    }

    setInitSession(){
        this.initSession = true;
    }

    setSessionId(sessionId){
        this.sessionId = sessionId;
    }

    setSessionState(sessionState){
        this.sessionState = sessionState;
    }



}
