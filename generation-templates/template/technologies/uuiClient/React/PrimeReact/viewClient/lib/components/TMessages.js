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
import {TuraComponent} from "../core/TuraComponent";
import {Messages} from "primereact/messages";

export class TMessages extends TuraComponent {

    constructor(props) {
        super(props);
        this.showMessage = this.showMessage.bind(this);
        this.showMessageByCode = this.showMessageByCode.bind(this);
    }

    showMessageByCode(messageCode, detailsCode, severity){
        if ( typeof this.state.messageList !== "undefined"){
            let msgDef = this.state.messageList[messageCode];
            if ( typeof msgDef !== "undefined"){
                this.showMessage(msgDef.message,msgDef.details,severity);
            }else{
                this.showMessage(messageCode,detailsCode,severity);
            }
        }else{
            this.showMessage(messageCode,detailsCode,severity);
        }
    }



    showMessage(message, details, severity){
        this.messages.show({severity: severity, summary: message, detail: details});
    }


    render() {
        return (
            <Messages id={this.id} ref={(el) => this.messages = el}  ></Messages>
        );

    }

}