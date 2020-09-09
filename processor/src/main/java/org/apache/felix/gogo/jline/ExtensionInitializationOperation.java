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

package org.apache.felix.gogo.jline;

import org.apache.felix.gogo.jline.Posix.HelpException;
import org.apache.felix.gogo.jline.ext.ExtensionService;
import org.apache.felix.service.command.CommandSession;
import org.apache.felix.service.command.Process;


public class ExtensionInitializationOperation {

    public void _main(CommandSession session, String[] argv) {
        if (argv == null || argv.length < 1) {
            throw new IllegalArgumentException();
        }
        Process process = Process.Utils.current();
        try {
            String args[] = new String[argv.length - 1];
            System.arraycopy(argv, 1, args, 0, argv.length - 1);
            run(session, process, args);
        } catch (IllegalArgumentException e) {
            process.err().println(e.getMessage());
            process.error(2);
        } catch (HelpException e) {
            process.err().println(e.getMessage());
            process.error(0);
        }catch (RuntimeException e) {
            throw e; 
        } catch (Exception e) {
            process.err().println(argv[0] + ": " + e.toString());
            process.error(1);
        }
    }
    
    protected Object run(CommandSession session, Process process, Object[] argv) throws Exception {
        for (String script : ExtensionService.initScripts ) {
            session.execute("source "+script);
        }
        return null;
    }
    
    
}