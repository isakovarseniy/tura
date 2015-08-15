package org.tura.metamodel.transform.processor;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.hutn.IHutnModule;
import org.tura.metamodel.transform.processor.hutn.TuraHutnModule;
import org.tura.platform.hutn.workflow.Flow;
import org.tura.platform.hutn.workflow.Rule;

public class FlowProcessor {

	public void process(Flow flow, IResource base) {
		for (Rule rule : flow.getRuleFlow()) {
			if (rule.getFilename().indexOf(".hutn") != -1) {
				hutnProcessing(rule.getFilename(), flow.getModel(), base);
			}
			if (rule.getFilename().indexOf(".etl") != -1) {
				etlProcessing(rule.getFilename(), flow.getModel(), base);
			}
		}
	}

	private void hutnProcessing(String hutnFile, String modelFile,
			IResource resource) {

		try {

			final IHutnModule hutnModule = new TuraHutnModule();
			boolean regularProcessing = false;

			IResource parent = resource.getParent();
			URL url = null;
			try {
				 url = new URL(hutnFile);
			} catch (Exception e) {
				 regularProcessing = true;
			}

			File projectLocation = resource.getProject().getLocation().toFile();
			File configDir = new File(projectLocation, resource.getParent()
					.getProjectRelativePath().toString());

			hutnModule.setConfigFileDirectory(configDir);

			File hutn = null;
			boolean isParsed = false;
			
			if ( !regularProcessing && "platform".equals(url.getProtocol())) {
				InputStream in = url.openStream();
				ByteArrayOutputStream buffer = new ByteArrayOutputStream();
				BufferedReader br = null;
				try {
					// Construct BufferedReader from InputStreamReader
					br = new BufferedReader(new InputStreamReader(in));
					PrintStream out = new PrintStream(buffer);

					String line = null;
					while ((line = br.readLine()) != null) {
						out.println(line);
					}
				} finally {
					if (br != null)
						br.close();
					if (in != null)
						in.close();
				}
				isParsed = hutnModule.parse(
						buffer.toString().replaceAll("\\$\\{model\\}",
								modelFile), ((IFile) resource).getLocation()
								.toFile());
			} else {
				hutn = resource.getProject().findMember(hutnFile).getRawLocation().toFile();
				isParsed = hutnModule.parse(hutn);
			}

			if (isParsed) {

				final List<File> generatedFiles = hutnModule.storeEmfModel(
						configDir, // /../ScratchPad/
						modelFile, // eg: Output.model
						null); // eg: Inferred.metamodel

				for (File generatedFile : generatedFiles) {
					LogUtil.logInfo("Generated " + generatedFile);
				}

				parent.refreshLocal(IResource.DEPTH_ONE,
						new NullProgressMonitor());

				// removeMarkersFromModelFile();
				// base.refreshLocal(IResource.DEPTH_ONE, new
				// NullProgressMonitor());

			} else {
				LogUtil.logInfo("Cannot build model because HUTN cannot be parsed.");
			}
		} catch (Exception e) {
			LogUtil.log("Error while building HUTN " + hutnFile, e);
		}

	}

	private void etlProcessing(String hutnFile, String modelFile, IResource base) {

	}
}
