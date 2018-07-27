/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.Row;

public class TableRow implements Row {

	private WebElement element;
	private WebDriver driver;

	public TableRow(WebElement element, WebDriver driver) {
		this.element = element;
		this.driver = driver;
	}

	@Override
	public WebElement getCell(int index) {
		List<WebElement> ls = element.findElements(By
				.cssSelector("td[role='gridcell']"));
		return ls.get(index);
	}

	@Override
	public boolean isSelected() {
		String str = element.getAttribute("aria-selected");
		if ("true".equals(str))
			return true;
		else
			return false;

	}

	@Override
	public void click() {
		element.click();
		Helper helper = new Helper(driver);
		helper.waitForJQueryAndPrimeFaces();

	}

	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		
	}
}
