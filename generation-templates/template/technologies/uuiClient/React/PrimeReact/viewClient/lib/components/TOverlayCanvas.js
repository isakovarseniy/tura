/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import React from "react";
import {TuraComponent} from "../core/TuraComponent";
import {OverlayPanel} from "primereact/overlaypanel";
import {Transformation} from "../core/Transformation";

export class TOverlayCanvas extends TuraComponent {

    constructor(props) {
        super(props);

        this.hide=this.hide.bind(this);
        this.show=this.show.bind(this);

    }

    show(e){
        this.op.toggle(e);
    }

    hide(){
        this.setState({visible: false});
    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }


        return (

            <OverlayPanel id={this.id}  ref={(el) => this.op = el} style={this.state.style} className={this.state.styleClass} >
                {this.props.children}
            </OverlayPanel>

        );

    }

    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }

    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }


}