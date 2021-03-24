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

package sales.analyzer.process.query.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.dashbuilder.dataset.DataSet;
import org.jbpm.kie.services.impl.query.mapper.AbstractQueryMapper;
import org.jbpm.services.api.query.QueryResultMapper;

import sales.analyzer.api.model.impl.SalesAnalyzerListOfRowsNumber;
import sales.analyzer.api.model.impl.SalesAnalyzerRowsNumber;

public class SalesAnalyzerRowsNumberMapper extends AbstractQueryMapper<SalesAnalyzerRowsNumber>
implements QueryResultMapper<SalesAnalyzerListOfRowsNumber> {

	private static final long serialVersionUID = 6670372908669667978L;

	@Override
	public SalesAnalyzerListOfRowsNumber map(Object result) {
		if (result instanceof DataSet) {
			DataSet dataSetResult = (DataSet) result;
			SalesAnalyzerListOfRowsNumber r = new SalesAnalyzerListOfRowsNumber();
			r.setRows(new ArrayList<>());
			SalesAnalyzerRowsNumber n = new SalesAnalyzerRowsNumber();
			n.setRowsNumber(new Long(dataSetResult.getRowCountNonTrimmed()));
			r.getRows().add(n);
			
			return r;
		}

		throw new IllegalArgumentException("Unsupported result for mapping " + result);
	}

	@Override
	protected SalesAnalyzerRowsNumber buildInstance(DataSet dataSetResult, int index) {
		SalesAnalyzerRowsNumber n = new SalesAnalyzerRowsNumber();
		n.setRowsNumber(getColumnLongValue(dataSetResult, "A", index));
		return n;
	}

	@Override
	public String getName() {
		return SalesAnalyzerRowsNumber.class.getSimpleName();
	}

	@Override
	public Class<?> getType() {
		return SalesAnalyzerRowsNumber.class;
	}

	@Override
	public QueryResultMapper<SalesAnalyzerListOfRowsNumber> forColumnMapping(Map<String, String> columnMapping) {
		return new SalesAnalyzerRowsNumberMapper();
	}
	
	
}

