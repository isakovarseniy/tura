package org.tura.metamodel.hutn.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.epsilon.common.dt.actions.AbstractObjectActionDelegate;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IObjectActionDelegate;
import org.tura.metamodel.hutn.builder.helper.TuraHutnBuilderHelper;



public class GeneratorHUTNModel extends AbstractObjectActionDelegate implements IObjectActionDelegate {
	
	
	public void run(IAction action) {
		if (getFirstElementInSelection() instanceof IFile) {
			new TuraHutnBuilderHelper((IFile)getFirstElementInSelection(), new DialogueReporter()).buildHutn();
		}
	}
	
	private static class DialogueReporter implements TuraHutnBuilderHelper.HutnBuildReporter {
		
		public void reportFailure(IFile source, String message) {
			LogUtil.logInfo(message, true);
		}
	}
}



