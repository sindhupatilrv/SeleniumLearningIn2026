package RealTimeQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class displaytextWork {

	public static void main(String[] args) {
		/* How would you automate a scenario where you need to verify if a user 
		//is able to scroll down a webpage until the footer section is visible?
		*/
		
		String url = "https://www.browserstack.com/";
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement isPresent = driver.findElement(By.xpath("//h1[normalize-space()='Comprehensive Test Stack']"));
		boolean flag = isPresent.isDisplayed();
		if(flag == true) {
			System.out.println("Given Page has element which is contain");
		} else {
			System.out.println("False");
		}	
		
		driver.close();
		driver.quit();
	}
}
