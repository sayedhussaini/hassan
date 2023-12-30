package _J_Hashmapandmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {
	public static void main(String[] args) {

//	Map<String, String> userMap=new HashMap<String ,String >();
//	
//	userMap.put("admine", "admine_admine");
//	userMap.put("patient", "tom@gmail.com_test1234");
//	userMap.put("doctor", "ali@gmail.com_test123445");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//	driver.findElement(By.id("username")).sendKeys(userMap.get("doctor").split("_")[0]);
//	driver.findElement(By.id("password")).sendKeys(userMap.get("patient").split("_")[1]);

		doLogin(driver, getUserMap(), "admine");
		
		driver.close();

	}

	public static Map<String, String> getUserMap() {

		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("admine", "admine_admine");
		userMap.put("customer", "Ali@gmail.com_123456");
		userMap.put("Owner", "Aliii@gmail.com_123456");

		return userMap;

	}

	public static void doLogin(WebDriver driver, Map<String, String> userMap, String userKey) {
		driver.findElement(By.id("username")).sendKeys(userMap.get(userKey).split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userMap.get(userKey).split("_")[1]);

	}

}
