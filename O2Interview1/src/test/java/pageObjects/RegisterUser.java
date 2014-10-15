package pageObjects;

import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by computer genius on 15-10-2014.
 */
public class RegisterUser {
    WebDriver driver;

    public RegisterUser(WebDriver driver) {
        this.driver = driver;
    }


    public void adduserinformation() {
        driver.findElement(By.id("ap_email")).sendKeys("hghgh890@hotmail.com");
        WebElement radioBtn = driver.findElement(By.id("ap_signin_create_radio"));
        radioBtn.click();

        driver.findElement(By.id("signInSubmit-input")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("Anu");
        driver.findElement(By.id("ap_email_check")).sendKeys("hghgh890@hotmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("india123");
        driver.findElement(By.id("ap_password_check")).sendKeys("india123");
        driver.findElement(By.id("continue-input")).click();

        driver.findElement(By.xpath("//*[@id='enterAddressFullName']")).sendKeys("Anuv");
        driver.findElement(By.id("enterAddressAddressLine1")).sendKeys("3 high street");
        driver.findElement(By.id("enterAddressCity")).sendKeys("Macclesfield");
        driver.findElement(By.id("enterAddressStateOrRegion")).sendKeys("Cheshire");
        driver.findElement(By.id("enterAddressPostalCode")).sendKeys("SK11 8BU");
       // new Select(driver.findElement(By.id("enterAddressCountryCode"))).selectByVisibleText("");
driver.findElement(By.id("enterAddressPhoneNumber")).sendKeys("07428582216");
driver.findElement(By.xpath("//*[@id='newShippingAddressFormFromIdentity']")).click();

        driver.findElement(By.cssSelector(".a-button-text")).click();





        }


    }

