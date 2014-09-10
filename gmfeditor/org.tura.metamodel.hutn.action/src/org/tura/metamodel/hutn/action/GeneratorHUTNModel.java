package org.tura.metamodel.hutn.action;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.epsilon.common.dt.actions.AbstractObjectActionDelegate;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IObjectActionDelegate;
import org.tura.metamodel.commons.JaxbUtils;
import org.tura.metamodel.transform.processor.Activator;
import org.tura.metamodel.transform.processor.FlowProcessor;
import org.tura.platform.hutn.workflow.Flow;


public class GeneratorHUTNModel extends AbstractObjectActionDelegate implements IObjectActionDelegate {
	
	
	public void run(IAction action) {
		if (getFirstElementInSelection() instanceof IFile) {
			try{
			 InputStream in = ((IFile)getFirstElementInSelection()).getContents();
			 Flow flow =  JaxbUtils.readDocument(Flow.class, in,Activator.class.getClassLoader());
			 IResource res = ((IFile)getFirstElementInSelection()); 
			 new FlowProcessor().process(flow,   res);
			}catch(Exception e){
				LogUtil.logInfo(e, true);
			}
		}
	}
	
//	private static class DialogueReporter implements TuraHutnBuilderHelper.HutnBuildReporter {
//		
//		public void reportFailure(IFile source, String message) {
//			LogUtil.logInfo(message, true);
//		}
//	}
}



