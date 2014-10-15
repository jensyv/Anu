package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by computer genius on 15-10-2014.
 */
public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addtobasket() {



      // WebElement select = driver.findElement(By.id("quantity"));
        //List<WebElement> options = select.findElements(By.xpath("//*[@id='quantity']"));

        //WebDriverWait wait =new WebDriverWait(driver ,10);

        driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
        if(driver.findElements( By.xpath("//a[@class='a-button-text hlb-cart-button']") ).size() != 0)
            driver.findElement(By.xpath("//a[@class='a-button-text hlb-cart-button']")).click();
        else
            driver.findElement(By.xpath("//*[@id='hlb-view-cart']")).click();

        //Select dropdown = new Select(driver.findElement(By.cssSelector(".a-button-inner")));
        //dropdown.selectByVisibleText("3");

                    driver.findElement(By.cssSelector(".a-button-input")).click();





        }
    }

