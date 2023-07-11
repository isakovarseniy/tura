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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.Row;
import org.tura.platform.selenium.Tree;

public class TreePrimeReact implements Tree{

	
	private WebElement element;
	private WebDriver driver;
	
	public TreePrimeReact(WebElement element , WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}	
	
	@Override
	public Row getRow(final Object key) {
		
		final WebElement[] res = new WebElement []{null};
		new Repeater() {
			@Override
			public void action() {
				String keys[]  = ((String )key).split("_");
				WebElement el = element;
				for ( int i = 0; i < keys.length ; i++) {
					List<WebElement> list = el.findElements(By.xpath("./ul/li/div"));
					boolean found = false;
					for ( WebElement we : list) {
						if ( we.getAttribute("aria-posinset").equals(keys[i])) {
							el = we.findElement(By.xpath("./.."));
							found = true;
						}
					}
					if ( !found) {
						throw new RuntimeException("Key not found");
					}
				}
				res[0]=el;
			}
		}.repeat(5);
		
		return  new TreeRow (res[0],driver);
	}
	
}
