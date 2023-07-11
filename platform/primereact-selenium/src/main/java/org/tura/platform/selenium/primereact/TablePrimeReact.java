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
import org.tura.platform.selenium.Header;
import org.tura.platform.selenium.Row;
import org.tura.platform.selenium.Table;

public class TablePrimeReact implements Table {

	
	private WebElement element;
	private WebDriver driver;
	
	public TablePrimeReact(WebElement element, WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}
	
	@Override
	public Row getRow(int index) {
		WebElement el = element.findElement(By.cssSelector("div[class*='p-datatable-wrapper']"));
		List<WebElement> list = el.findElements(By.xpath("./table/tbody/tr[not (@class='p-datatable-emptymessage') ]"));
		return  new TableRow ( list.get(index),driver);
	}

	@Override
	public Header getHeader() {
		return  new TableHeader(element.findElement(By.cssSelector("tr")),driver);
	}

	@Override
	public boolean isEmpty() {
		WebElement el = element.findElement(By.cssSelector("div[class*='p-datatable-wrapper']"));
		List<WebElement> list = el.findElements(By.xpath("./table/tbody/tr[@class='p-datatable-emptymessage']"));
		return list.size() == 1;
	}

	@Override
	public void nextPage() {

		WebElement pagenatorNextElement =  element.findElement(By.cssSelector(  "button[class*='p-paginator-next']" ));
		if ( pagenatorNextElement.isEnabled()) {
	  	   pagenatorNextElement.click();
		}
		
		Point p = pagenatorNextElement.getLocation();
		Actions builder = new Actions(driver);  
		builder.moveToElement(pagenatorNextElement,p.x+50 , p.y+50).click().build().perform();

	}

	@Override
	public void prevPage() {
		WebElement pagenatorNextElement =  element.findElement(By.cssSelector(  "button[class*='p-paginator-prev']" ));
		if (pagenatorNextElement.isEnabled() ) {
			pagenatorNextElement.click();
		}
		
		Point p = pagenatorNextElement.getLocation();
		Actions builder = new Actions(driver);  
		builder.moveToElement(pagenatorNextElement,p.x+50 , p.y+50).click().build().perform();
	}

}
