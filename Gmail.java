package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver","C:\\Users\\julia\\OneDrive\\Desktop\\selenium\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://mail.google.com/");


String actualTitle = driver.getTitle();

//4. store title in string name actualTitle
System.out.println(actualTitle);


	}

}
