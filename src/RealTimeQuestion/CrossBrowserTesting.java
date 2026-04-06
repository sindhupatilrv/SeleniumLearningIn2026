package RealTimeQuestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		System.out.println("Cross Browser Testing\n");
		WebDriver crossBrowserdriver = null;
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.iedriver().setup();
		
		crossBrowserdriver = new ChromeDriver();
		crossBrowserdriver = new FirefoxDriver();
		crossBrowserdriver = new EdgeDriver();
		
		crossBrowserdriver.get("https://demoqa.com/browser-windows");
		System.out.println(crossBrowserdriver.getTitle());
	}
}