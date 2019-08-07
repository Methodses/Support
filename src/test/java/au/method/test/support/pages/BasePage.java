package au.method.test.support.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;

    public static void initialize(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "src/Resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public static void quit()
    {
        driver.quit();
        driver=null; // we destroy the driver object after quit operation
    }
    public static void close()
    {
        driver.close();
        driver=null;  // we destroy the driver object after quit operation
    }
    public  static void openurl(String URL)
    {
        driver.get(URL);
    }

    public static String getPageTitle(){
        return driver.getTitle();
    }

    public static void mouseOver(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }

}
