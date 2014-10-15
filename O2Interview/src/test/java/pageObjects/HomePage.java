package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by computer genius on 15-10-2014.
 */
public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver =driver;
    }
    public void navigateToAmazonSite() {
        driver.navigate().to("http://www.amazon.co.uk");
    }

    public void searchAProduct() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 6");
        driver.findElement(By.cssSelector(".nav-submit-input")).click();
    }
}
