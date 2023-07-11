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
import {Dialog} from "primereact/dialog";
import {Transformation} from "../core/Transformation";

export class TPopupCanvas extends TuraComponent {

    constructor(props) {
        super(props);
        this.onHideEvent=this.onHideEvent.bind(this);

        this.hide=this.hide.bind(this);
        this.show=this.show.bind(this);

    }

    show(){
        this.setState({visible: true});
    }
    hide(){
        this.setState({visible: false});
    }

    onHideEvent(e){
        this.setState({visible: false});
    }

    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }


        return (

            <Dialog id={this.id} closable={false} showHeader={this.state.showHeader} header={this.state.header} visible={this.state.visible} style={this.state.style} className={this.state.styleClass}  modal={this.state.modal} onHide={this.onHideEvent}>
                {this.props.children}
            </Dialog>

        );

    }

    componentPreProcessSate( obj){
        return new Transformation().stylePreProcessor(obj);
    }

    componentPostProcessState( obj){
        return new Transformation().stylePostProcessor(obj);
    }


}