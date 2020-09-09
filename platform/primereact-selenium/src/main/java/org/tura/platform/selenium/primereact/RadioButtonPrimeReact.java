/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.selenium.RadioButton;

public class RadioButtonPrimeReact implements RadioButton {

	
	private WebElement element;
	@SuppressWarnings("unused")
	private WebDriver driver;

	
	public RadioButtonPrimeReact (WebElement element, WebDriver driver) {
		this.element = element;
		this.driver = driver;
	}

	
	
	
	
	@Override
	public String getLabel() {
		WebElement e = element.findElement(By.xpath("./../../../label"));
		return e.getText();
	}

	
	
	@Override
	public boolean getValue() {
		if (  element.getAttribute("checked") == null) {
			return false;
		}else {
			return true;
		}
	}


	@Override
	public void click() {
		WebElement e = element.findElement(By.xpath("./../.."));
		e.click();
	}

}
