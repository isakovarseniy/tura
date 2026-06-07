/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.dsl;

public abstract class HealthCheck {

    public int rpt;

    public abstract int call() throws Exception;

    public HealthCheck(int rpt ){
        this.rpt = rpt;
    }

    public Object execute() {
        int success = 0;
        int repeats = rpt;
        if (repeats == 0) {
            repeats = 10;
        }

        for (int i = 0; i < repeats; i++) {
            try {
            	System.out.print( "Attemppt " + i+" " );

                int exitCode = call();
                if (exitCode == 0) {
                	System.out.println("Success "+success);
                    success++;
                }else{
                	System.out.println("Error ");
                    success = 0;
                }

                if (exitCode == 0 && success == 3) {
                    return 0;
                }

                Thread.sleep(2000);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return -1;

    }


}
