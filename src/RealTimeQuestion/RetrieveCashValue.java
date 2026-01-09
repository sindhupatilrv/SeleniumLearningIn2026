package RealTimeQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveCashValue {
	
	public static void main(String[] arg) {
	//write a script that enters a cash prize into an input field, then retrieves and prints the entered value from the field."
	// n getAttribute("value") is used to fetch the current value of an input field.
		
		//TO-DO Plan -afer finding the webpage
		//logic
	
		String url = "https://www.lambdatest.com/selenium-playground/simple-form-demo";
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
//id="user-message"
	        WebElement EntercashPrize = driver.findElement(By.id("user-message"));
	        EntercashPrize.sendKeys("$5000");

	        String enteredValue = EntercashPrize.getAttribute("value");
	        System.out.println("Cash Prize Entered with Dollar sym " + enteredValue);
	        
	        driver.close();
	        driver.quit();
		
		
		
	}

}
