/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class SeleniumActionExecutor {
	
	private By[] elements;
	private WebDriver driver;
	private ArrayList<WebElement> webElements = new ArrayList<>();
	
	public SeleniumActionExecutor( WebDriver driver, By ...elements){
		this.elements = elements;
		this.driver = driver;
	}
	
	
	public abstract void action(WebDriver driver);
	
	public void run(){
		for ( By id :elements){
			webElements.add( driver.findElement(id));
		}
		action(driver);
        for (WebElement webElement : webElements){
        	WebDriverWait wait = new WebDriverWait(driver, 10);
        	wait.until( ExpectedConditions.stalenessOf(webElement));
        }
		
	}

}
