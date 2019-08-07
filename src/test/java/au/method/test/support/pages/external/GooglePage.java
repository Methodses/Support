package au.method.test.support.pages.external;

import au.method.test.support.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {

    public void openGoogleSearch(){
        openurl("http://www.google.com");
    }

    public void searchForKeyword(String keyword){

        WebElement searchBox = driver.findElement(By.name("q"));

        if(searchBox.isDisplayed()){
            searchBox.sendKeys(keyword);
            searchBox.sendKeys(Keys.ENTER);
        }
    }

    public void clickSearchLink(String citeText){
        driver.findElement(By.xpath("//cite[text()='"+ citeText +"']")).click();
    }

}
