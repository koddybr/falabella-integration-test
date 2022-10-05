package integration.product;

import integration.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ucb.koddy.ktest.assertions.HasNItems;
import ucb.koddy.testServices.components.Google;
import ucb.koddy.testServices.features.home.Home;
import ucb.koddy.testServices.features.product.Product;
import ucb.koddy.testServices.features.searcher.Searcher;

public class ProductTest extends BaseTest {

    @Test
    public  void should_check_if_product_page_is_correctly_displayed() throws Exception{
        Google.goFalabella(webDriver);
        Home.searchProduct(webDriver);
        Searcher.selectProduct(webDriver);
        Assert.assertTrue(
            Product.checkPrice(webDriver))  ;
    }
}
