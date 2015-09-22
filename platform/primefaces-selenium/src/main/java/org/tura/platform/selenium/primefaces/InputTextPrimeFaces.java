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

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.InputText;

public class InputTextPrimeFaces implements InputText {

	private WebElement element;
	private WebDriver driver;

	public InputTextPrimeFaces(WebElement element, WebDriver driver) {
		this.element = element;
		this.driver = driver;
	}

	@Override
	public void click() {
		element.click();
		Helper helper = new Helper(driver);
		helper.waitForJQueryAndPrimeFaces();

	}

	@Override
	public String getValue() {
		return element.getAttribute("value");
	}

	@Override
	public void setValue(Object value) {
		if (value instanceof String)
			element.sendKeys((String) value);
		if (value instanceof Keys)
			element.sendKeys((Keys) value);
	}

}
