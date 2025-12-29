package Dashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
      
    	ChromeDriver driver;
    	String url = "https://www.google.com";
    	WebDriverManager.chromedriver().setup(); 
    	driver = new ChromeDriver();
    	
    	driver.get(url);
    	driver.getTitle();
    	System.out.println("Title of the page is:" + driver.getTitle());
    	driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Open Selenium Lesson - FindElement by ID");
    	Thread.sleep(120);
    	driver.findElement(By.id("APjFqb")).click();
    	Thread.sleep(120);
    	driver.findElement(By.id("APjFqb")).clear();
    	
    	//by.name
    	driver.findElement(By.name("q")).sendKeys("Open Selenium Lesson - FindElement by Name");
    	Thread.sleep(120);
    	driver.findElement(By.name("q")).click();
    	Thread.sleep(120);
    	
    	// id
    	driver.findElement(By.id("APjFqb")).clear();
    	Thread.sleep(120);
    	
    	///byXpath
    	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Open Selenium Lesson - FindElement by Xpath");
    	Thread.sleep(120);
    	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
    	
    	// Class name
    	driver.findElement(By.className("gLFyf")).clear();
    	Thread.sleep(120);///byXpath
    	driver.findElement(By.className("gLFyf")).sendKeys("Open Selenium Lesson - FindElement by Class Name");
    	
    	//tagname
    	Thread.sleep(120);
    	driver.findElement(By.tagName("textarea")).click();
    	Thread.sleep(120);
    	driver.findElement(By.className("gLFyf")).clear();
    	Thread.sleep(120);
    	
    	driver.close();
    	driver.quit();
    }
}
