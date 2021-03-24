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

package org.tura.platform.selenium.primereact;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.tura.platform.selenium.Row;

public class TableRow implements Row {

	private WebElement element;
	@SuppressWarnings("unused")
	private WebDriver driver;

	public TableRow(WebElement element, WebDriver driver) {
		this.element = element;
		this.driver = driver;
	}

	@Override
	public WebElement getCell(int index) {
		List<WebElement> ls = element.findElements(By
				.cssSelector("td"));
		return ls.get(index);
	}

	@Override
	public boolean isSelected() {
		String str = element.getAttribute("class");
		return str.contains("p-highlight");
	}

	@Override
	public void click() {
		new Repeater() {
			
			@Override
			public void action() {
				element.click();
			}
		}.repeat(10);;

	}

	@Override
	public void doubleClick() {
		throw new UnsupportedOperationException();
		
	}

	public WebElement getSelectionColumn() {
		return element.findElement(By.cssSelector("td[class='p-selection-column']"));
	}
	
	@Override
	public void enableEditMode() {
		WebElement edit = element.findElement(By.cssSelector("span[class*='p-row-editor-init-icon']"));
		edit.click();
	}

	@Override
	public void acceptRowChange() {
		new Repeater() {

			@Override
			public void action() {
				WebElement edit = element.findElement(By.cssSelector("span[class*='pi-check']"));
				edit.click();
			}
			
		}.repeat(10);
		
	}

	@Override
	public void rejecttRowChange() {
		WebElement edit = element.findElement(By.cssSelector("span[class*='pi-times']"));
		edit.click();

	}
	
	@Override
	public void rightClick() {
		Actions act = new Actions(driver);
		act.contextClick(getCell(0).findElement(By.cssSelector("span[class*='p-treenode-label']")));
		act.perform();
	}

	
}