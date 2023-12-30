package _E_action_sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _D_D_Util_Practice {

	WebDriver driver;

	public _D_D_Util_Practice(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement locator(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return element;
	}

	public void doClick(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void doSendKeyWord(By locator, String value) {
		try {
			driver.findElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
