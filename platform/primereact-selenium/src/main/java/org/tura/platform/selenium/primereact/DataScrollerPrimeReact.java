/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.tura.platform.selenium.DataScroller;

public class DataScrollerPrimeReact implements DataScroller{

	private WebElement element;
	private WebDriver driver;
	
	public DataScrollerPrimeReact(WebElement element, WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}

	
	@Override
	public WebElement getRow(int index) {
		List<WebElement> list = element.findElements(By.xpath("./div/div/div"));
		return  list.get(index);
	}

	@Override
	public WebElement getCell() {
		return null;
	}
	
	
	@Override
	public void nextPage() {

		WebElement pagenatorNextElement =  element.findElement(By.cssSelector(  "button[class*='p-paginator-next']" ));
		pagenatorNextElement.click();
		
		Point p = pagenatorNextElement.getLocation();
		Actions builder = new Actions(driver);  
		builder.moveToElement(pagenatorNextElement,p.x+50 , p.y+50).click().build().perform();

	}

	@Override
	public void prevPage() {
		WebElement pagenatorNextElement =  element.findElement(By.cssSelector(  "button[class*='p-paginator-prev']" ));
		pagenatorNextElement.click();
		
		Point p = pagenatorNextElement.getLocation();
		Actions builder = new Actions(driver);  
		builder.moveToElement(pagenatorNextElement,p.x+50 , p.y+50).click().build().perform();
		
	}
	

}
