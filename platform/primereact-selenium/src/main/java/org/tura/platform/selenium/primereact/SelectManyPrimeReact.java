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
import org.tura.platform.selenium.SelectMany;

public class SelectManyPrimeReact implements SelectMany{

	private WebElement element;
	@SuppressWarnings("unused")
	private WebDriver driver;

	public SelectManyPrimeReact(WebElement element,  WebDriver driver) {
		this.element = element;
		this.driver=driver;
	}
	
	
	
	@Override
	public void click() {
		WebElement e = element.findElement(By
				.cssSelector("label"));
		e.click();
	}

	@Override
	public String getValue() {
		WebElement el = element.findElement(By.cssSelector("div[class*='p-multiselect-label-container']"));
		return el.findElement(By.xpath("./label")).getText();
	}

	@Override
	public void setValue(String value) {
		WebElement el = element.findElement(By.cssSelector("div[class*='p-multiselect-items-wrapper']"));
		el.findElement(By.xpath("./ul/li/label[text()='" + value + "']")).click();
		
	}

}