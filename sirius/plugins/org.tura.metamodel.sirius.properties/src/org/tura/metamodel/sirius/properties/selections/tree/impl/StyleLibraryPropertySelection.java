package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.StylePointerLibraryName;
import org.tura.metamodel.sirius.properties.selections.tree.TreePropertySelectioin;

import style.StyleLibrary;

public class StyleLibraryPropertySelection extends TreePropertySelectioin{

	@Override
	public String getLabelText() {
		return "Style library:";
	}

	@Override
	public TreeRoot getContextRoot() {
		TreeRoot rootOfTree = new TreeRoot();
		try {
			rootOfTree.addChild(new QueryHelper().getDomainApplications(getModel()));
		} catch (Exception e) {
			// ignore
		}
		return rootOfTree;
	}


	@Override
	protected void showError() {
		
	}

	@Override
	protected TextDataAdapter getDataAdapter() {
		return new StylePointerLibraryName();
	}

	@Override
	protected  Class<?> getComaringClass() {
		return StyleLibrary.class;
	}

}
