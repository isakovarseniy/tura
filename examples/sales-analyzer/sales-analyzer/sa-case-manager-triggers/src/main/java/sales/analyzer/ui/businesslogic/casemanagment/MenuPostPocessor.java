package sales.analyzer.ui.businesslogic.casemanagment;

import java.io.Serializable;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.primefaces.model.menu.DefaultMenuItem;
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
		
		if ( menuId.equals("tura5214fbad_aeb9_4d3e_b16c_3a945b89db6b")  ) {
			for ( MenuItem item : workItemMenu.getMenuItemsList()) {
				model.addElement(item);
			}
			return;
		}
		
		if ( menuId.equals("tura9a63b5cf_8508_4afb_bdb2_71e5a1be0a75") && ( model.getElements().size() != 0)  ) {
			DefaultMenuItem item = (DefaultMenuItem) model.getElements().get(1);
			String styleClass = "";
			if ( item.getStyleClass() != null ) {
				styleClass = item.getStyleClass()+" ";
			}
			item.setContainerStyleClass(styleClass+ "active-menuitem" );
			return;
		
		}
		
	}

}
