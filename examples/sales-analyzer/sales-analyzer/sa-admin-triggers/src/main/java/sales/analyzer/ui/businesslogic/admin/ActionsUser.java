/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sales.analyzer.ui.businesslogic.admin;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.ClearForm;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.events.EventAware;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

public class ActionsUser implements EventAware {

	EventDescription event;
	private transient Logger logger = Logger.getLogger(Actions.class.getName());

    @Inject
    ELResolver elResolver;

    @Inject
    @Named("admin.administration")
    CommandStack commandStack;

    @Inject
    Repository repository;

	@Inject
	ResponseState responseState;
    
    
    @SuppressWarnings("rawtypes")
    public void openUserPopup() {
        try {
        	
			EventParameter param = event.findParameter("rowkey");
			String username = (String) param.getValue();
        	
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            bf.setUserId(username);
            dc.forceRefresh();

            dc.getCommandStack().savePoint();

    		ClearForm cmd = new ClearForm();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd);

            
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd1);

        
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }
    
    @SuppressWarnings("rawtypes")
    public void openUserSelectorPopup() {
        try {
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.user}");
            User user = (User) dc.getCurrentObject();

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            if (user != null) {
                bf.setUserId(user.getUsername());
            } else {
                bf.setUserId(null);
            }
            dc = (DataControl) bf.getPopupUser();
            dc.forceRefresh();

            dc.getCommandStack().savePoint();
            dc.islolate();

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
        
    }

    @SuppressWarnings("rawtypes")
    public void createUserPopup() {
        try {

            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");

            dc.getCommandStack().savePoint();
            dc.islolate();

            dc.createObject();

    		ClearForm cmd = new ClearForm();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd);
            
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");
			responseState.addCommand(cmd1);


        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }
    
    @SuppressWarnings("rawtypes")
    public void applyUserChanges() {
        DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");
        try {
            dc.flush();

            HidePopup cmd = new HidePopup();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");

			responseState.addCommand(cmd);
            
        } catch (TuraException e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }

    @SuppressWarnings("rawtypes")
    public void rallbackUserChanges() {

        try {
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");
            dc.getCommandStack().rallbackSavePoint();

            HidePopup cmd = new HidePopup();
			cmd.setTarget("7488ec14-1cff-4352-98de-0612597e7ccc");

			responseState.addCommand(cmd);
        	
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    
    public void applyRolesModification() {
    	
        HidePopup cmd = new HidePopup();
		cmd.setTarget("c31bf961-55f2-4daf-80be-a5cb69b0abee");
		responseState.addCommand(cmd);
    	
    }

    @SuppressWarnings("rawtypes")
    public void rallbackRolessModification() {
        try {
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.roleReference}");
            dc.getCommandStack().rallbackSavePoint();

	        HidePopup cmd = new HidePopup();
			cmd.setTarget("c31bf961-55f2-4daf-80be-a5cb69b0abee");
			responseState.addCommand(cmd);
            
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    
    
    @SuppressWarnings("rawtypes")
    public void deleteUser() {
        try {
        	
			EventParameter param = event.findParameter("rowkey");
			String username = (String) param.getValue();
        	

            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");
            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            bf.setUserId(username);
            dc.forceRefresh();
            dc.removeObject();

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }

    
    @SuppressWarnings("rawtypes")
    public void openRoleSelectorPopup() {
        try {

            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.roleSelector}");
            dc.forceRefresh();

            dc.getCommandStack().savePoint();
            
			OpenPopup cmd = new OpenPopup();
			cmd.setTarget("c31bf961-55f2-4daf-80be-a5cb69b0abee");
			responseState.addCommand(cmd);
            

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }
    
    @SuppressWarnings("rawtypes")
    public void deleteRoleRef() {
        try {
			EventParameter param = event.findParameter("rowkey");
			String rolename = (String) param.getValue();
        	
            IBeanFactory bfHelper = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            DataControl dcHelper = (DataControl) bfHelper.getUserHelper();
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.user}");
            User user = (User) dc.getCurrentObject();

            dcHelper.getDefaultSearchCriteria().clear();

            SearchCriteria sc = new SearchCriteria();
            sc.setName("username");
            sc.setComparator(Operator.EQ.name());
            sc.setValue(user.getUsername());
            dcHelper.getDefaultSearchCriteria().add(sc);

            dcHelper.forceRefresh();

            dcHelper.getCurrentObject();
            DataControl roleRefHelper = (DataControl) bfHelper.getRoleReferenceHelper();
            roleRefHelper.getCurrentObject();
            int i = 0;
            boolean found = false;
            for ( Object o : roleRefHelper.getScroller()) {
                RoleReference roleRef = (RoleReference) o;
                if ( roleRef.getRole() != null &&  roleRef.getRole().getName().equals(rolename)) {
                    found = true;
                    break;
                }
                i++;
            }
            if (found) {
                roleRefHelper.setCurrentPosition(i);
                roleRefHelper.removeObject();
            }
            
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;
		
	}

    
}