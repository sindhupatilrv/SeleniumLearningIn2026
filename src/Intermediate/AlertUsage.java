package Intermediate;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.TimesPanel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertUsage {

	public static void main(String[] args) throws Exception {
		System.out.println("Alert Usage on Selenium");
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.qaplayground.com/practice?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[normalize-space()='Dialog'])[1]")).click();
		Thread.sleep(500);
		
		// Simple Alert
		WebElement element = driver.findElement(By.xpath("//button[@id='simple-alert']"));
		element.click();
	
		Alert SimpleAlert = driver.switchTo().alert();
		System.out.println(SimpleAlert.getText());
		
		Thread.sleep(300);
		SimpleAlert.accept();
		 Thread.sleep(300);
		 
		driver.findElement(By.xpath("//button[@id='confirm-alert']")).click();
		SimpleAlert = driver.switchTo().alert();
		System.out.println(SimpleAlert.getText());
		SimpleAlert.accept();
	
		//Prompt Alert
		/* driver.findElement(By.id("prompt-alert")).click();
		 SimpleAlert = driver.switchTo().alert();
		 Thread.sleep(400);
		 SimpleAlert.sendKeys("test");
		 SimpleAlert.accept();
		 */
		 //Toast Alerthttps://www.qaplayground.com/practice/alert
		
		 WebElement toastMessage = driver.findElement(By.id("toast-alert"));
		toastMessage.click();
		 String message = toastMessage.getAttribute(null)
		 System.out.println("Alert Toast message " + message);
		
		 driver.close();
		 driver.quit();

	}

}
