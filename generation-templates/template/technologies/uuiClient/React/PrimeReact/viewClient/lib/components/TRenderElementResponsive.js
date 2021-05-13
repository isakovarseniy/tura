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

export class TRenderElementResponsive extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            rendered: false
        }

    }

    render() {
        let children = React.Children.toArray(this.props.children);
        let e = children[this.props.index];
        let className = "p-col-"+this.props.rlow + " p-md-"+this.props.rmd +" p-lg-"+ this.props.rlg;
        if ( typeof this.props.styleClass !== "undefined" && this.props.styleClass !== null){
            className = this.props.styleClass;
        }

        return (
            <div key={e.props.id_grid} className={className}>
                {e}
            </div>
        );

    }


}