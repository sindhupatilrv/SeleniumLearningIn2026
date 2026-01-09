package BasicSeleniumUsage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * sendKeys()
 * xpath 
 * WebElement value is return Value is String eg. WebElement element = element.getText() -> return String 
 * How to pass int value in .SendKey() - sendKeys(String.valueOf(number1));
 * Convert int to String - String actualSumStr = String.valueOf(intVariable);
 * Comvert String to Int Value - String expectedSumStr = totalSum.getText(); int expectedSum = Integer.parseInt(expectedSumStr);
 */

public class ButtonTestonUI {

	public static void main(String[] args) {
		
		WebDriver driver;
		String url= "https://www.lambdatest.com/selenium-playground/simple-form-demo";
		String inputValue = "Sindhu";
		int number1 = 10;
		int number2 = 20;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// One element click
		driver.findElement(By.id("user-message")).sendKeys(inputValue);
		driver.findElement(By.xpath("//button[@id='showInput']")).click();
		
		WebElement expectedValue = driver.findElement(By.xpath("//p[@id='message']"));
		Assert.assertEquals(inputValue, expectedValue.getText());
		String expectedVal = expectedValue.getText();
		System.out.println("Actual Input Value is : " + inputValue);
		System.out.println("Expected Value is:" + expectedVal);
		
		// Two elements click
		
		driver.findElement(By.xpath("//input[@id ='sum1']")).sendKeys(String.valueOf(number1));
		driver.findElement(By.xpath("//input[@id ='sum2']")).sendKeys(String.valueOf(number2));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(" //button[normalize-space()='Get Sum']")).click();
		
		int actualSum  = number1 + number2;
		String as = String.valueOf(actualSum);
		
		WebElement totalSum = driver.findElement(By.xpath("//p[@id='addmessage']"));
		String expectedSum = totalSum.getText();
		System.out.println("Output from Get text -int Value\t" + expectedSum);
		System.out.println("Actual data\t" + as);	
		driver.close();
		
		
		
				
		

	}

}

