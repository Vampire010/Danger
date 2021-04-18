package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/eclipse-workspace/Java_Selenium_batch63/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://parabank.parasoft.com");
	}

}
