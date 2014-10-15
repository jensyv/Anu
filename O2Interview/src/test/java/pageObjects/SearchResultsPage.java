package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResultsPage {
    WebDriver driver;
    public SearchResultsPage(WebDriver driver){
        this.driver=driver;
        
    }

    public void selectNthProduct(int i) {
   //driver.findElement(By.xpath("//*[@id=\"result_2\"]/div/div/div/div[2]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='result_2']/h3/a")).click();

    }
}
