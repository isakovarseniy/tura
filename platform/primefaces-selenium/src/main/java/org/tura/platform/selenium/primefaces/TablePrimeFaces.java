/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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
import org.tura.platform.selenium.Header;
import org.tura.platform.selenium.Row;
import org.tura.platform.selenium.Table;

public class TablePrimeFaces implements Table {

	
	private WebElement element;
	private WebDriver driver;
	
	public TablePrimeFaces(WebElement element, WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}
	
	@Override
	public Row getRow(int index) {
		return  new TableRow (element.findElement(By.cssSelector("tr[data-ri='" +index+"']")),driver);
	}

	@Override
	public Header getHeader() {
		return  new TableHeader(element.findElement(By.cssSelector("tr[role='row']")),driver);
	}

	@Override
	public boolean isEmpty() {
		return element.findElement(By.cssSelector("tr[class='ui-widget-content ui-datatable-empty-message']")).isDisplayed();
	}

	@Override
	public void nextPage() {
		Helper helper = new Helper(driver);

		WebElement pagenatorNextElement =  element.findElement(By.cssSelector(  "span[class='ui-icon ui-icon-seek-next']" ));
		pagenatorNextElement.click();
		helper.waitForJQueryAndPrimeFaces();
	}

	@Override
	public void prevPage() {
		Helper helper = new Helper(driver);

		WebElement pagenatorNextElement =  element.findElement(By.cssSelector(  "span[class='ui-icon ui-icon-seek-prev']" ));
		pagenatorNextElement.click();
		helper.waitForJQueryAndPrimeFaces();
	}

}
