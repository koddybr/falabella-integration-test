package ucb.koddy.ktest.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ucb.koddy.ktest.async.Await;

import java.util.List;

public class HasNItems {
    public static boolean check(WebDriver webDriver, By locator, Integer quantity) throws Exception{
        Await.await(locator);
        List<WebElement> elements = webDriver.findElements(locator);
        return elements!=null && elements.size() == quantity;
    }
}
