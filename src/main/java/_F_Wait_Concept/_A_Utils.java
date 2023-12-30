package _F_Wait_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _A_Utils {

	WebDriver driver;

	public _A_Utils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By Locator) {
		WebElement element = null;
		try {
			element = driver.findElement(Locator);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return element;
	}

	public void doclick(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void doSendKey(By locator, String value) {
		try {
			driver.findElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}