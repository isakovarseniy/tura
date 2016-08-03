package org.tura.metamodel.sirius.properties.selections;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;

public class MultiSelectionTreeDialog extends CheckedTreeSelectionDialog{

	
	protected TreePath[] treePath;
	
	public TreePath[] getTreePath() {
		return treePath;
	}
	
	
	public MultiSelectionTreeDialog(Shell parent, ILabelProvider labelProvider, ITreeContentProvider contentProvider) {
		super(parent, labelProvider, contentProvider);
	}
	
	@Override
	protected CheckboxTreeViewer createTreeViewer(Composite parent) {
		CheckboxTreeViewer viewer = super.createTreeViewer(parent);

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				treePath = ((TreeSelection) event.getSelection())
						.getPaths();
				updateOKStatus();
			}
		});

		return viewer;
	}

}
