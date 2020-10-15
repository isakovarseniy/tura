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

import java.util.HashMap;
import java.util.Map;

import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.model.PullResponseItem;
import com.github.dockerjava.core.command.PullImageResultCallback;

import me.tongfei.progressbar.ProgressBar;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "pullImage")
public class DockerPullImage extends DockerCommand {

	@Option(names = "--registry", required = true)
	private String registry;

	@Option(names = "--tag", required = true)
	private String tag;

	private Map<String, ProgressBar> map = new HashMap<>();

	@Override
	public Object execute() {
		_init();
		if (findImage(registry + ":" + tag) == null) {
			PullImageCmd req = dockerClient.pullImageCmd(registry).withAuthConfig(dockerClient.authConfig());
			req.withTag(tag);
			PullImageResultCallback res = new PullImageResultCallback() {

				@Override
				public void onNext(PullResponseItem item) {
					if (map.get(item.getId()) == null) {
						if (item.getProgressDetail() != null && item.getProgressDetail().getTotal() != null) {
							ProgressBar bar = new ProgressBar(item.getId(), item.getProgressDetail().getTotal());
							map.put(item.getId(), bar);
						}
					}
					if (item.getProgress() != null) {
						if (map.get(item.getId()) != null) {
							ProgressBar bar = map.get(item.getId());
							bar.stepTo(item.getProgressDetail().getCurrent());
						}
					}

					super.onNext(item);
				}
			};

			try {
				res = req.exec(res);
				res.awaitSuccess();
			} finally {
				for (ProgressBar bar : map.values()) {
					bar.close();
				}
			}
		}
		return null;
	}

}
