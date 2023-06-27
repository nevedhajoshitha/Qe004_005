package Base_Package;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public static WebDriver driver;
	public static void Start(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void Stop() {
		driver.quit();
	}
	
	public static void WindowHandling() {
		Set<String> child = driver.getWindowHandles();
		java.util.Iterator<String> it  = child.iterator();
		it.next();
		String ch = it.next();
		driver.switchTo().window(ch);
	}
}
