package _G_Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _A_DropDownHandle {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		// how write
		// //div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']
		// (Xpath)
//
//		List<WebElement> choiceList =  driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
//
//		for (int i =0 ; i<choiceList.size();i++) {
//			System.out.println(choiceList.get(i).getText());
//			String text=choiceList.get(i).getText();
//			if (text.equals("choice2 3")) {
//				choiceList.get(i).click();
//				break;
		// }
		// }

		selectChoiceValues(driver, "all");
		driver.close();
	
	}

	public static void selectChoiceValues(WebDriver driver, String... value) {

		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		if (!value[0].equalsIgnoreCase("All")) {

			for (int i = 0; i < choiceList.size(); i++) {
				System.out.println(choiceList.get(i).getText());
				String text = choiceList.get(i).getText();

				for (int k = 0; k < value.length; k++) {
					if (text.equals(value[k])) {
						choiceList.get(i).click();
						break;
					}

				}

			}

		} else {
			try {
			for (int all = 0; all < choiceList.size(); all++) {
				choiceList.get(all).click();
				
			}
			}catch (Exception e) {
				e.getMessage();
			}
		}

	}

}
