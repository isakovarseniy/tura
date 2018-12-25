package sales.analyzer.service.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;

public class FileSearchService extends AbstaractSearchService{

	@Override
	protected Object serviceCall(Object pk, String objectClass) {
		return null;
	}

	@Override
	protected SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException {
		
		return null;
	}

	
	private long lineCounter(String pathname) throws IOException {
		Path path = Paths.get(new File(pathname).toURI());
		long lineCount = 0;
		try (Stream<String> stream = Files.lines(path)) {
			lineCount = stream.count();
			}		
		return lineCount;
	}
	
}
