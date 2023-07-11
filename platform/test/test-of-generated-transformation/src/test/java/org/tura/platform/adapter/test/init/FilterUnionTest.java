/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.adapter.test.init;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.tura.platform.adapter.engine.api.TransformRepository;
import org.tura.platform.adapter.engine.deserializer.FloatDeserializer;
import org.tura.platform.adapter.engine.deserializer.StringDeserializer;
import org.tura.transform.model.source.OperationResponse;
import org.tura.transform.model.target.CustomerCharge;
import org.tura.transform.model.target.Modification;
import org.tura.transform.unionTest.UnionTest;

public class FilterUnionTest {

	@Test
	public void unionTest() {

		try {
			TransformRepository repository = new TransformRepository();
			repository.addDeserializer(String.class, new StringDeserializer());
			repository.addDeserializer(Float.class, new FloatDeserializer());

			OperationResponse r = InitOperationResponse.initWithDataMerging();
			UnionTest adapter = new UnionTest();
			adapter.getBeanFactory().setOperationResponse(r);
			adapter.getBeanFactory().setRepository(repository);
			adapter.getBeanFactory().init();

			adapter.processingStage12processingStage2();
			
			List<CustomerCharge> list = adapter.getBeanFactory().getCustomerChargeCursor().getCursor();
			assertEquals(4, list.size());
			Map<String, Integer> h = new HashMap<>();
			for (CustomerCharge cc : list ) {
				Integer i = h.get(cc.getChargeType());
				if ( i == null) {
					i = 0;
					h.put(cc.getChargeType(), i);
				}
				i++;
			}
			assertEquals(2, h.keySet().size());
			for ( Integer i : h.values()) {
				assertEquals(Integer.valueOf(i), i);
			}
			
			adapter.getBeanFactory().getCustomerChargeCursor().setEnableToLoad(false);
			adapter.processingStage22processingStage3();
			List<Modification> mlist = adapter.getBeanFactory().getModificationCursor().getCursor();			
			assertEquals(1, mlist.size());
			
			Modification m = mlist.get(0);
			assertEquals("Transaction", m.getOperationType());
			assertTrue(  m.getAmount().equals(Float.parseFloat("12345.76")) );
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
