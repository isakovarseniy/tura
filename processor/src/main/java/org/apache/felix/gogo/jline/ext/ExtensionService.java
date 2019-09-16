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