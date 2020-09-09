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

package org.apache.felix.gogo.jline.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.felix.service.command.CommandSession;

import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.core.command.LogContainerResultCallback;

import picocli.CommandLine.Option;

public class DockerLogWatcher extends DockerCommand {

	@Option(names = "--name" , required = true)
	private List<String> names;
	
	private List<Future<Object>> runner = new ArrayList<>();
	private List<ExecutorService> watchers = new ArrayList<>();

	@Override
	public Object execute() {

		for (String cnt : names) {
			ExecutorService watcher = Executors.newSingleThreadExecutor();
			@SuppressWarnings("unchecked")
			Future<Object> f = (Future<Object>) watcher.submit(new LogHandler(cnt,session));
			watchers.add(watcher);
			runner.add(f);
		}
		
		try {
			while (true) {
				try {
					watchers.get(0).awaitTermination(2, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					return null;
				}
			}
		} finally {
			for ( Future<Object> f : runner){
				f.cancel(true);
			}
			for (ExecutorService watcher : watchers){
				watcher.shutdownNow();
			}
		}

	}

	class LogHandler extends DockerCommand implements Runnable {
		String name;

		LogHandler(String name, CommandSession session ) {
			this.name = name;
			this.session = session;
			_init();
		}

		@Override
		public void run() {
			LogContainerCallback callback=null;
			try {
				while (true) {
					Container container = findContainer(name);
					if (container == null || container.getStatus().contains("Exited")) {
						System.out.println(String.format("Container %s -> Waiting for container", name));
						Thread.sleep(2000);
						continue;
					}

					callback = new LogContainerCallback();

					this.dockerClient.logContainerCmd(container.getId()).withStdErr(true)
					         .withStdOut(true)
					         .withTail(10)
							.withFollowStream(true).exec(callback);

					callback.awaitCompletion();
					callback.close();

				}
			} catch (InterruptedException | IOException e) {
				return;
			}finally {
				try {
					if (callback != null ) {
					   callback.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			

		}

	}
	

 class LogContainerCallback extends LogContainerResultCallback {

    @Override
    public void onNext(Frame frame) {
		System.out.print( new String(frame.getPayload()));
    }

}

}
