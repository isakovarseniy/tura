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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.Row;

public class TreeRow implements Row {

	private WebElement element;	
	private WebDriver driver;
	
	public TreeRow(WebElement element, WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}

	@Override
	public WebElement getCell(int index) {
		return  element.findElement(By.cssSelector("span[class*='ui-treenode-content']"));
	}

	@Override
	public void click() {
		element.click();
		Helper helper = new Helper(driver);
		helper.waitForJQueryAndPrimeFaces();
		
	}

	public void open(){
		getCell(0).findElement(By.cssSelector("span[class*='ui-tree-toggler']")).click();
		Helper helper = new Helper(driver);
		helper.waitForJQueryAndPrimeFaces();
	}
	
	public void close(){
		open();
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
