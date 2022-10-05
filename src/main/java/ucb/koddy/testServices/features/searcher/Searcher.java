package ucb.koddy.testServices.features.searcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ucb.koddy.ktest.async.Await;
import ucb.koddy.ktest.async.ClickAwait;
import ucb.koddy.testServices.features.searcher.components.OptionsProduct;

public class Searcher {

    public static void selectProduct(WebDriver webDriver)throws Exception{

        ClickAwait.fire(webDriver, By.id("testId-pod-image-https://falabella.scene7.com/is/image/Falabella/gsc_112341598_334401_1"));
    }

    public static boolean hasCorrectOptions(WebDriver webDriver) throws Exception{
        return OptionsProduct.brandOption(webDriver);
    }
}
