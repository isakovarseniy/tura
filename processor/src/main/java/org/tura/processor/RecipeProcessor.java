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
package org.tura.processor;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

public class RecipeProcessor {
    private static String GENERATE_COMMAND = "g"; 
    private static String BUILD_COMMAND = "b";

    public static void main(String[] args) {
        
        try {
            BuildCommand bc = new BuildCommand();
            GenerateCommand gc = new GenerateCommand();

            JCommander jc = JCommander
                    .newBuilder()
                    .addCommand(BUILD_COMMAND, bc)
                    .addCommand(GENERATE_COMMAND, gc)
                    .build();

            jc.setProgramName("java -jar processor-<version>-jar-with-dependencies.jar");
            jc.parse(args);
            String cmd = jc.getParsedCommand();
            if ( GENERATE_COMMAND.equals(cmd)) {
                gc.execute();
                return;
            }
            
            if ( BUILD_COMMAND.equals(cmd)) {
                bc.execute();
                return;
            }
            
            jc.usage();
        } catch (ParameterException e) {
            e.getJCommander().usage();

        }
    }
}

