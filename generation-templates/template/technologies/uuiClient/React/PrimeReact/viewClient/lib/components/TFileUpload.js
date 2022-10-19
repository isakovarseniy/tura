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

import React from 'react';
import {TuraComponent} from "../core/TuraComponent";
import {FileUpload} from "primereact/fileupload";
import {EventExecuter} from "../core/EventExecutor";
import {Transformation} from "../core/Transformation";


export class TFileUpload extends TuraComponent{

    constructor(props) {
        super(props);
        this.onBeforeSend = this.onBeforeSend.bind(this);
        this.externalConnectorCallBack = this.externalConnectorCallBack.bind(this);
        this.onUpload = this.onUpload.bind(this);
    }


    onBeforeSend(e){
        let eventOnFileUpload = this.getEvent('react.onFileUpload');
        let files = this.getParameter( eventOnFileUpload, "files");
        files.value = e.files;

        if ( typeof eventOnFileUpload !== "undefined" && eventOnFileUpload !== null){
            this.contextManager.setExternalConnectorCallback(this.externalConnectorCallBack);
            new EventExecuter(eventOnFileUpload, this.contextManager ).run(this,e);
            this.contextManager.setExternalConnectorCallback(null);

            let formData = e.formData ;
            let arrays = this.string_chop(JSON.stringify(this.requset),1000);
            for ( let i = 0; i< arrays.length; i++){
                let blob = new Blob([arrays[i]], {type : 'application/json'});
                formData.append("turaRequest",blob,i);
            }
        }
    }


    externalConnectorCallBack( request, applyResponseFunction){
        this.requset = request;
        this.applyResponseFunction = applyResponseFunction;
    }

    onUpload(e){
        let response = unescape(e.xhr.response);
        response =response.split('(_)').join(' ');
        response = response.substr("response=".length);
        this.applyResponseFunction(response);
    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        return (
            <FileUpload id={this.id}  name="uploadedFile" style={this.state.style} className={this.state.className} onBeforeSend={this.onBeforeSend} url={this.contextManager.getFileUrl()}
                        onUpload = {this.onUpload} disabled={this.state.disabled}/>
        );

    }

    string_chop =  function(str, size){
        if (str == null) return [];
        str = String(str);
        size = ~~size;
        return size > 0 ? str.match(new RegExp('.{1,' + size + '}', 'g')) : [str];
    }


    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }

    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }

}
