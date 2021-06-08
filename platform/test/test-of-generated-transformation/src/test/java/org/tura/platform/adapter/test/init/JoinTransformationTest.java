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

package org.tura.platform.adapter.test.init;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.tura.platform.adapter.engine.api.TransformRepository;
import org.tura.platform.adapter.engine.deserializer.FloatDeserializer;
import org.tura.platform.adapter.engine.deserializer.StringDeserializer;
import org.tura.transform.joinTransformation.JoinTransformation;
import org.tura.transform.model.source.OperationResponse;
import org.tura.transform.model.target.CustomerCharge;
import org.tura.transform.model.target.Tax;

public class JoinTransformationTest {

	@Test
	public void joinTransformation() {
		try {
			TransformRepository repository = new TransformRepository();
			repository.addDeserializer(String.class, new StringDeserializer());
			repository.addDeserializer(Float.class, new FloatDeserializer());

			OperationResponse r = InitOperationResponse.initWithDataMerging();
			
			JoinTransformation adapter = new JoinTransformation();
			adapter.getBeanFactory().setOperationResponse(r);
			adapter.getBeanFactory().setRepository(repository);
			adapter.getBeanFactory().init();
			
			adapter.processingStage12processingStage2();
			List<CustomerCharge> list = adapter.getBeanFactory().getCustomerChargeCursor().getCursor();
			assertEquals(4, list.size());

			assertEquals(1, list.get(0).getTax().size());
			assertEquals(1, list.get(1).getTax().size());
			assertEquals(1, list.get(2).getTax().size());
			assertEquals(1, list.get(3).getTax().size());
			
			Tax tax = list.get(0).getTax().iterator().next();
			assertTrue(tax.getAmount().equals(3.5f));
			assertEquals( "TrxTax", tax.getTaxType());
			
			tax = list.get(1).getTax().iterator().next();
			assertTrue(tax.getAmount().equals(2.5f));
			assertEquals( "TrxTax", tax.getTaxType());
			
			tax = list.get(2).getTax().iterator().next();
			assertTrue(tax.getAmount().equals(2.6f));
			assertEquals( "AdjTax", tax.getTaxType());
			
			tax = list.get(3).getTax().iterator().next();
			assertTrue(tax.getAmount().equals(12.6f));
			assertEquals( "AdjTax", tax.getTaxType());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
