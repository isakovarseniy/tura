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
import {TRenderElementResponsive} from "./TRenderElementResponsive";

export class TLayerHolderResponsive extends TuraComponent {

    constructor(props) {
        super(props);
    }


    render() {
        if ( !this.state.rendered ) {
            console.log('render false - '+this.id);
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
        let w = 12/(columns);

        let columnStyleClass = this.state.columnStyleClass;

        for ( var i = 0, j = 0; i< children.length;i++ ){
            let styleClass = null;
            if ( j +1 <=  columns && columnStyleClass.length > 0 && columnStyleClass.length >= j +1){
                styleClass = columnStyleClass[j];
            }
            lines.push(<TRenderElementResponsive key={i}  index={i}  rlow={12} rmd={w}  rlg={w} styleClass={styleClass} >{this.props.children}</TRenderElementResponsive>);
            if ( j === columns){
                j = 0;
            }else{
                j++;
            }
        }

        return (

            <div className={"p-grid"} style={{width:'100%'}} id={this.id}>
                {lines}
            </div>

        );

    }



}