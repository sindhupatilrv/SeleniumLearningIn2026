package Dashboard;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

    public static void main(String[] args) {
      
    	ChromeDriver driver;
    	String url = "https://www.google.com";
    	
    	WebDriverManager.chromedriver().setup(); 
    	driver = new ChromeDriver();
    	
    	driver.get(url);
    	driver.getTitle();
    	System.out.println("Title of the page is:" + driver.getTitle());
    	
    	driver.close();
    	driver.quit();
    }
}
