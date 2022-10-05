package ucb.koddy.testServices.features.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ucb.koddy.ktest.actions.Click;
import ucb.koddy.ktest.actions.InputText;
import ucb.koddy.ktest.async.ClickAwait;
import ucb.koddy.ktest.async.InputTextAwait;
import ucb.koddy.testServices.features.purchase.components.OtherProducts;

public class Purchase {

    public static  void startPurchase(WebDriver webDriver)throws Exception{

        ClickAwait.fire(webDriver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/div/div[3]/button"));
    }

    public static void addEmail(WebDriver webDriver)throws Exception{

        InputTextAwait.fire(webDriver, By.id("testId-Input-email"), "examplemail@gmail.com");

        Click.fire(webDriver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/div/div[3]/div[1]/div[2]/button"));
    }

    public static void addDeliveryAddress(WebDriver webDriver)throws Exception{

        ClickAwait.fire(webDriver, By.id("testId-Input-street"));

        ClickAwait.fire(webDriver, By.xpath("//*[@id=\"testId-editOption-button\"]/span"));
    }

    public static  void fillDataAddress(WebDriver webDriver)throws Exception{

        ClickAwait.fire(webDriver, By.xpath("/html/body/div[7]/div/div[2]/div/div[1]/div/div/div/div/div/button/i"));

        ClickAwait.fire(webDriver, By.id("testId-Dropdown-ANTOFAGASTA"));

        ClickAwait.fire(webDriver, By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div/div/button/i"));

        ClickAwait.fire(webDriver, By.id("testId-Dropdown-ANTOFAGASTA"));

        InputText.fire(webDriver, By.id("testId-Input-street"), "Antofagasta");

        InputText.fire(webDriver, By.id("testId-Input-number"), "2");

        Click.fire(webDriver, By.id("testId-infoModalFooter-button"));
    }

    public static void confirmAddress(WebDriver webDriver)throws Exception{

        //Thread.sleep(7);
        ClickAwait.fire(webDriver, By.xpath("//button[contains(text(),\"Confirmar y Guardar\")]"));

    }

    public static void finishPurchase(WebDriver webDriver)throws Exception{
        Thread.sleep(7);
        ClickAwait.fire(webDriver, By.xpath("//*[@id=\"testId-ContinueShopping-enabled\"]"));
    }

    public static boolean hasCorrectDisplay(WebDriver webDriver) throws Exception{
        return OtherProducts.informationProduct(webDriver);
    }

}
//*[@id="testId-ContinueShopping-enabled"]
//button[contains(text(),"Ir a pagar")]