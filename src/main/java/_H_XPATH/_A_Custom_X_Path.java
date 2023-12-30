package _H_XPATH;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _A_Custom_X_Path {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://app.hubspot.com/login");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	//htmltag[@prop1='value']
	//input [@id='username']
	
	//htmltag[@prop'value'and@prop2='value']
	//input[@id='username'and@type='email']
	
	//input [@class='from-control private-from__control login-email']
	
	//contains() in xpath :
	//htmltag[contains (@prop,'value')]
	//i18n-string[text()[text()='Forgot my Password']
	
	//h2 [text()"that email address doesn't excist ."]
	//span[text()"Show Password']
	//span [contains (text(),'show password ')]
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
