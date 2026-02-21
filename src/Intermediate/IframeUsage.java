package Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeUsage {
// Frame Practice - https://www.hyrtutorials.com/p/frames-practice.html
	/* iframe - one page is emebedded by other page - one html and embedded wit other html its used iframe tags
	 * how to identify - <iframe tag is always present and its start wit it
	 *  otherwise we may get NoSuchElementPresentException error will come
	 */
	public static void main(String[] args) {
		System.out.println("Test");
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("HelloIframe");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
	
		//Drop-Down Learning 
		
		Select dropdownData = new Select (driver.findElement(By.id("course")));
		dropdownData.selectByVisibleText("Java");
	
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}

}
