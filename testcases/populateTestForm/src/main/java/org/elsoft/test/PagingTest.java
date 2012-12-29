package org.elsoft.test;

import java.util.Iterator;

import org.elsoft.platform.metamodel.JPAObjects;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.persistence.TransactionManagerImpl;

public class PagingTest {

	public static void main(String[] args) {
		RepositoryFactory rf;
		try {

			rf = new RepositoryFactory(new TransactionManagerImpl(JPAObjects.getObjects()));

			UiContainerHandler uch = rf.getRoot().cleanSearch()
					.searchString("domainName", "Manufacturing").seek()
					.getFunctionalDomain().cleanSearch()
					.searchString("functionalDomainName", "BackOffice").seek()
					.getApplicationHandler().cleanSearch()
					.searchString("applicationName", "HR").seek().getUILayer()
					.searchString("uiContainerName", "Many2ManyForm").seek();

			Iterator<CommandDAO> itr = uch.getCommandHandler().getList();
			int i=0;
			while(itr.hasNext()){
			   CommandDAO cmd = itr.next();
			   if (Math.random() > 0.5)
				   cmd.setCommandExecutor("adsd");
			   System.out.println( "id= "+ i++  +  " objId - " + cmd.getObjId()+ "- executor- "+cmd.getCommandExecutor());
			}
			System.out.println("----------------");
			itr = uch.getCommandHandler().getList();
			i=0;
			while(itr.hasNext()){
				   CommandDAO cmd = itr.next();
				   System.out.println( "id= "+ i++  +  " objId - " + cmd.getObjId()+ "- executor- "+cmd.getCommandExecutor());
				}

			
			uch.getCommandHandler().getMode().getControl().getObject(119);
			uch.getCommandHandler().getMode().getControl().getObject(120);
			uch.getCommandHandler().getMode().getControl().getObject(122);
			uch.getCommandHandler().getMode().getControl().getObject(123);
			uch.getCommandHandler().getMode().getControl().getObject(124);
			uch.getCommandHandler().getMode().getControl().getObject(125);
			uch.getCommandHandler().getMode().getControl().getObject(124);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


