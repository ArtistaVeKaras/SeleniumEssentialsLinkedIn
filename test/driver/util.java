package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class util {

    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "/home/claudio/Downloads/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        return driver;
    }
}
