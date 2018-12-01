package sales.analyzer.ui.businesslogic.casemanagment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;

import org.primefaces.model.menu.MenuItem;

@ViewScoped
public class WorkItemMenuDynamic implements Serializable{
	
	private static final long serialVersionUID = 6731701381017313043L;

	private List<MenuItem> menuItemsList = new ArrayList<>();

	public List<MenuItem> getMenuItemsList() {
		return menuItemsList;
	}

	public void setMenuItemsList(List<MenuItem> menuItemsList) {
		this.menuItemsList = menuItemsList;
	}

}
