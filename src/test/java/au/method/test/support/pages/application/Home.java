package au.method.test.support.pages.application;

import au.method.test.support.pages.BasePage;
import org.openqa.selenium.By;

public class Home extends BasePage {

    public void clickContactUs(){
       // mouseOver(driver.findElement(By.xpath("(//a[text()='Support'])[2]")));
        driver.findElement(By.xpath("//a[text()='Support']")).click();
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
    }

}
