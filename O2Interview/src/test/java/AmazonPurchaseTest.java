import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.RegisterUser;
import pageObjects.SearchResultsPage;

/**
 * Created by computer genius on 15-10-2014.
 */
public class AmazonPurchaseTest {
    public WebDriver driver;

    @Before
    public void start(){
        driver = new FirefoxDriver();
    }
    @Test
    public void addProductsToBasketAndRegisterTest(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateToAmazonSite();
        homePage.searchAProduct();

        SearchResultsPage searchResultPage = new SearchResultsPage(driver);
        searchResultPage.selectNthProduct(3);


        ProductPage productPage = new ProductPage(driver);
        productPage.addtobasket();

        RegisterUser registerUser =new RegisterUser(driver);
        registerUser.adduserinformation();

    }
}

