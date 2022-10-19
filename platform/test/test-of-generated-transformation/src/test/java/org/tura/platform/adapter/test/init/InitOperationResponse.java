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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.tura.transform.model.source.Adjustment;
import org.tura.transform.model.source.OperationResponse;
import org.tura.transform.model.source.Transactions;

public class InitOperationResponse {
	
	public static  OperationResponse initWithDataMerging() {
		
		OperationResponse result = new OperationResponse();
		
		String businessNumber = "123456";
		String accountId = UUID.randomUUID().toString();
		String product = "Internet";
		
		
		Date currentDate = new Date();
		Map<String, Date> h = getDates(currentDate);

		Transactions transaction = new Transactions();
		transaction.setAccountId(accountId);
		transaction.setBillDate(h.get("billDate"));
		transaction.setBusinessNumber(businessNumber);
		transaction.setChargeAmount(12345.76f);
		transaction.setChargeEffectiveDate( h.get("effectiveDate"));
		transaction.setPeriodStartDate( h.get("periodStartDate"));
		transaction.setPeriodEndDate( h.get("periodEndDate"));
		transaction.setTaxAmount(2.5f);
		transaction.setGst(2.2f);
		transaction.setProduct("Product1");
		result.setTransactions(new ArrayList<>());
		result.getTransactions().add(transaction);
		
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
        c.add(Calendar.MONTH, -1);
        currentDate = c.getTime();
		h = getDates(currentDate);
        
		transaction = new Transactions();
		transaction.setAccountId(accountId);
		transaction.setBillDate(h.get("billDate"));
		transaction.setBusinessNumber(businessNumber);
		transaction.setChargeAmount(345.76f);
		transaction.setChargeEffectiveDate( h.get("effectiveDate"));
		transaction.setPeriodStartDate( h.get("periodStartDate"));
		transaction.setPeriodEndDate( h.get("periodEndDate"));
		transaction.setTaxAmount(3.5f);
		transaction.setGst(3.3f);
		transaction.setProduct("Product2");
		result.getTransactions().add(transaction);

		
		c = Calendar.getInstance();
		c.setTime(currentDate);
        c.add(Calendar.MONTH, -1);
        currentDate = c.getTime();
		h = getDates(currentDate);

		Adjustment adj = new Adjustment();
		adj.setAccountId(businessNumber);
		adj.setBusinessNumber(businessNumber);
		adj.setBillDate(h.get("billDate"));
		adj.setAdjustmentCreationDate(currentDate);
		adj.setProduct(product);
		adj.setTaxAmount(12.6f);
		adj.setGst(4.4f);
		adj.setAdjustmentAmount(343434.76f);
		result.setAdjustment(new ArrayList<>());
		result.getAdjustment().add(adj);

		c = Calendar.getInstance();
		c.setTime(currentDate);
        c.add(Calendar.MONTH, -1);
        currentDate = c.getTime();
		h = getDates(currentDate);

		adj = new Adjustment();
		adj.setAccountId(businessNumber);
		adj.setBusinessNumber(businessNumber);
		adj.setBillDate(h.get("billDate"));
		adj.setAdjustmentCreationDate(currentDate);
		adj.setProduct(product);
		adj.setTaxAmount(2.6f);
		adj.setGst(5.5f);
		adj.setAdjustmentAmount(642.76f);
		result.getAdjustment().add(adj);

		return result;
	}
	
	public static  OperationResponse initWithNoDataMerging() {
		
		OperationResponse result = new OperationResponse();
		
		String businessNumber = "123456";
		String product = "Internet";
		
		
		Date currentDate = new Date();
		Map<String, Date> h = getDates(currentDate);

		Transactions transaction = new Transactions();
		transaction.setAccountId(UUID.randomUUID().toString());
		transaction.setBillDate(h.get("billDate"));
		transaction.setBusinessNumber(businessNumber);
		transaction.setChargeAmount(12345.76f);
		transaction.setChargeEffectiveDate( h.get("effectiveDate"));
		transaction.setPeriodStartDate( h.get("periodStartDate"));
		transaction.setPeriodEndDate( h.get("periodEndDate"));
		transaction.setProduct("Product1");
		transaction.setTaxAmount(2.5f);
		result.setTransactions(new ArrayList<>());
		result.getTransactions().add(transaction);
		
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
        c.add(Calendar.MONTH, -1);
        currentDate = c.getTime();
		h = getDates(currentDate);
        
		transaction = new Transactions();
		transaction.setAccountId(UUID.randomUUID().toString());
		transaction.setBillDate(h.get("billDate"));
		transaction.setBusinessNumber(businessNumber);
		transaction.setChargeAmount(345.76f);
		transaction.setChargeEffectiveDate( h.get("effectiveDate"));
		transaction.setPeriodStartDate( h.get("periodStartDate"));
		transaction.setPeriodEndDate( h.get("periodEndDate"));
		transaction.setProduct("Product2");
		transaction.setTaxAmount(3.5f);
		result.getTransactions().add(transaction);

		
		c = Calendar.getInstance();
		c.setTime(currentDate);
        c.add(Calendar.MONTH, -1);
        currentDate = c.getTime();
		h = getDates(currentDate);

		Adjustment adj = new Adjustment();
		adj.setAccountId(businessNumber);
		adj.setBusinessNumber(businessNumber);
		adj.setBillDate(h.get("billDate"));
		adj.setAdjustmentCreationDate(currentDate);
		adj.setProduct(product);
		adj.setTaxAmount(12.6f);
		adj.setAdjustmentAmount(343434.76f);
		result.setAdjustment(new ArrayList<>());
		result.getAdjustment().add(adj);

		c = Calendar.getInstance();
		c.setTime(currentDate);
        c.add(Calendar.MONTH, -1);
        currentDate = c.getTime();
		h = getDates(currentDate);

		adj = new Adjustment();
		adj.setAccountId(businessNumber);
		adj.setBusinessNumber(businessNumber);
		adj.setBillDate(h.get("billDate"));
		adj.setAdjustmentCreationDate(currentDate);
		adj.setProduct(product);
		adj.setTaxAmount(2.6f);
		adj.setAdjustmentAmount(642.76f);
		result.getAdjustment().add(adj);

		return result;
	}

	
	
	private static Map<String, Date> getDates(Date currentDate){
		Map<String, Date> map = new HashMap<>();
		
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.set(Calendar.HOUR, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);			
        Date billDate = c.getTime(); 
		
        c.add(Calendar.DAY_OF_MONTH, 8);
        Date effectiveDate = c.getTime();
        
		c = Calendar.getInstance();
		c.setTime(currentDate);
		c.set(Calendar.HOUR, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);			
        
        c.add(Calendar.MONTH, -1);
        Date periodStartDate = c.getTime();
        
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date periodEndDate = c.getTime();
        
        map.put("billDate", billDate);
        map.put("effectiveDate", effectiveDate);
        map.put("periodStartDate", periodStartDate);
        map.put("periodEndDate", periodEndDate);
        
        
		return map;
	}
}
