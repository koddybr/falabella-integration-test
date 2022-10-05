package ucb.koddy.testServices.features.payment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ucb.koddy.ktest.actions.Click;
import ucb.koddy.ktest.actions.InputText;
import ucb.koddy.ktest.assertions.Displayed;
import ucb.koddy.ktest.async.Await;
import ucb.koddy.ktest.async.ClickAwait;
import ucb.koddy.ktest.async.InputTextAwait;
import ucb.koddy.ktest.elements.AnyElement;

public class Payment {

    public static boolean checkPaymentWithCard(WebDriver webDriver)throws Exception{
        Await.await(By.xpath("//*[contains(text(),\"Resumen de la compra\")]"));
        return Displayed.check(webDriver, By.xpath("//*[contains(text(),\"Resumen de la compra\")]"));
    }
}
