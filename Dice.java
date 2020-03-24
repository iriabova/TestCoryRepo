package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\OneDrive\\Desktop\\selenium\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.dice.com/dashboard");
	}

}
