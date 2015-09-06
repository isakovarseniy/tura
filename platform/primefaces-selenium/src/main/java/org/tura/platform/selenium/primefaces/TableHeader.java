package org.tura.platform.selenium.primefaces;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tura.platform.selenium.Header;

public class TableHeader implements Header {

	private WebElement element;
	@SuppressWarnings("unused")
	private WebDriver driver;

	public TableHeader(WebElement element, WebDriver driver) {
		this.element=element;
		this.driver = driver;
	}

	@Override
	public WebElement getCell(int index) {
		List<WebElement> ls =element.findElements(By.cssSelector("th[role='columnheader']"));
		return ls.get(index);
	}

}
