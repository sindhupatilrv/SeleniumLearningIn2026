package test.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAutomationFramework {

	public static String url = "https://demoqa.com/";
		
	public WebDriver driver;
	
	 @BeforeMethod
	 public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);	
		driver.manage().window().maximize();
	 }
	
	 @Test
	 public void screenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\SeleniumLearning\\homepage.png");
	     FileUtils.copyFile(source, destination);
	 }
	  
	 @AfterMethod
	 public void closeDriver() {
		 driver.close();
		 driver.quit();
	 }
		
		
}

