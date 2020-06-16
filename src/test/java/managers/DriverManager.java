package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    public WebDriver selectBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            return new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            return new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "driver/IEdriverServer.exe");
            return new InternetExplorerDriver();
        }
        if (browser.equalsIgnoreCase("chrome_U")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver_U");
            return new ChromeDriver();
        }
        return null;
    }
}
