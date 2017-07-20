/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.selenium.primefaces;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.google.common.base.Function;


import org.openqa.selenium.support.ui.FluentWait;

public class Helper {
	
	private static final String JS_JQUERY_DEFINED = "return typeof jQuery != 'undefined';";
	private static final String JS_PRIMEFACES_DEFINED = "return typeof PrimeFaces != 'undefined';";
	private static final String JS_JQUERY_ACTIVE = "return jQuery.active != 0;";
	private static final String JS_PRIMEFACES_QUEUE_NOT_EMPTY = "return !PrimeFaces.ajax.Queue.isEmpty();";

	private static final int TIME_OUT_SECONDS=10;
	private static final int POLLING_MILLISECONDS=500;
	private WebDriver driver;

	
	public Helper (WebDriver driver){
		this.driver = driver;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void waitForJQueryAndPrimeFaces() {
	   new FluentWait(driver).withTimeout(TIME_OUT_SECONDS, TimeUnit.SECONDS)
	      .pollingEvery(POLLING_MILLISECONDS, TimeUnit.MILLISECONDS)
	      .until(new Function < WebDriver, Boolean >() {
	         @Override
	         public Boolean apply(WebDriver input) {
	            boolean ajax = false;
	            boolean jQueryDefined = executeBooleanJavascript(input, JS_JQUERY_DEFINED);
	            boolean primeFacesDefined = executeBooleanJavascript(input, JS_PRIMEFACES_DEFINED);

	            if (jQueryDefined) {
	               // jQuery is still active
	               ajax |= executeBooleanJavascript(input, JS_JQUERY_ACTIVE);
	            }
	            if (primeFacesDefined) {
	               // PrimeFaces queue isn't empty
	               ajax |= executeBooleanJavascript(input, JS_PRIMEFACES_QUEUE_NOT_EMPTY);
	            }

	            // continue if all ajax request are processed
	            return !ajax;
	         }
	      });
	}

	private boolean executeBooleanJavascript(WebDriver input, String javascript) {
	   return (Boolean) ((JavascriptExecutor) input).executeScript(javascript);
	}

}
