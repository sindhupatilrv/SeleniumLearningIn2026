package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getText {

	static String url = "https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/";
	static String url2 = "https://www.browserstack.com/";

	public static void main(String[] args) {
		ChromeDriver driver;
		
    	WebDriverManager.chromedriver().setup(); 
    	driver = new ChromeDriver();
    	driver.get(url);
    	driver.getTitle();
    	WebElement divElement = driver.findElement(By.xpath("(//body)[1]"));
    	
    	//getText() is used to read the visible text of a web element.
    	System.out.println("Get Text value" + divElement.getText());
    	driver.close();
    	
    	driver = new ChromeDriver();
    	driver.get(url2);
    	WebElement element2 = driver.findElement(By.tagName("h1"));
    	System.out.println("Get Text Value of Browser Stack\t" + element2.getText());
    	
    	
    	//getAttribute() is used to fetch the value of an HTML attribute of a web element.
    	System.out.println("Get Text Value of Browser Stact" + element2.getAttribute("sd"));
    	
	}

}
