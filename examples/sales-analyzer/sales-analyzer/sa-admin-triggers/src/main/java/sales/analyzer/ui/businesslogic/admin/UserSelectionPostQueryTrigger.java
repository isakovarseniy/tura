package sales.analyzer.ui.businesslogic.admin;

import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.UserSelectionArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.keycloak.User;


@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("userSelection")
public class UserSelectionPostQueryTrigger implements PostQueryTrigger {

	@Inject
	ELResolver elResolver;

	
	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
		if( bf.getUserSwitch() != null && bf.getUserSwitch().equals(ActionsLocation.STATE) ) {
			executeState(datacontrol,obj);
		}else {
			executeCity(datacontrol,obj);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void executeState(DataControl<?> datacontrol, Object obj) throws TuraException {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
		DataControl dcRef = (DataControl) bf.getStateReference();
		List<Object > ls =   dcRef.getScroller();
		User user = (User) obj;
		boolean found = false;
		for (Object o : ls) {
			StateReference ref = (StateReference) o;
			if (ref.getUser() !=null && ref.getUser().getId().equals(user.getId())) {
				new UserSelectionArtifitialFieldsAdapter((ObjectControl) obj).setSelected(true);
				found =true;
				break;
			}
		}
		if (!found) {
		    new UserSelectionArtifitialFieldsAdapter((ObjectControl) obj).setSelected(false);
		}

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void executeCity(DataControl<?> datacontrol, Object obj) throws TuraException {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
		DataControl dcRef = (DataControl) bf.getCityRefeence();
		List<Object > ls =   dcRef.getScroller();
		User user = (User) obj;
		boolean found = false;
		for (Object o : ls) {
			CityRefeence ref = (CityRefeence) o;
			if (ref.getUser() !=null && ref.getUser().getId().equals(user.getId())) {
				new UserSelectionArtifitialFieldsAdapter((ObjectControl) obj).setSelected(true);
				found =true;
				break;
			}
		}
		if (!found) {
		    new UserSelectionArtifitialFieldsAdapter((ObjectControl) obj).setSelected(false);
		}

	}

	
	
}
