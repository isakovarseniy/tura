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

import React from "react";
import {TuraComponent} from "../core/TuraComponent";

export class TCanvas extends TuraComponent {

    constructor(props) {
        super(props);

    }


    render() {
        if ( !this.state.rendered ) {
            return (
                <></>
            );
        }


        return (
            <div id={this.id}>
                {this.props.children}
            </div>

        );

    }

}