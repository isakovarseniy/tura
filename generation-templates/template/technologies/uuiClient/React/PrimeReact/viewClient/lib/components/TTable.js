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
import {DataTable} from "primereact/datatable";
import {Column} from "primereact/column";
import {EventExecuter} from "../core/EventExecutor";
import {ContextMenu} from "primereact/contextmenu";
import {Transformation} from "../core/Transformation";

export class TTable extends TuraComponent{
    editors = new Map();

    constructor(props) {
        super(props);
        this.onPage = this.onPage.bind(this);
        this.onSelectionChange = this.onSelectionChange.bind(this);
        this.onSort = this.onSort.bind(this);
        this.loadingText = this.loadingText.bind(this);
        this.onRowEditorValidator = this.onRowEditorValidator.bind(this);
        this.onRowEditInit = this.onRowEditInit.bind(this);
        this.onRowEditSave = this.onRowEditSave.bind(this);
        this.onRowEditCancel = this.onRowEditCancel.bind(this);
        this.editor = this.editor.bind(this);
        this.onRowSelect = this.onRowSelect.bind(this);
        this.onRowUnselect = this.onRowUnselect.bind(this);
        this.onContextMenu = this.onContextMenu.bind(this);

    }


    addEditor(field, editor){
        this.editors.set(field,editor);
    }


    loadingText() {
        return <span className="loading-text"></span>;
    }

    onPage(e){
        let eventOnPage = this.getEvent('react.onPageEvent');
        if ( typeof eventOnPage !== "undefined" && eventOnPage !== null) {
            let startIndexParameter = this.getParameter( eventOnPage, "startIndex");
            startIndexParameter.value = e.first;

            let pageSizeParameter = this.getParameter( eventOnPage, "pageSize");
            pageSizeParameter.value = e.rows;
            new EventExecuter(eventOnPage, this.contextManager ).run(this);

        }

    }

    onSelectionChange(e){
        this.setState({selected: e.value})
        if ( typeof e.checked === "undefined"){
            let eventonRowSelectionChange = this.getEvent('react.onRowSelectionChange');
            if ( typeof eventonRowSelectionChange !== "undefined" && eventonRowSelectionChange !== null) {
                let selected = this.getParameter( eventonRowSelectionChange, "selected");
                selected.value = e.value;
                new EventExecuter(eventonRowSelectionChange, this.contextManager ).run(this);
            }
        }else{
            let eventonToggle = this.getEvent('react.onToggle');
            if ( typeof eventonToggle !== "undefined" && eventonToggle !== null) {
                let selected = this.getParameter( eventonToggle, "selected");
                selected.value = e.value;
                let toggeled = this.getParameter( eventonToggle, "toggeled");
                toggeled.value = !e.checked;
                new EventExecuter(eventonToggle, this.contextManager ).run(this);
            }
        }
    }


    onSort(e){
        this.setState({sortField: e.sortField, sortOrder: e.sortOrder});
        let eventOnSort = this.getEvent('react.onSort');
        if ( typeof eventOnSort !== "undefined" && eventOnSort !== null) {
            let sortMeta = this.getParameter( eventOnSort, "sortMeta");
            sortMeta.value = {sortField: e.sortField, sortOrder: e.sortOrder};
            new EventExecuter(eventOnSort, this.contextManager ).run(this);
        }

    }

    onRowSelect(e){
        let eventonRowSelection = this.getEvent('react.onRowSelection');
        if ( typeof eventonRowSelection !== "undefined" && eventonRowSelection !== null) {
            let selected = this.getParameter( eventonRowSelection, "selected");
            selected.value = e.data;
            new EventExecuter(eventonRowSelection, this.contextManager ).run(this);
        }
    }

    onRowUnselect(e){
        let eventonRowUnSelection = this.getEvent('react.onRowUnSelection');
        if ( typeof eventonRowUnSelection !== "undefined" && eventonRowUnSelection !== null) {
            let selected = this.getParameter( eventonRowUnSelection, "selected");
            selected.value = e.data;
            new EventExecuter(eventonRowUnSelection, this.contextManager ).run(this);
        }
    }


