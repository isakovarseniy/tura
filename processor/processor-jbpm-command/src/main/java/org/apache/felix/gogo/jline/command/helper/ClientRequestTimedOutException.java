/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command.helper;

import org.guvnor.rest.client.JobResult;

/**
 * Special case of {@link NotSuccessException} to be used in cases when failure was caused by client request timing out.
 */
public class ClientRequestTimedOutException extends NotSuccessException {

	private static final long serialVersionUID = 4614358573956037505L;
	private final int timeout;

    public ClientRequestTimedOutException(JobResult jobResult, int timeout) {
        super(jobResult);
        this.timeout = timeout;
    }

    public int getTimeout() {
        return timeout;
    }
}
