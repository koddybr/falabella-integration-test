package ucb.koddy.testServices.features.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ucb.koddy.ktest.actions.Click;
import ucb.koddy.ktest.assertions.Displayed;
import ucb.koddy.ktest.async.Await;
import ucb.koddy.ktest.async.ClickAwait;
import ucb.koddy.testServices.features.product.components.ProductDetail;

public class Product {

    public static void addQuantity(WebDriver webDriver){

        Click.fire(webDriver, By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]"));

    }

    public static void addProductToCar(WebDriver webDriver){

        Click.fire(webDriver, By.id("buttonForCustomers"));
    }

    public static void goToCar(WebDriver webDriver)throws  Exception{

        ClickAwait.fire(webDriver, By.id("linkButton"));
    }

    public static boolean checkPrice(WebDriver webDriver) throws Exception{
        return ProductDetail.priceProduct(webDriver);
    }




}
