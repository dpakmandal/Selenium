package Chrome;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\eclipse-workspace\\NewProject\\Chrome exe\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\eclipse-workspace\\NewProject\\Chrome exe\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
}
}
