/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import { TabView, TabPanel } from 'primereact/tabview';
import {Transformation} from "../core/Transformation";
import {EventExecuter} from "../core/EventExecutor";
import {MicroFrontend} from "../core/MicroFrontend";

export class TWindowPlugin extends TuraComponent{

    constructor(props) {
        super(props);
        this.onAddWindow = this.onAddWindow.bind(this);
        this.onRemoveWindow = this.onRemoveWindow.bind(this);

    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }
        var values = this.state.values;
        var lines = [];
        for ( var i = 0; i< values.length;i++  ){
            var row = values[i];
            lines.push(
                <TabPanel key={row.key} header={row.header}>
                     <MicroFrontend libraryURL = {row.libraryURL} application = {row.application} params = {row.params} style={this.state.style}/>
                </TabPanel>
            );
        }
        return (
            <TabView activeIndex={this.state.activeWindow}>
                {lines}
            </TabView>
        );

    }

    onAddWindow(winDesc){
        let eventonAddWindowEvent = this.getEvent('react.onAddWindowEvent');
        if ( typeof eventonAddWindowEvent !== "undefined" && eventonAddWindowEvent !== null) {
            let type = this.getParameter( eventonAddWindowEvent, "type");
            type.value = winDesc.type;
            let params = this.getParameter( eventonAddWindowEvent, "params");
            params.value = winDesc.params;
            new EventExecuter(eventonAddWindowEvent, this.contextManager ).run(this);
        }
    }    

    onRemoveWindow(index){
        let eventonRemoveWindowEvent = this.getEvent('react.onRemoveWindowEvent');
        if ( typeof eventonRemoveWindowEvent !== "undefined" && eventonRemoveWindowEvent !== null) {
            let idx = this.getParameter( eventonRemoveWindowEvent, "index");
            idx.value = index;
            new EventExecuter(eventonRemoveWindowEvent, this.contextManager ).run(this);
        }
    }    


    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }


    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }

}