package au.method.test.support.pages.application;

import au.method.test.support.pages.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Contact extends BasePage {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String url;
    private String companyName;

    public void enterContactDetails(String enquiryReason){

        Faker faker = new Faker();

        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.phone = faker.phoneNumber().cellPhone();
        this.url = faker.internet().url();
        this.companyName = faker.name().name();

        driver.findElement(By.name("first-name")).sendKeys(this.firstName);
        driver.findElement(By.name("last-name")).sendKeys(this.lastName);
        driver.findElement(By.name("email-address")).sendKeys(this.email);
        driver.findElement(By.name("phone-number")).sendKeys(this.phone);
        driver.findElement(By.name("website-url")).sendKeys(this.url);
        driver.findElement(By.name("business-name")).sendKeys(this.companyName + " Pty Ltd.");
        Select reason = new Select(driver.findElement(By.name("reason-for-enquiry")));
        reason.selectByVisibleText(enquiryReason);
    }


}
