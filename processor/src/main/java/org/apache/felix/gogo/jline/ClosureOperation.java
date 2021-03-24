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

package org.apache.felix.gogo.jline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.felix.gogo.runtime.Closure;
import org.apache.felix.gogo.runtime.CommandSessionImpl;
import org.apache.felix.service.command.CommandSession;
import org.apache.felix.service.command.Process;
import org.jline.reader.Candidate;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;
import org.jline.reader.impl.completer.StringsCompleter;

public class ClosureOperation {

    private static List<String> closure = new ArrayList<>();
	
    public void addClosure(String cl) {
    	closure.add(cl);
    }
    
    public void removeClosure(String cl) {
    	closure.remove(cl);
    }
	
    public List<Candidate> __closure_Completer(CommandSession session) {
        ParsedLine line = Shell.getParsedLine(session);
        LineReader reader = Shell.getReader(session);
        List<Candidate> candidates = new ArrayList<>();

        for ( String key : closure) {
        		candidates.add (  new Candidate(key));
        }
        new StringsCompleter ().complete(reader, line, candidates);
        return candidates;
    }
	
    
	public void _main(CommandSession session, String[] argv) {
		if (argv == null || argv.length < 2) {
			throw new IllegalArgumentException();
		}
		Process process = Process.Utils.current();
		try {
	        CommandSessionImpl si = (CommandSessionImpl) session;
	        Map<String, Object> map  =  si.getVariables();

			Closure closure = (Closure) map.get(argv[1]);
			closure.execute(session, null);
			
		} catch (IllegalArgumentException e) {
			process.err().println(e.getMessage());
			process.error(2);
		}catch (RuntimeException e) {
	        throw e; 
		} catch (Exception e) {
		}
	}
 
	
}