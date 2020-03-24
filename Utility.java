package TestSelenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	
	public static void screenshot (WebDriver driver, String locationoffFile, String fileName) throws IOException {
		
		//take screen shot using TakeScreenshot method of selenium and store as file
		// give Location path, file name, file type ".png"
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File(locationoffFile+fileName+".png"));
		
	}
     /*
      * this Method captures date from Calendar using Java Script Executor
      */
	public static void selectDateByJS(WebDriver driver, WebElement element, String date) {
		//create object of JavaScriptExecutor class
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		// we use executeScript method to capture date
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
	}
	
}
