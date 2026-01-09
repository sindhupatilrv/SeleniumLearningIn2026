package BasicSeleniumUsage;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.qaplayground.com/practice?utm_source=chatgpt.com");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='Toggle']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(null)
		Thread.sleep(1000);
		WebElement isSelect = driver.findElement(By.xpath("(//input[@name='selectOne'])[1]"));
		isSelect.click();
		if(isSelect.isSelected()) {
			isSelect.click();
			System.out.println("Print - You have selected Yes");
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='confirm'])[1]")));
	
		Thread.sleep(1000);
		WebElement isSelect1 = driver.findElement(By.xpath("(//input[@name='confirm'])[1]"));
		isSelect1.click();
		if(isSelect1.isEnabled()) {
			System.out.println("Print- Is Enabled");
		}
		
		Thread.sleep(1000);
		isSelect1 = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[3]"));
		isSelect1.click();
		
		
		Thread.sleep(1000);
		isSelect1 = driver.findElement(By.xpath("//input[@value='bar']"));
		isSelect1.click();
		
		Thread.sleep(1000);
		isSelect1 = driver.findElement(By.xpath("//span[normalize-space()='Not going']"));
		isSelect1.click();
		if(isSelect1.isEnabled()) {
			System.out.println("Print - Confirm last field is disabled - NOT GOING");
		}
		
		Thread.sleep(1000);
		isSelect1 = driver.findElement(By.xpath("//button[@aria-checked='false']"));
		isSelect1.click();
		
		driver.close();
		driver.quit();

	}

}
