package RealTimeQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*What is window handling in Selenium?

Window handling is used to manage multiple browser windows or tabs in Selenium using unique window IDs (handles).*/
public class WindowsHandling {

	public static void main(String[] args) throws Exception {
		System.out.println("Windows Hanlding");
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		System.out.println("Parent Page title:" + driver.getTitle());
		
		String parentPage = driver.getWindowHandle();
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		//how to switch to other windows(eg - one parent and one child)
		//scenario: Click link → new window opens → perform action → return to parent
		for (String newWindow : driver.getWindowHandles()) {
			if(!newWindow.equals(parentPage)) {
				driver.switchTo().window(newWindow);
				  String simpleHeading = driver.findElement(By.id("sampleHeading")).getText();
				  //System.out.println("Child page" + driver.getPageSource());
				  System.out.println("Child page header text:" + simpleHeading);
				  Thread.sleep(500);
				  driver.close();	
			}
			
		}
		Thread.sleep(500);
		driver.switchTo().window(parentPage);
		System.out.println("Parent page" + driver.getTitle());
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		driver.close();
		driver.quit();
	}

}