    onRowEditorValidator(rowData){
        return true;

    }
    onRowEditInit(e){

    }
    onRowEditSave(e){
        this.save(e);
        if ( this.state.modifiedRecords === null){
           this.state.modifiedRecords = [];
        }
        this.state.modifiedRecords.push(e.data.index);

        let onEditAccept = this.getEvent('react.onEditAccept');
        if ( typeof onEditAccept !== "undefined" && onEditAccept !== null) {
            new EventExecuter(onEditAccept, this.contextManager ).run(this);
        }

    }

    onContextMenu(e){
        let eventOnMenuShow = this.getEvent('react.onMenuShow');
        if ( typeof eventOnMenuShow !== "undefined" && eventOnMenuShow !== null){
            new EventExecuter(eventOnMenuShow, this.contextManager ).run(this,e,this);
        }

        this.cm.show(e.originalEvent);
    }

    getContextMenu(){
        return this.state.menu;
    }

    setContextMenu(menu){
        this.setState({
            menu: menu
        });
    }


    onRowEditCancel(e){

    }
    editor(e){
        let ed = this.editors.get(e.field);
        return ed(e);
    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        let dynamicColumns = this.state.columns.map((col,i) => {
            if ( col.type === "multipleSelection"){
                return <Column key="multipleSelection" selectionMode="multiple" style={ {width:"3vw"} }/>;
            }
            if ( col.type === "editColumn"){
                return <Column key="editColumn" rowEditor={true} loadingBody={this.loadingText} style={ col.style }></Column>;
            }
            if ( col.type === "template"){
                return <Column  body={this[col.template]} style={ col.style }></Column>;
            }

            return <Column key={col.field} editor={this.editor}  field={col.field} header={col.header} style={ col.style } sortable={col.sortable} loadingBody={this.loadingText} />;
        });

        let contextMenu = new Array();
        if (this.state.menu !== null ){
            let menuId=this.id+"_contextMenu";
            contextMenu.push( <ContextMenu id={menuId} key={menuId}  model={this.state.menu.items}  ref={el => this.cm = el}/>);
        }
        return (
            <>
                <DataTable id = {this.id} value={this.state.values}  rows={this.state.rows} style={this.state.style}
                           paginator={this.state.paginator} rowsPerPageOptions={this.state.rowsPerPageOptions}
                           paginatorTemplate={this.state.paginatorTemplate} onPage={this.onPage} lazy={true} totalRecords={this.state.totalRows} first={this.state.first}
                           selectionMode={this.state.selectionMode} selection={this.state.selected} onSelectionChange={this.onSelectionChange}
                           sortOrder={this.state.sortOrder}  sortField={this.state.sortField} onSort={this.onSort}
                           scrollable={this.state.scrollable} scrollHeight={this.state.scrollHeight} virtualScroll={true} virtualRowHeight={this.state.scrollRows} onVirtualScroll={this.onPage}
                           editMode="row" rowEditorValidator={this.onRowEditorValidator} onRowEditInit={this.onRowEditInit} onRowEditSave={this.onRowEditSave} onRowEditCancel={this.onRowEditCancel}
                           onContextMenu={this.onContextMenu} onContextMenuSelectionChange={this.onSelectionChange}
                           responsive={true} dataKey="key" onRowSelect={this.onRowSelect} onRowUnselect = {this.onRowUnselect}
                >
                    {dynamicColumns}
                </DataTable>
                {contextMenu}
            </>
        );

    }


    componentPreProcessSate( obj){
        if (obj.menu !== null){
            this.menuModelUpdate(obj.menu);
        }

        obj.columns.map((col,i) => {
            new Transformation().stylePreProcessor(col);
        });


        return new Transformation().stylePreProcessor(obj);
    }

    componentPostProcessState( obj){
        obj.columns.map((col,i) => {
            new Transformation().stylePostProcessor(col)
        });
        return new Transformation().stylePostProcessor(obj);
    }



}
