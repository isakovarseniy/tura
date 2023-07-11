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

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.tura.platform.adapter.engine.api.TransformRepository;
import org.tura.platform.adapter.engine.deserializer.FloatDeserializer;
import org.tura.platform.adapter.engine.deserializer.StringDeserializer;
import org.tura.transform.joinTransformation.JoinTransformation;
import org.tura.transform.model.source.Adjustment;
import org.tura.transform.model.source.OperationResponse;
import org.tura.transform.model.source.Transactions;
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

			assertEquals(2, list.get(0).getTax().size());
			assertEquals(2, list.get(1).getTax().size());
			assertEquals(2, list.get(2).getTax().size());
			assertEquals(2, list.get(3).getTax().size());
			
			
			Iterator<Tax> itr = list.get(0).getTax().iterator();
			Tax tax = itr.next();
			assertTrue(tax.getAmount().equals(3.3f));
			assertEquals( "TrxGSTTax", tax.getTaxType());

			tax = itr.next();
			assertTrue(tax.getAmount().equals(3.5f));
			assertEquals( "TrxTax", tax.getTaxType());
			
			itr = list.get(1).getTax().iterator();
			tax = itr.next();
			assertTrue(tax.getAmount().equals(2.2f));
			assertEquals( "TrxGSTTax", tax.getTaxType());

			tax = itr.next();
			assertTrue(tax.getAmount().equals(2.5f));
			assertEquals( "TrxTax", tax.getTaxType());
			
			
			itr = list.get(2).getTax().iterator();
			tax = itr.next();
			assertTrue(tax.getAmount().equals(5.5f));
			assertEquals( "AdjGSTTax", tax.getTaxType());
			
			tax = itr.next();
			assertTrue(tax.getAmount().equals(2.6f));
			assertEquals( "AdjTax", tax.getTaxType());
			
			itr = list.get(3).getTax().iterator();
			
			tax = itr.next();
			assertTrue(tax.getAmount().equals(4.4f));
			assertEquals( "AdjGSTTax", tax.getTaxType());
			
			tax = itr.next();
			assertTrue(tax.getAmount().equals(12.6f));
			assertEquals( "AdjTax", tax.getTaxType());
			
			
			adapter.getBeanFactory().getCustomerChargeCursor().setEnableToLoad(false);
			adapter.processingStage22processingStage3();
			
			List<OperationResponse> listOpr = adapter.getBeanFactory().getOperationResponse0Cursor().getCursor();
			assertEquals( 1, listOpr.size());
			assertEquals( 2, listOpr.get(0).getAdjustment().size());
			assertEquals( 2, listOpr.get(0).getTransactions().size());
			
			Iterator<Adjustment> itrAdjSrc= r.getAdjustment().iterator();
			Iterator<Adjustment> itrAdjTrg= listOpr.get(0).getAdjustment().iterator();
			
			Adjustment adjSrc  = itrAdjSrc.next();
			Adjustment adjTrg  = itrAdjTrg.next();
			
			assertEquals(adjSrc.getBusinessNumber(), adjTrg.getBusinessNumber());
			assertEquals(adjSrc.getTaxAmount(), adjTrg.getTaxAmount());
			assertEquals(adjSrc.getGst(), adjTrg.getGst());
			
			adjSrc  = itrAdjSrc.next();
			adjTrg  = itrAdjTrg.next();
			
			assertEquals(adjSrc.getBusinessNumber(), adjTrg.getBusinessNumber());
			assertEquals(adjSrc.getTaxAmount(), adjTrg.getTaxAmount());
			assertEquals(adjSrc.getGst(), adjTrg.getGst());
			
			
			Iterator<Transactions> itrTrxSrc= r.getTransactions().iterator();
			Iterator<Transactions> itrTrxTrg= listOpr.get(0).getTransactions().iterator();
			
			Transactions trxSrc  = itrTrxSrc.next();
			Transactions trxTrg  = itrTrxTrg.next();
			
			assertEquals(trxSrc.getAccountId(), trxTrg.getAccountId());
			assertEquals(trxSrc.getTaxAmount(), trxTrg.getTaxAmount());
			assertEquals(trxSrc.getGst(), trxTrg.getGst());
			
			trxSrc  = itrTrxSrc.next();
			trxTrg  = itrTrxTrg.next();
			
			assertEquals(trxSrc.getAccountId(), trxTrg.getAccountId());
			assertEquals(trxSrc.getTaxAmount(), trxTrg.getTaxAmount());
			assertEquals(trxSrc.getGst(), trxTrg.getGst());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
