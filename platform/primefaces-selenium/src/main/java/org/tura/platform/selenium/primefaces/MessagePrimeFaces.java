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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.Message;

public class MessagePrimeFaces  implements Message {

	private WebElement element;
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public MessagePrimeFaces(WebElement element, WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}
	
	@Override
	public String getValue() {
		return element.getText();
	}

	@Override
	public boolean isError() {
		return element.getAttribute("class").contains("ui-message-error");
	}
	
	
}
