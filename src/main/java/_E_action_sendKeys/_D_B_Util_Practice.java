package _E_action_sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _D_B_Util_Practice {

	WebDriver driver;

	public void _D_B_Util_Prctice(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {

			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Wrong Entry");
			System.out.println(e.getMessage());
		}
		return element;

	}

	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("Wrong entry");
			System.out.println(e.getMessage());
		}
	}

	public void doSendKeys(By locator, String value) {

		try {
			getElement(locator).sendKeys(value);

		} catch (Exception e) {
			System.out.println("Wrong entry");
			System.out.println(e.getMessage());
		}

	}

}
