/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import {TRenderElement} from "./TRenderElement";

export class TTableRow extends React.Component {

    constructor(props) {
        super(props);

    }


    render() {
        let columns = this.props.columns;

        let lines = [];
        for ( let i = 0; i< columns.length;i++){
            let index= columns[i];

            lines.push(<TRenderElement key={i}  index={index}>{this.props.children}</TRenderElement>);
        }
        return (
            <tr>
                {lines}
            </tr>
        );
    }
}