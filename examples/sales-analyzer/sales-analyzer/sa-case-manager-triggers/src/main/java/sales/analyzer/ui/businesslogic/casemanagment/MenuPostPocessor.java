package sales.analyzer.ui.businesslogic.casemanagment;

import java.io.Serializable;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuItem;
import org.tura.platform.datacontrol.annotations.MenuPostProcessingTrigger;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.MenuPostPocessingCommand;
import org.tura.platform.primefaces.menu.AbsractMenuProvider;


@Alternative
@Priority(10)
@Selector("analysis.casemanager")
@MenuPostProcessingTrigger
public class MenuPostPocessor implements MenuPostPocessingCommand,Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	WorkItemMenuDynamic workItemMenu;

	@Override
	public void execute(DefaultMenuModel model, String menuId, AbsractMenuProvider provider) {
		for ( MenuItem item : workItemMenu.getMenuItemsList()) {
			model.addElement(item);
		}
	}

}
