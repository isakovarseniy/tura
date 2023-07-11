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

import java.io.IOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import org.apache.felix.gogo.jline.utils.OSHelper;

import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.PullImageResultCallback;
import com.github.dockerjava.api.exception.DockerClientException;
import com.github.dockerjava.api.model.PullResponseItem;

import me.tongfei.progressbar.ProgressBar;
import me.tongfei.progressbar.ProgressBarStyle;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "pullImage")
public class DockerPullImage extends DockerCommand {

	@Option(names = "--registry", required = true)
	private String registry;

	@Option(names = "--tag", required = true)
	private String tag;

	private Map<String, ProgressBar> map = new HashMap<>();
	private ProgressBarStyle style;

	@Override
	public Object execute() {
		_init();
		if (findImage(registry + ":" + tag) == null) {
			PullImageCmd req = dockerClient.pullImageCmd(registry).withAuthConfig(dockerClient.authConfig());
			req.withTag(tag);

			style = ProgressBarStyle.COLORFUL_UNICODE_BLOCK;
			if (OSHelper.isWindows()) {
				style = ProgressBarStyle.ASCII;
			}

			PullImageResultCallback res = new PullImageResultCallback() {

				@Override
				public void onNext(PullResponseItem item) {
					if (map.get(item.getId()) == null) {
						if (item.getProgressDetail() != null && item.getProgressDetail().getTotal() != null) {
							ProgressBar bar = new ProgressBar(item.getId(), item.getProgressDetail().getTotal(), 1000,
									System.err, style, "", 1, false, null, ChronoUnit.SECONDS, 0L, Duration.ZERO);
							map.put(item.getId(), bar);
						}
					}
					if (item.getProgress() != null) {
						if (map.get(item.getId()) != null) {
							ProgressBar bar = map.get(item.getId());
							bar.stepTo(item.getProgressDetail().getCurrent());
							bar.setExtraMessage(item.getStatus());
						}
					}

					super.onNext(item);
				}
			};

			try {
				res = req.exec(res);
				try {
					res.awaitCompletion();
				} catch (InterruptedException e) {
					throw new DockerClientException("", e);
				}
			} finally {
				try {
					res.close();
				} catch (IOException e) {
				}

				for (ProgressBar bar : map.values()) {
					bar.close();
				}
			}
		}
		return null;
	}

}
