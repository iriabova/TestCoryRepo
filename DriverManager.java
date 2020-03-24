package TestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0. set system property for chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
        
        //1. Instatiate chrome driver
                WebDriver driver = new ChromeDriver();
        
        // browser manage commands:
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //giving the browser 30 seconds before showing and error
        driver.manage().window().maximize();
        
        
        //2. get to facebook page
                driver.get("https://www.facebook.com/");
                
        //3. get facebook title
        
        String actualTitle = driver.getTitle();
        
        //4. store title in string name actualTitle
System.out.println(actualTitle);
		

	}

}
