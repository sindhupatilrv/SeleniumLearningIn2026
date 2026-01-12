package Intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		WebElement element = driver.findElement(By.xpath("//button[@id='simple-alert']"));
		element.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
		
		driver.findElement(By.xpath("//button[@id='confirm-alert']")).click();
		simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
		simpleAlert.di
		
		driver.findElement(By.xpath(" //button[@id='prompt-alert']")).click();
		simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
		
		
		
		driver.close();
		driver.quit();
		

	}

}
