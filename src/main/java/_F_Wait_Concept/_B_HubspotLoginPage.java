package _F_Wait_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _B_HubspotLoginPage {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https//app.hubspot.com/login");
		// implicitlyWait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginbutn");

		_A_Utils utils = new _A_Utils(driver);

		utils.doSendKey(email, "email@gmail.com");
		utils.doSendKey(password, "123457");
		utils.doSendKey(loginButton, "loginButton");

	}
}
