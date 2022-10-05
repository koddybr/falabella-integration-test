package ucb.koddy.testServices.features.home.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.async.ClickAwait;

public class Adds {
    public static void closeCenterAdd(WebDriver webDriver, By locator) throws Exception{
        ClickAwait.fire(webDriver, locator);
    }
}
