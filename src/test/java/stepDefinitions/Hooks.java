package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    static WebDriver driver;
    public void openBrowser(){
        String projectLocation = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver",projectLocation + "//lib//driver");
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
}
