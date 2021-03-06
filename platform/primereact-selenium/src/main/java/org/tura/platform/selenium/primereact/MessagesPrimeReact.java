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
import org.tura.platform.selenium.Messages;

public class MessagesPrimeReact implements Messages {

	
	private WebElement element;
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public MessagesPrimeReact(WebElement element, WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}
	
	public String getValue(int i) {
		List <WebElement> el =  element.findElements(By.cssSelector("span[class*='p-message-detail']"));
		return el.get(i).getText();
	}

	public String getValue() {
		return getValue(0);
	}
	
	
}
