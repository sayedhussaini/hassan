package _E_action_sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _D_C_Util__Practice {

	WebDriver driver;

	public _D_C_Util__Practice(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By Locator) {
		WebElement element = null;
		try {

			driver.findElement(Locator);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return element;

	}

	public void doClick(By Locator) {
		try {
			driver.findElement(Locator).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void dosendkeys(By Locator, String value) {
		try {
			driver.findElement(Locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}
