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
package org.apache.felix.gogo.jline.ext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

import org.apache.felix.service.command.CommandProcessor;
import org.tura.configuration.dsl.commons.ConfigConstants;

public class ExtensionService {

    private ServiceLoader<ProcessorExtension> loader;
    private static ExtensionService service;
    public static List<String> initScripts = new ArrayList<>();

    private ExtensionService() {
        loader = ServiceLoader.load(ProcessorExtension.class);
    }

    public static ExtensionService getInstance() {
        if (service == null) {
            service = new ExtensionService();
        }
        return service;
    }

    public void initExtension(CommandProcessor processor) throws IOException {

        Iterator<ProcessorExtension> iterator = loader.iterator();
        while (iterator.hasNext()) {
            ProcessorExtension ext = iterator.next();
            ext.initProcessor(processor);
            linkDirectories(ext.getDirMap());
            Collection<String> list = ext.getInitScripts();
            if (list != null) {
                initScripts.addAll(ext.getInitScripts());
            }
        }
    }

    private void linkDirectories(Map<String, String> dirMap) throws IOException {
        for (String key : dirMap.keySet()) {
            Path link = Paths.get(ConfigConstants.TURA_CONFIG_REPOSITORY, key);
            if (link.toFile().exists()) {
                continue;
            }
            Path src = Paths.get(dirMap.get(key));
            Files.createSymbolicLink(link, src);
        }
    }

}