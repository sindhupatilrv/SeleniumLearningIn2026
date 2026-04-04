package Intermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeUsage {
	
	// Frame Practice - https://www.hyrtutorials.com/p/frames-practice.html
	/* iframe - one page is embedded by other page - one HTML and embedded wit other html its used iframe tags
	 * how to identify - <iframe tag is always present and its start wit it
	 *  otherwise we may get NoSuchElementPresentException error will come
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Iframe Learning");
		
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		driver.findElement(By.id("firstName")).sendKeys("frname");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("lastName")).sendKeys("lsname");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("femalerb")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("englishchbx")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).sendKeys("NestedIframe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select nestedDropDown = new Select (driver.findElement(By.id("selectnav1")));
		nestedDropDown.selectByVisibleText("Tutorials");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.quit();
	}

}
