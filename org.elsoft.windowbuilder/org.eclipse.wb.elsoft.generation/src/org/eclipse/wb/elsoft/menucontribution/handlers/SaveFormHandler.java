package org.eclipse.wb.elsoft.menucontribution.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class SaveFormHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		ListSelectionDialog dlg = new ListSelectionDialog(shell,
				ResourcesPlugin.getWorkspace().getRoot(),
				new BaseWorkbenchContentProvider(),
				new WorkbenchLabelProvider(), "Select the Project:");
		dlg.setTitle("Project Selection");
		if (dlg.open() == Window.OK) {
			SaveFormJob job = new SaveFormJob();
			job.setObj(dlg.getResult());
			Thread t = new Thread(job);
			t.start();
		}
		return null;
	}

}
