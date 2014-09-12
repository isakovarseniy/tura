package org.tura.metamodel.hutn.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.epsilon.common.dt.actions.AbstractObjectActionDelegate;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IObjectActionDelegate;
import org.tura.metamodel.commons.JaxbUtils;
import org.tura.metamodel.transform.processor.Activator;
import org.tura.metamodel.transform.processor.FlowProcessor;
import org.tura.platform.hutn.workflow.Flow;

public class GeneratorHUTNModel extends AbstractObjectActionDelegate implements
		IObjectActionDelegate {

	public void run(IAction action) {
		if (getFirstElementInSelection() instanceof IFile) {
			try {
				InputStream in = ((IFile) getFirstElementInSelection())
						.getContents();
				Flow flow = JaxbUtils.readDocument(Flow.class, in,
						Activator.class.getClassLoader());
				IResource res = ((IFile) getFirstElementInSelection());
				copyConfigFile(res);
				new FlowProcessor().process(flow, res);
			} catch (Exception e) {
				LogUtil.logInfo(e, true);
			}
		}
	}

	private void copyConfigFile(IResource res) throws IOException,
			CoreException {

		File projectLocation =  res.getProject().getLocation().toFile();
		File folderLocation = new File (projectLocation, res.getParent().getProjectRelativePath().toString());
		File configFile = new File(folderLocation,
				"TuraHUTNConfig.model");
		
		if (!configFile.exists()) {
			FileOutputStream out = null;
			InputStream in = null;
			try {
				out = new FileOutputStream(configFile);
				URL url = new URL(
						"platform:/plugin/org.tura.metamodel.hutn.script.init/hutn/TuraHUTNConfig.model");
				in = url.openStream();

				byte[] buffer = new byte[1024];
				int len = in.read(buffer);
				while (len != -1) {
					out.write(buffer, 0, len);
					len = in.read(buffer);
				}
				res.getParent().refreshLocal(IResource.DEPTH_ONE,
						new NullProgressMonitor());

			} finally {
				if (out != null)
					out.close();
				if (in != null)
					in.close();

			}
		}

	}
}
