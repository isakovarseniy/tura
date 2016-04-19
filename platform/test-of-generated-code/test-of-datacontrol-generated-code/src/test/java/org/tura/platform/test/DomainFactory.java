package org.tura.platform.test;

import org.elsoft.platform.hr.objects.CompanyDAO;
import org.elsoft.platform.hr.objects.StreetDAO;

public interface DomainFactory {

	public CompanyDAO getNewCompanyDAO() throws Exception;
	public StreetDAO getNewStreetDAO() throws Exception;
	
	
}
