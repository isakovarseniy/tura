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

import {ClientSystem} from "../lib/ClientSystem";
import {Transformation} from "../core/Transformation";

export class SwitchWindowCommand{

    execute( cmd, contextManager){
        let clientSystem =  new ClientSystem();
        let path = cmd.target;
        if (process.env.REACT_APP_ROUTER_BASE){
            path = new Transformation().buildUrl(process.env.REACT_APP_ROUTER_BASE , cmd.target) ;
        }
        clientSystem.downloadFile(path);
    }
}
