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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.InputText;

public class PasswordPrimeReact implements InputText {

	private WebElement element;
	@SuppressWarnings("unused")
	private WebDriver driver;

	public PasswordPrimeReact(WebElement element, WebDriver driver) {
		this.element = element;
		this.driver = driver;
	}

	@Override
	public void click() {
		element.click();

	}

	@Override
	public String getValue() {
		List<WebElement> ls = element.findElements(By.cssSelector("input"));
		return ls.get(0).getAttribute("value");
	}

	@Override
	public void setValue(Object value) {
		List<WebElement> ls = element.findElements(By.cssSelector("input"));
		if (value instanceof String)
			ls.get(0).sendKeys((String) value);
		if (value instanceof Keys)
			ls.get(0).sendKeys((Keys) value);
	}

	@Override
	public void clear() {
		List<WebElement> ls = element.findElements(By.cssSelector("input"));
		ls.get(0).clear();
	}

}
