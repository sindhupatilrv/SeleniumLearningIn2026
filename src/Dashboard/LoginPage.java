package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	public static WebDriver driver = null;
	final static String url = "https://www.google.com";
	
	public static void main(String[] args) throws InterruptedException  {
		
		// online free WebPages
		//https://rahulshettyacademy.com/AutomationPractice/
		//String url = "https://demoqa.com/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Learning");
		Thread.sleep(30);
		driver.findElement(By.id("APjFqb")).click();
		driver.close();
		
		
	}

}
