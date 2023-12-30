package _E_action_sendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _A_ActionEvents {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		Thread.sleep(500000);

		WebElement emailId = driver.findElement(By.id("username"));
		WebElement passId = driver.findElement(By.id("password"));
		WebElement loginbotton = driver.findElement(By.id("loginBtn"));

		Actions action = new Actions(driver);

		action.sendKeys(emailId, "test@gmai.com").build().perform();
		action.sendKeys(passId, "12233chjkgdhfjkfahau").build().perform();
		action.click(loginbotton).build().perform();

		
		
		
//		webdrivermaneger driver = new chromedrive();
}
}
