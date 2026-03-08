package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		System.out.println("Drop Down Learning");
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.findElement(By.id("//input[@id='my-text-id']")).sendKeys("InputText");
		driver.findElement(By.id("//input[@name='my-password']")).sendKeys("InputText");
		driver.findElement(By.name("my-textarea")).sendKeys("Text");
		
		Select dropdown = new Select (driver.findElement(By.name("my-select");
	}

}
