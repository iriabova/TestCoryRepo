package TestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();

         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
         driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
         
         driver.get("https://www.aa.com/");
         
         WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm.loginId\"]"));
         WebElement username1 = driver.findElement(By.id("loginForm.loginId"));
		WebElement username2 = driver.findElement(By.name("_CSRF"));
		
		WebElement password = driver.findElement(By.id("loginForm.password"));
		WebElement password1 = driver.findElement(By.name("lastName"));
		WebElement password2 = driver.findElement(By.xpath("//input[@id='loginForm.lastName']"));
		
	  WebElement menuItem = driver.findElement(By.id("aa-site-search"));
	  WebElement menuItem1 = driver.findElement(By.xpath("//li[@id='aa-site-search']"));
	  
	  
	//WebElement username2 = driver.findElement
	//WebElement username2 = driver.findElement
	  
	  //departure with css selector
	  WebElement departure = driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
	  departure.clear();
	  departure.sendKeys("JULIA");
	  WebElement arrival = driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.destinationAirport']"));
	  arrival.sendKeys("RUSSIA");
	  WebElement rememberMeButton= driver.findElement(By.cssSelector("input[id='loginForm.rememberMeCheckbox']"));
	  rememberMeButton.click();
	  
	  WebElement rememberMeButton1= driver.findElement(By.cssSelector("span[class='control left']"));
	  rememberMeButton1.click();
	  WebElement rememberMeButton2= driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/label/span[1]"));
	  rememberMeButton2.click();
	  
	  WebElement departureDate= driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
	  departureDate.click();
	  
	  WebElement roundTrip = driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[1]/div[1]/label/span[1]"));
	  roundTrip.click();
	 // driver.get("https://www.aa.com/homePage.do");
	  
	  WebElement passengerNumber = driver.findElement(By.xpath("//*[@id=\"flightSearchForm.adultOrSeniorPassengerCount\"]"));
	  passengerNumber.click();
	  
	  WebElement loginButton = driver.findElement(By.xpath("//input[@name='_button_go']"));
	  loginButton.click();
	  loginButton.sendKeys(Keys.ENTER);
      
	  WebElement loginButton2 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/input"));
	  loginButton2.sendKeys(Keys.ENTER);
	}

}


