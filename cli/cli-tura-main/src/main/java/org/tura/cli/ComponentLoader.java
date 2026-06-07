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

package org.tura.cli;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;


public class ComponentLoader {
	
	public static List<ClassLoader> mainExtensionsClassLoaders;


	public static void mainExtensionsClassLoader() throws IOException {

		String workingDirectory = ConfigConstants.TURA_MODULES;
		File directory = Paths.get(workingDirectory, "exec", "modules").toFile();
		File[] filesMain = directory.listFiles();
		List<File> list = new ArrayList<>();
		list.addAll(Arrays.asList(filesMain));

		File[] files = new File[list.size()];
		list.toArray(files);

		List<URL> urls = new ArrayList<>();

		mainExtensionsClassLoaders = new ArrayList<>();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			urls.add(file.toURI().toURL());
			URL[] a = new URL[1];
			a[0] = file.toURI().toURL();
			mainExtensionsClassLoaders.add(new URLClassLoader(a));
		}
	}


	
	public  static <T> List<T> findService( ServiceAssertion<T> a , Class<T> service ) {
		List<T> array = new ArrayList<>();
		findServiceExt(  a , service ,array ,mainExtensionsClassLoaders );
		return array;
	}

	
	public  static   <T> void findServiceExt( ServiceAssertion<T> a , Class<T> service , List<T> result,  List<ClassLoader> avaliable) {
		if ( avaliable == null || avaliable.size() == 0) {
			return;
		}
		for ( ClassLoader classLoader : avaliable){
			ServiceLoader <T> loader = ServiceLoader.load(service, classLoader);
			Iterator<T> iterator = loader.iterator();
			while ( iterator.hasNext()){
				T t = iterator.next();
				if ( a.validate(t)){
					result.add(t);
				}
			}
		}
	}	
	
	
}
