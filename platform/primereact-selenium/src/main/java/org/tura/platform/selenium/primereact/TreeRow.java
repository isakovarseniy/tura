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

package org.tura.platform.selenium.primereact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		return  element;
	}

	@Override
	public void click() {
		new Repeater() {
			@Override
			public void action() {
				getCell(0).findElement(By.cssSelector("div[class*='p-treenode-content']")).click();
			}
		}.repeat(10);
	}
	
	@Override
	public void doubleClick() {
		Actions act = new Actions(driver);
		act.doubleClick(getCell(0).findElement(By.cssSelector("div[class*='p-treenode-content']")));
		act.perform();
	}	
	
	public void check() {
		new Repeater() {
			@Override
			public void action() {
				getCell(0).findElement(By.cssSelector("div[class*='p-checkbox']")).click();
			}
		}.repeat(10);
	}
	

	public void open(){
		getCell(0).findElement(By.cssSelector("span[class*='p-tree-toggler-icon']")).click();
	}
	
	public void close(){
		open();
	}

	@Override
	public boolean isSelected() {
		if ("true".equals( element.findElement(By.cssSelector("div[class*='p-treenode-content']")).getAttribute("aria-selected")))
				return true;
		return false;
	}

	public boolean isPartialSelected() {
		if ("false".equals( element.findElement(By.cssSelector("div[class*='p-checkbox-box']")).getAttribute("aria-checked")))
				return true;
		return false;
	}
	
	@Override
	public void enableEditMode() {
		doubleClick();
	}

	@Override
	public void acceptRowChange() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void rejecttRowChange() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void rightClick() {
		Actions act = new Actions(driver);
		act.contextClick(getCell(0).findElement(By.cssSelector("div[class*='p-treenode-content']")));
		act.perform();
	}
	
}
