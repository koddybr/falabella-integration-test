package ucb.koddy.ktest.async;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.actions.Click;

public class ClickAwait extends Await{
    public static void fire(WebDriver driver, By locator) throws Exception{
        webDriver = driver;
        Await.await(locator);
        Click.fire(webDriver, locator);
    }
}
