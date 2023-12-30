package _E_action_sendKeys;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _B_ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File file = new File("C:\\Users\\User\\Desktop");
		FileUtils.copyFile(srcFile, new File("./target/screenshots/new.png"));
		/*
		 * (./) =this means is you're project directory and then you need you're folder
		 * for exam and then you gave the future file name , java create it to save
		 * screen shots and then you have to gave the file name , java will create it
		 */
		driver.close();
		      
		
		
		

	}
}
