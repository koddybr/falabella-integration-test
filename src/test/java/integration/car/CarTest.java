package integration.car;

import integration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ucb.koddy.testServices.components.Google;
import ucb.koddy.testServices.features.car.Car;
import ucb.koddy.testServices.features.home.Home;
import ucb.koddy.testServices.features.product.Product;
import ucb.koddy.testServices.features.purchase.Purchase;
import ucb.koddy.testServices.features.searcher.Searcher;

public class CarTest extends BaseTest {

    @Test
    public void should_check_if_car_is_correctly_displayed () throws Exception {
        Google.goFalabella(webDriver);
        Home.searchProduct(webDriver);
        Searcher.selectProduct(webDriver);
        Product.addProductToCar(webDriver);
        Product.goToCar(webDriver);
        Assert.assertTrue(
            Car.correctDisplayed(webDriver));
    }
}
