package TestSelenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
      //chromeOptions.addArguments("--headless");
		 WebDriver driver = new ChromeDriver(chromeOptions);

         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
         driver.manage().window().maximize();
         
         
         driver.get("https://www.aa.com/homePage.do");
         
         //1. grab the departure box xpath
         //2. store in a WebElement object
         //3. clear the box
         //4. send (Wash) value
         //5. create a list for storing webElement of dropdown
         //6. create a for loop to travel to list indexes
         //7. write an if condition to click or select value we want
         //8.breake from the loop
         //WebElement departure = driver.findElement(By.xpath("//input[@class='aaAutoComplete ui-autocomplete-input' and @id='reservationFlightSearchForm.originAirport']"));
         
         //departure with cssSelector
         
          Actions actions=new Actions(driver);
         
         WebElement idRequerments = driver.findElement(By.xpath("//a[text()='ID requirements are changing']"));
         actions.moveToElement(idRequerments).build().perform();
         Thread.sleep(1000);
         
         WebElement departure = driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
         departure.clear();
         departure.sendKeys("Wash");
         List<WebElement> airports = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
         System.out.println(airports.size());
         
         for (WebElement element:airports) {
        	 try {
        		 if(element.getText().contains("BWI"))
        			 element.click();
        		 break;
        	 }catch(StaleElementReferenceException e) {
        		 System.out.println("Element is no longer attached to dom");
        	 }
        	 
         }
         Utility.screenshot(driver,"C:\\Users\\julia\\eclipse-workspace\\SeleniumProjectNew\\output","AA");
         
         
         WebElement arrival = driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm.destinationAirport\"]"));
         arrival.clear();
         arrival.sendKeys("las");
         List<WebElement> airports1= driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
         System.out.println(airports1.size());
         
         for (WebElement element1:airports1) {
        	 try {
        		 if(element1.getText().contains("LAS"))
        			 try {
        			element1.click();
        			 }catch (ElementNotInteractableException e) {
        				 element1.click();
        			 }
        		 break;
        	 }catch(StaleElementReferenceException e) {
        		 System.out.println("Element is no longer attached to dom");
        	 }
        	 
         }
         Actions actions1=new Actions(driver);
         WebElement component = driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[5]/div[1]/div/p[3]/a"));
         actions1.moveToElement(component).build().perform();
         Thread.sleep(3000);
         
         WebElement numberPassengers = driver.findElement(By.xpath("//*[@id=\"flightSearchForm.adultOrSeniorPassengerCount\"]"));
         
         Select select =new Select(numberPassengers);
         //select.selectByIndex(8);
                         select.selectByVisibleText("5");
         
                       //Storind departure date in a wenElement obj
         WebElement departureCalendar = driver.findElement(By.xpath("//*[@id=\'aa-leavingOn\']"));
                       //selecting desired date using JSExecutor class
         Utility.selectDateByJS(driver, departureCalendar, "11/21/2019");
         
         WebElement returnCalendar = driver.findElement(By.xpath("//*[@id=\'aa-returningFrom\']"));
         Utility.selectDateByJS(driver, returnCalendar, "11/30/2019");
         
         Utility.screenshot(driver,"C:\\Users\\julia\\eclipse-workspace\\SeleniumProjectNew\\output","Reservation1");
	}

}
