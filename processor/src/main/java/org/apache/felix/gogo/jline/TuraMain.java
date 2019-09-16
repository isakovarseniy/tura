/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.apache.felix.gogo.jline;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import org.apache.felix.gogo.jline.Shell.Context;
import org.apache.felix.gogo.jline.ext.ExtensionService;
import org.apache.felix.gogo.runtime.CommandProcessorImpl;
import org.apache.felix.gogo.runtime.threadio.ThreadIOImpl;
import org.apache.felix.service.command.CommandSession;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class TuraMain {

    public static void main(String[] args) throws IOException {
        try (Terminal terminal = TerminalBuilder.builder()
                .name("gogo")
                .system(true)
                .nativeSignals(true)
                .signalHandler(Terminal.SignalHandler.SIG_IGN)
                .build()) {
            ThreadIOImpl tio = new ThreadIOImpl();
            tio.start();
            try {
                CommandProcessorImpl processor = new CommandProcessorImpl(tio);
                Context context = new MyContext();
                Shell shell = new Shell(context, processor, tio, null);
                processor.addCommand("gogo", processor, "addCommand");
                processor.addCommand("gogo", processor, "removeCommand");
                processor.addCommand("gogo", processor, "eval");
                processor.addConverter(new BaseConverters());
                register(processor, new Builtin(), Builtin.functions);
                register(processor, new Procedural(), Procedural.functions);
                register(processor, new Posix(processor), Posix.functions);
                register(processor, shell, Shell.functions);
                TuraCommandsInit.initProcessor(processor);                
                ExtensionService.getInstance().initExtension(processor);
                
                InputStream in = new FilterInputStream(terminal.input()) {
                    @Override
                    public void close() {
                    }
                };
                OutputStream out = new FilterOutputStream(terminal.output()) {
                    @Override
                    public void close() {
                    }
                };
                CommandSession session = processor.createSession(in, out, out);
                session.put(Shell.VAR_CONTEXT, context);
                session.put(Shell.VAR_TERMINAL, terminal);
                session.put(Shell.VAR_COMPLETIONS, new HashMap<>());
 
                try {
                    String[] argv = new String[args.length + 1];
                    argv[0] = "--login";
                    System.arraycopy(args, 0, argv, 1, args.length);
                    shell.gosh(session, argv);
                } catch (Exception e) {
                    Object loc = session.get(".location");
                    if (null == loc || !loc.toString().contains(":")) {
                        loc = "gogo";
                    }

                    System.err.println(loc + ": " + e.getClass().getSimpleName() + ": " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    session.close();
                }
            } finally {
                tio.stop();
            }
        }
    }

    static void register(CommandProcessorImpl processor, Object target, String[] functions) {
        for (String function : functions) {
            processor.addCommand("gogo", target, function);
        }
    }

    private static class MyContext implements Context {

        public String getProperty(String name) {
            return System.getProperty(name);
        }

        public void exit() {
            System.exit(0);
        }
    }
}