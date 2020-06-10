package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {


	public WebDriver selectBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			return new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
			return new FirefoxDriver();
		}
		if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "driver/IEdriverServer");
		}
		return null;
	}
}
