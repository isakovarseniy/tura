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

import React from 'react';

export class TRenderElement extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            rendered: false
        }

    }

    render() {
        let children = React.Children.toArray(this.props.children);
        let e = children[this.props.index];

        return (
            <td>
                {e}
            </td>
        );

    }


}