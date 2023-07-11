/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.felix.gogo.jline.utils.OSHelper;


public abstract class HealthCheck extends DockerCommand{

    
    public abstract String getCommand();
    public abstract int getNumberOrRepeats();
    
    
    @Override
    public Object execute() {

        int success = 0;
        int repeats = getNumberOrRepeats();
        if (repeats == 0) {
            repeats = 10;
        }
        
        
        
        for (int i = 0; i < repeats; i++) {
            ExecutorService exErrorService = Executors.newSingleThreadExecutor();
            ExecutorService exInfoService = Executors.newSingleThreadExecutor();
            try {
                System.out.println(String.format("Attempt  %s  success %s", i,success) );
                
                String job = getCommand();

    			String[] args = null;
    		    if ( OSHelper.isWindows()) {
    				args = new String[] { "cmd", "/c", job };
    		    }else {
    				args = new String[] { "/bin/sh", "-c", job };
    		    }
                Process process = new ProcessBuilder(args).start();

                StreamReader infoStreamGobbler = new StreamReader(process.getInputStream());
                StreamReader errorStreamGobbler = new StreamReader(process.getErrorStream());
                exErrorService.submit(errorStreamGobbler);
                exInfoService.submit(infoStreamGobbler);

                int exitCode = process.waitFor();
                if (exitCode != 0  ) {
                    success = 0;
                }
                
                if (exitCode == 0 && success == 3 ) {
                        return null;
                }
                
                if (exitCode == 0 && success < 3 ) {
                    success ++;
                 }
                
                
                Thread.sleep(2000);

            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                if (exInfoService != null)
                    exInfoService.shutdownNow();
                if (exErrorService != null)
                    exErrorService.shutdownNow();
            }
        }
        throw new RuntimeException("Server did not started");
    }

    private class StreamReader implements Runnable {
        private InputStream inputStream;
        private StringBuilder builder = new StringBuilder();

        public StreamReader(InputStream inputStream) {
            this.inputStream = inputStream;
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String inputLine;
            try {
                while ((inputLine = reader.readLine()) != null) {
                    builder.append(inputLine);
                }
            } catch (IOException e) {

            }
        }
        public String toString() {
            return builder.toString();
        }
    }

    
}