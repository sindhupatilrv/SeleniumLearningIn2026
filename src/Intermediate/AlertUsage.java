package Intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Basic Alert Usage 
 *  driver.switchTo().alert() - to switch to new alert
 *  Alert message = driver.switchT0().alert().accept() - OK
 *  Alert message = driver.switchTo().alert().dismiss() - Cancel
 *  driver.switchTo().alert().senKey("TEXT") - to add a message
 *   Toast message - not handle with alert method
 *   
 *  
 */
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
		 driver.findElement(By.id("prompt-alert")).click();
		 driver.switchTo().alert().sendKeys("text");
		 Thread.sleep(400);
		 driver.switchTo().alert().accept();
		 Thread.sleep(400);
		 
		 
		 //Toast Alerthttps://www.qaplayground.com/practice/alert
	
		/*
		 WebElement toastMessage = driver.findElement(By.id("toast-alert"));
		toastMessage.click();
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.vis)
		String message = toastMessage.getAttribute(nul)t
		 System.out.println("Alert Toast message " + message);	
		 
		 // Modern Alert 
		driver.findElement(By.xpath("//button[contains(text(),'Sweet Alert')]")).click();
		Alert modernAlert = driver.switchTo().alert();
		modernAlert.accept();
		System.out.println(modernAlert.getText());  */
		 driver.close();
		 driver.quit();

	}

}
