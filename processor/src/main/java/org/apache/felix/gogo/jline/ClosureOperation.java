/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
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
			process.err().println(argv[0] + ": " + e.toString());
			process.error(1);
		}
	}
 
	
}
