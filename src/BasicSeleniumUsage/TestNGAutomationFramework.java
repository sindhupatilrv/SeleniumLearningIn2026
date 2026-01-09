package BasicSeleniumUsage;

import java.net.URL;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAutomationFramework {

	public static String url = "https://demoqa.com/";
		
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);	
		driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();
		Thread.sleep(120);
		driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
		Thread.sleep(120);
		WebElement element1 = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		if (element1.isSelected()) {
			
		}
	}
	
	

}
