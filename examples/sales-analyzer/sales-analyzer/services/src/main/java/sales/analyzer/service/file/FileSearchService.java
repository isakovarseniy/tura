/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.service.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;

import sales.analyzer.api.model.impl.FileEntity;
import sales.analyzer.process.commons.Constants;

public class FileSearchService extends AbstaractSearchService {

	private String baseDir;
	private String registryName;
	private SpaObjectRegistry spaRegistry;
	@SuppressWarnings("unused")
	private Registry registry;

	public FileSearchService(String baseDir,SpaObjectRegistry spaRegistry,String registryName,Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
		this.baseDir = baseDir;
	}
	
	
	
	@Override
	protected Object serviceCall(Object pk, String objectClass) throws RepositoryException {
		String fileName = (String) pk;
		String pathname = baseDir + File.separator + fileName;
		if (!new File(pathname).exists()) {
			return null;
		}
		FileEntity entry = new FileEntity();
		entry.setName(fileName);
		entry.setFullPath(pathname);
		entry.setLines(lineCounter(pathname));
		return entry;
	}

	@Override
	protected SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException {

		RepositoryHelper helper = new RepositoryHelper(null);
		SearchCriteria sc = helper.checkSearchParam(Constants.PARAMETER_FILE_TEMPLATE, searchCriteria);
		String directory = baseDir;
		String pattern = "*.*";
		if (sc != null) {
			pattern = (String) sc.getValue();
		}
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
		File dir = new File(directory);
		if (!dir.exists()) {
			throw new RepositoryException("Directory " + directory + " does not exists");
		}
		ArrayList<FileEntity> list = new ArrayList<>();
		File[] files = dir.listFiles();
		if (startIndex < files.length) {
			int j = endIndex;
			if (j > files.length) {
				j = files.length;
			}
			for (int i = startIndex; i < j; i++) {
				File f = files[i];
				Path path = f.toPath();
				if (matcher.matches(path)) {
					FileEntity entry = new FileEntity();
					entry.setName(f.getName());
					entry.setFullPath(f.getAbsolutePath());
					entry.setLines(lineCounter(f.getAbsolutePath()));
					list.add(entry);
				}
			}
		}
		return new SearchResult(list, list.size());
	}

	private long lineCounter(String pathname) throws RepositoryException {
		Path path = Paths.get(new File(pathname).toURI());
		long lineCount = 0;
		try (Stream<String> stream = Files.lines(path)) {
			lineCount = stream.count();
		} catch (IOException e) {
			throw new RepositoryException(e);
		}
		return lineCount;
	}

	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}

}
