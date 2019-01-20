package org.sales.analyzer.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.tura.comfiguration.artifacts.ConfigConstants;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

import sales.analyzer.api.model.impl.FileEntity;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.file.FileSearchService;

public class FileSearchServiceTest {

	@Test
	public void search_test0() {
		try {
			FileSearchService service = new FileSearchService(ConfigConstants.RESOURCE_HOME);
			FileEntity entry = (FileEntity) service.find("MonthlyData_2017-08-01.csv", FileEntity.class.getName());
			assertNotNull(entry);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void search_test1() {
		try {
			FileSearchService service = new FileSearchService(ConfigConstants.RESOURCE_HOME);
			service.setMapper(new FileEntityMapper());

			ArrayList<SearchCriteria> array = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();

			sc.setName(Constants.PARAMETER_FILE_TEMPLATE);
			sc.setValue("**/MonthlyData_2017-11-01*.csv");
			array.add(sc);

			SearchResult result = service.find(array, new ArrayList<OrderCriteria>(), 0, 100,
					FileEntity.class.getName());
			assertTrue ( result.getSearchResult().size() >= 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	class FileEntityMapper implements Mapper {
		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((FileEntity) persistenceObject).getFullPath();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			return null;
		}

	}

}
