package _E_action_sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _E_LoginPageClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);

		// page objects:

		By emailid = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");

		_D_A_Util util = new _D_A_Util(driver);

//		util.getElement(emailid).sendKeys("test@gmail.com");
//		util.getElement(password).sendKeys("test@1345");
//		util.getElement(loginButton).click();
		
       util.doSendKeys(emailid, "Hassan@gmail.com");
       util.doSendKeys(password, "12334566");
       util.doClick(loginButton);
       
       driver.close();
       

	}
}
