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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.DropDownSelection;

public class DropDownSelectionPrimeFaces implements DropDownSelection {

	private WebElement element;
	private String id;
	private WebDriver driver;

	public DropDownSelectionPrimeFaces(WebElement element, String id, WebDriver driver) {
		this.element = element;
		this.id=id;
		this.driver=driver;
	}

	@Override
	public void click() {
		WebElement e = element.findElement(By
				.cssSelector("label[class*='ui-selectonemenu-label']"));
		e.click();
		Helper helper = new Helper(driver);
		helper.waitForJQueryAndPrimeFaces();
	}

	@Override
	public String getValue() {
		WebElement e = element.findElement(By
				.cssSelector("label[class*='ui-selectonemenu-label']"));
		return e.getText();

	}

	@Override
	public void setValue(String value) {
		click();
		Helper helper = new Helper(driver);
		WebElement el = driver.findElement(By.cssSelector("div[id*='"+ id+"_panel']"));
		el.findElement(By.xpath("//div/ul/li[text()='" + value + "']")).click();
		helper.waitForJQueryAndPrimeFaces();
	}

}
