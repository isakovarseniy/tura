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

import React from 'react';
import {TuraComponent} from "../core/TuraComponent";
import {Tree} from "primereact/tree";
import {EventExecuter} from "../core/EventExecutor";
import {Transformation} from "../core/Transformation";
import {ContextMenu} from "primereact/contextmenu";

export class TTree extends TuraComponent {

    constructor(props) {
        super(props);
        this.onExpand = this.onExpand.bind(this);
        this.onCollapse = this.onCollapse.bind(this);
        this.onSelect = this.onSelect.bind(this);
        this.onSelectionChange = this.onSelectionChange.bind(this);
        this.onContextSelectionChange = this.onContextSelectionChange.bind(this);
        this.enableEditMode = this.enableEditMode.bind(this);
        this.disableEditMode = this.disableEditMode.bind(this);
        this.onContextMenu = this.onContextMenu.bind(this);
    }


    onExpand(e){
        this.setState({
            loading: true
        });
        let eventOnNodeExpand = this.getEvent('react.onNodeExpandEvent');
        if (typeof eventOnNodeExpand !== "undefined" && eventOnNodeExpand !== null) {
            let nodeParameter = this.getParameter(eventOnNodeExpand, "node");
            nodeParameter.value = e.node;

            new EventExecuter(eventOnNodeExpand, this.contextManager).run(this);

        }

    }

    getContextMenu(){
        return this.state.menu;
    }

    setContextMenu(menu){
        this.setState({
            menu: menu
        });
    }

    isEditMode(){
        return this.state.editRowMode;
    }

    enableEditMode(){
        this.setState({
            editRowMode: true,
            editRowKey:this.state.contextSelection
        });
    }

    disableEditMode(){
        this.setState({
            editRowMode: false,
            editRowKey:null
        });
    }

    onContextMenu(e){
        let eventOnMenuShow = this.getEvent('react.onMenuShow');
        if ( typeof eventOnMenuShow !== "undefined" && eventOnMenuShow !== null){
            new EventExecuter(eventOnMenuShow, this.contextManager ).run(this,e,this);
        }

        this.cm.show(e.originalEvent);
    }


    onCollapse(e){
        let eventOnNodeCollapse = this.getEvent('react.onNodeCollapseEvent');
        if (typeof eventOnNodeCollapse !== "undefined" && eventOnNodeCollapse !== null) {
            let nodeParameter = this.getParameter(eventOnNodeCollapse, "node");
            nodeParameter.value = e.node;

            new EventExecuter(eventOnNodeCollapse, this.contextManager).run(this);

        }

    }

    onSelect(e){
        let eventOnNodeSelect = this.getEvent('react.onRowSelectionEvent');
        if (typeof eventOnNodeSelect !== "undefined" && eventOnNodeSelect !== null) {
            let nodeParameter = this.getParameter(eventOnNodeSelect, "node");
            nodeParameter.value = e.node;

            new EventExecuter(eventOnNodeSelect, this.contextManager).run(this);

        }

    }

    onSelectionChange(e){
        this.setState({selected: e.value})
    }

    onContextSelectionChange(e){
        this.setState({contextSelection: e.value})
    }

    onRowEditSave(e){
        if ( this.state.modifiedRecords === null){
            this.state.modifiedRecords = [];
        }
        this.state.modifiedRecords.push(e.key);

        let onEditAccept = this.getEvent('react.onEditAccept');
        if ( typeof onEditAccept !== "undefined" && onEditAccept !== null) {
            new EventExecuter(onEditAccept, this.contextManager ).run(this);
        }

    }


    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        let contextMenu = new Array();
        if (this.state.menu !== null ){
            let menuId=this.id+"_contextMenu";
            contextMenu.push( <ContextMenu id={menuId} key={menuId}  model={this.state.menu.items}  ref={el => this.cm = el}/>);
        }

        return (
           <>
             <Tree id={this.id} value={this.state.values}  loading={this.state.loading} nodeTemplate={this.nodeTemplate} lazy={true}
                  onSelect={this.onSelect} onExpand={this.onExpand} onCollapse={this.onCollapse}
                  selectionMode={this.state.selectionMode} selectionKeys={this.state.selected} onSelectionChange={this.onSelectionChange}
                  expandedKeys={this.state.expandedNodes} onToggle={e => this.setState({expandedKeys: e.value})}
                  onContextMenu={this.onContextMenu} onContextMenuSelectionChange={this.onContextSelectionChange}
             />
            {contextMenu}
          </>

        );

    }

    componentPreProcessSate( obj){
        if (obj.menu !== null){
            this.menuModelUpdate(obj.menu);
        }

        return new Transformation().stylePreProcessor(obj);
    }


    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }



}

export class TreeRowEditor{
    constructor(node,tree, componentId,contextManager, property) {
        this.node = node;
        this.tree = tree;
        this.contextManager = contextManager;
        this.componentId = componentId;
        this.property = property;
        this.onSave=this.onSave.bind(this);
        this.onReject=this.onReject.bind(this);
    }

    onSave(e){
        var index = this.node.key;
        var component =null;
        var state = null;
        component = this.contextManager.getComponent(this.componentId, index);
        state = component.getState();
        this.node[this.property] = state.value;
        this.tree.onRowEditSave(this.node);
        this.tree.disableEditMode();
    }

    onReject(e){
        this.tree.disableEditMode();
    }


}
