package org.tura.metamodel.transform.processor;

import java.io.BufferedReader;
import org.eclipse.core.resources.IFile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.hutn.IHutnModule;
import org.eclipse.epsilon.hutn.dt.util.WorkspaceUtil;
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


			IResource parent = resource.getParent();
			URL url = new URL(hutnFile);

			hutnModule.setConfigFileDirectory(WorkspaceUtil.getAbsolutePath(parent));

			File hutn = null;
			boolean isParsed = false;
			if ("platform".equals(url.getProtocol())) {
				InputStream in = url.openStream();
				ByteArrayOutputStream buffer = new ByteArrayOutputStream();
				
				//Construct BufferedReader from InputStreamReader
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
			    PrintStream out = new PrintStream(buffer);

			    String line = null;
				while ((line = br.readLine()) != null) {
					out.println(line);
				}
				br.close();				
				isParsed = hutnModule.parse(buffer.toString().replaceAll("\\$\\{model\\}", modelFile), ((IFile)resource).getLocation().toFile() );
			} else {
				hutn = ResourcesPlugin.getWorkspace().getRoot()
						.findMember(hutnFile).getRawLocation().toFile();
				isParsed = hutnModule.parse(hutn);
			}

			if (isParsed) {

				final List<File> generatedFiles = hutnModule.storeEmfModel(
						WorkspaceUtil.getAbsolutePath(parent), // /../ScratchPad/
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
