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
import {DataView} from "primereact/dataview";
import {EventExecuter} from "../core/EventExecutor";
import {Transformation} from "../core/Transformation";


export class TDataScroller extends TuraComponent {

    constructor(props) {
        super(props);
        this.itemTemplate = this.itemTemplate.bind(this);
        this.onPage = this.onPage.bind(this);
        this.listLayout = this.listLayout.bind(this);
        this.gridLayout = this.gridLayout.bind(this);
    }


    itemTemplate(row, layout) {
        if ( row === null){
            return(
                <>
                </>
            );
        }

        if (layout === 'list') {
            return (
                   this.listLayout(row)
            );
        }
        if (layout === 'grid') {
            return (
                    this.gridLayout(row)
            );
        }
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

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }

        return (
            <DataView id={this.id} rows={this.state.rows} value={this.state.values}  paginator={true} style={this.state.style}  layout={this.state.layout} className={this.state.className}  itemTemplate={this.itemTemplate}
                      onPage={this.onPage} lazy={true} totalRecords={this.state.totalRows} first={this.state.first}

            >
                {this.props.children}
            </DataView>
        );

    }


    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }


    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }





}