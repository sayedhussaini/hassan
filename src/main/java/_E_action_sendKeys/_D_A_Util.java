package _E_action_sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _D_A_Util {

	WebDriver driver;

	public _D_A_Util(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is used to create the webElement on the basis of by locator
	 * 
	 * @param locator
	 * @return
	 */

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("the in put you entered is not valid someHow");
			System.out.println(e.getMessage());
		}
		return element;// is local variable local variable have default variable which is null or zero
	}

	public void doClick(By locator) {
		try {

			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("Not the right input ");
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * This Method is used to pass the values in a webElement
	 * @param locator
	 * @param value
	 */

	public void doSendKeys(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("You didnt enter the right input");
			System.out.println(e.getMessage());
		}
	}
}