/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.tura.platform.adapter.engine.api.Event;
import org.tura.platform.adapter.engine.api.OperationListner;
import org.tura.platform.adapter.engine.api.TransformRepository;
import org.tura.platform.adapter.engine.deserializer.StringDeserializer;
import org.tura.platform.adapter.engine.events.OnEndRowEvent;
import org.tura.platform.adapter.engine.events.OnLoadEndEvent;
import org.tura.platform.adapter.engine.events.OnLoadStartEvent;
import org.tura.transform.chargesTransformation.ChargesTransformation;
import org.tura.transform.chargesTransformation.ChargesTransformationBeanFactory;
import org.tura.transform.model.source.OperationResponse;
import org.tura.transform.model.source.chargesTransformation.cursors.UnionCursor;
import org.tura.transform.model.target.Characteristic;
import org.tura.transform.model.target.CustomerCharge;
import org.tura.transform.model.target.Product;
import org.tura.transform.model.target.Tax;
import org.tura.transform.model.target.chargesTransformation.cursors.CharacteristicCursor;

public class TranfrormTest {

	@Test
	public  void chargesTransformationTestWithDataMerging() {

		try {
			TransformRepository repository = new TransformRepository();
			String key = OnLoadStartEvent.buildKey(UnionCursor.class.getName());
			repository.addListener(key, new OnLoadUnionCusorOperation());
			key = OnEndRowEvent.buildKey(UnionCursor.class.getName());
			repository.addListener(key, new OnEndRowUnionCusorOperation());
			key = OnLoadEndEvent.buildKey(CharacteristicCursor.class.getName());
			repository.addListener(key, new OnLoadEndCharacteristicCusorOperation());
			repository.addDeserializer(String.class, new StringDeserializer());
			
			OperationResponse r = InitOperationResponse.initWithDataMerging();
			ChargesTransformation adapter = new ChargesTransformation();
			adapter.getBeanFactory().setOperationResponse(r);
			adapter.getBeanFactory().setRepository(repository);
			adapter.getBeanFactory().init();
			
			adapter.processingStage12processingStage2();
			CustomerCharge cc = adapter.getBeanFactory().getCustomerChargeCursor().getCursor().get(0);
			
			assertEquals ( 1,adapter.getBeanFactory().getCustomerChargeCursor().getCursor().size());
			assertEquals ( 6, cc.getCharacteristic().size());
			assertEquals ( 2, cc.getProduct().size());
			assertEquals ( 2, cc.getTax().size());
			
			
			String[] characteristics = new String[] {"ChargeEffectiveDate","ProductStartDate","ProductEndDate"};
			List<String>   chList  = Arrays.asList(characteristics);
			Map<String,Integer> rr = new HashMap<>();
			for (  Characteristic ch   :  cc.getCharacteristic()) {
				assertNotNull(ch.getName());
				assertNotNull(ch.getValue());
				if (   !chList.contains(ch.getName())  ) {
					fail();
				}
				
				Integer i = null;
				if ( rr.get(ch.getName()) == null) {
					i = 0;
					rr.put(ch.getName(), i);
				}
				i = rr.get(ch.getName()) ;
				i++;
				rr.put(ch.getName(), i);
			}
			assertEquals(3, rr.keySet().size());
			for( Integer i : rr.values()) {
				assertEquals( Integer.valueOf(2), i);
			}
			
			String[] products = new String[] {"Product1","Product2"};
			List<String>   prdList  = Arrays.asList(products);
			List<String>   pList  = new ArrayList<>();
			for (  Product prd   :  cc.getProduct()) {
				assertNotNull(prd.getProductName());
				if (   !prdList.contains(prd.getProductName())  ) {
					fail();
				}
				if (pList.contains(prd.getProductName())) {
					fail();
				}
				pList.add(prd.getProductName());
			}
			
			Float[] taxes = new Float[] {2.5f, 3.5f};
			List<Float>   taxesList  = Arrays.asList(taxes);
			List<Float>   tList  = new ArrayList<>();
			for (  Tax tax   :  cc.getTax()) {
				assertNotNull(tax.getAmount());
				assertEquals("GST", tax.getTaxType());
				
				if ( !taxesList.contains(tax.getAmount())  ) {
					fail();
				}
				if (tList.contains(tax.getAmount())) {
					fail();
				}
				tList.add(tax.getAmount());
			}
	
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	@Test
	public  void chargesTransformationTestNoDataMerging() {

		try {
			TransformRepository repository = new TransformRepository();
			String key = OnLoadStartEvent.buildKey(UnionCursor.class.getName());
			repository.addListener(key, new OnLoadUnionCusorOperation());
			key = OnEndRowEvent.buildKey(UnionCursor.class.getName());
			repository.addListener(key, new OnEndRowUnionCusorOperation());
			key = OnLoadEndEvent.buildKey(CharacteristicCursor.class.getName());
			repository.addListener(key, new OnLoadEndCharacteristicCusorOperation());
			repository.addDeserializer(String.class, new StringDeserializer());
			
			OperationResponse r = InitOperationResponse.initWithNoDataMerging();
			ChargesTransformation adapter = new ChargesTransformation();
			adapter.getBeanFactory().setOperationResponse(r);
			adapter.getBeanFactory().setRepository(repository);
			adapter.getBeanFactory().init();
			
			adapter.processingStage12processingStage2();
			
			assertEquals ( 2,adapter.getBeanFactory().getCustomerChargeCursor().getCursor().size());

			CustomerCharge cc = adapter.getBeanFactory().getCustomerChargeCursor().getCursor().get(0);
			
			assertEquals ( 3, cc.getCharacteristic().size());
			assertEquals ( 1, cc.getProduct().size());
			assertEquals ( 1, cc.getTax().size());
			
			
			String[] characteristics = new String[] {"ChargeEffectiveDate","ProductStartDate","ProductEndDate"};
			List<String>   chList  = Arrays.asList(characteristics);
			List<String>   rList  = new ArrayList<>();
			for (  Characteristic ch   :  cc.getCharacteristic()) {
				assertNotNull(ch.getName());
				assertNotNull(ch.getValue());
				if (   !chList.contains(ch.getName())  ) {
					fail();
				}
				if (rList.contains(ch.getName())) {
					fail();
				}
				rList.add(ch.getName());
			}
			
			String[] products = new String[] {"Product1","Product2"};
			List<String>   prdList  = Arrays.asList(products);
			Product product = cc.getProduct().iterator().next();
			assertNotNull(product.getProductName());
			assertTrue(prdList.contains(product.getProductName()));
			
			Float[] taxes = new Float[] {2.5f, 3.5f};
			List<Float>   taxesList  = Arrays.asList(taxes);
			Tax tax = cc.getTax().iterator().next();
			assertNotNull(tax.getAmount());
			assertTrue(taxesList.contains(tax.getAmount()));
			
			

			cc = adapter.getBeanFactory().getCustomerChargeCursor().getCursor().get(1);
			
			assertEquals ( 3, cc.getCharacteristic().size());
			assertEquals ( 1, cc.getProduct().size());
			assertEquals ( 1, cc.getTax().size());
			
			rList  = new ArrayList<>();
			for (  Characteristic ch   :  cc.getCharacteristic()) {
				assertNotNull(ch.getName());
				assertNotNull(ch.getValue());
				if (   !chList.contains(ch.getName())  ) {
					fail();
				}
				if (rList.contains(ch.getName())) {
					fail();
				}
				rList.add(ch.getName());
			}
			Product product2 = cc.getProduct().iterator().next();
			assertNotNull(product2.getProductName());
			assertTrue(prdList.contains(product2.getProductName()));
			
			Tax tax2 = cc.getTax().iterator().next();
			assertNotNull(tax2.getAmount());
			assertTrue(taxesList.contains(tax2.getAmount()));
			
			assertNotEquals(product2.getProductName(), product.getProductName());
			assertNotEquals(tax2.getAmount(), tax.getAmount());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	

	public class OnLoadUnionCusorOperation extends OperationListner{

		@Override
		public void process(Event event) throws Exception {
			OnLoadStartEvent onLoad = (OnLoadStartEvent) event;
			UnionCursor cursor  =  (UnionCursor) onLoad.getCursor();
			ChargesTransformationBeanFactory bf=  cursor.getBeanFactory();
			
			bf.getUnionCursor().reset();

			
			bf.getChargeEffectiveDateCursor().reset();
			bf.getChargeEffectiveDateCursor().load();

			bf.getPeriodEndDateCursor().reset();
			bf.getPeriodEndDateCursor().load();

			bf.getPeriodStartDateCursor().reset();
			bf.getPeriodStartDateCursor().load();
			
		}
	}
	
	public class OnEndRowUnionCusorOperation extends OperationListner{

		@Override
		public void process(Event event) throws Exception {
			OnEndRowEvent onLoad = (OnEndRowEvent) event;
			UnionCursor cursor  =  (UnionCursor) onLoad.getCursor();
			
			if (cursor.getAggregation() == null) {
				cursor.setAggregation(1); 
			}else {
				int i = cursor.getAggregation();
				cursor.setAggregation(++i);
			}
		}
	}
	

	public class OnLoadEndCharacteristicCusorOperation extends OperationListner{

		@Override
		public void process(Event event) throws Exception {
			OnLoadEndEvent onLoad = (OnLoadEndEvent) event;
			CharacteristicCursor cursor  =  (CharacteristicCursor) onLoad.getCursor();
			ChargesTransformationBeanFactory bf=  cursor.getBeanFactory();
			UnionCursor ucursor = bf.getUnionCursor();
			bf.getCustomerChargeCursor().getCurrentObject().setAggrVal(ucursor.getAggregation());

		}
	}
	
}
