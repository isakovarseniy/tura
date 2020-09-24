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


export class TReactPolling extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            isPolling: false
        };
        this.onPoll=this.onPoll.bind(this);
        if ( typeof this.props.interval === "undefined" || this.props.interval === null){
            this.props.interval = 3000;
        }

    }

    stopPolling() {
        if (this._ismounted) {
            const isPolling = false;
            if (this.poll) {
                clearTimeout(this.poll);
                this.poll = null;
            }
            this.setState({
                isPolling
            });
        }
    }

    startPolling() {
        if( this.state.isPolling){
            return;
        }
        this.setState({
            isPolling: true
        });
        this.runPolling();
    }

    onPoll(){
        this.props.onPoll();
        this.runPolling();
    }


    runPolling() {
        this.poll = setTimeout( this.onPoll, this.props.interval);
    }

    componentDidMount() {
        this._ismounted = true;
        if ( typeof this.props.start !== "undefined" && this.props.start === "auto"){
            this.startPolling();
        }
    }

    componentWillUnmount() {
        this.stopPolling();
        this._ismounted = false;
    }

    render() {
        return(
            <></>
        )
    }

}

