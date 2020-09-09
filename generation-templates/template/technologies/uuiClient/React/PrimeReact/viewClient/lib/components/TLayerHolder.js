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

import React from 'react';
import {TuraComponent} from "../core/TuraComponent";
import {TTableRow} from "./TTableRow";
import {Transformation} from "../core/Transformation";

export class TLayerHolder extends TuraComponent {
    constructor(props) {
        super(props);
    }


    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }
        var lines = [];
        let children = React.Children.toArray(this.props.children);

        var columns = 1
        if( typeof this.state.columns !== "undefined" || this.state.columns !== null){
            columns = parseInt(this.state.columns);
        }

        var row =[];
        for ( var i = 0, j = 0; i< children.length;i++  ){
            row.push(i);
            j++;
            if ( j === columns){
                lines.push(<TTableRow key={i} columns={row}>{this.props.children}</TTableRow>);
                row = [];
                j = 0;
            }
        }
        if ( row.length !== 0){
            lines.push(<TTableRow key={999} columns={row}>{this.props.children}</TTableRow>);
        }

        return (

            <table id={this.id} style={this.state.style}>
                <tbody>
                {lines}
                </tbody>
            </table>

        );

    }


    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }

    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }


}