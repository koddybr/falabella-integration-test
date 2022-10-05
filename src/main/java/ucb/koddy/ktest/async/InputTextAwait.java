package ucb.koddy.ktest.async;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.actions.InputText;

public class InputTextAwait extends Await{
    public static void fire(WebDriver driver, By locator, String text) throws Exception{
        webDriver = driver;
        Await.await(locator);
        InputText.fire(driver, locator, text);
    }
}
