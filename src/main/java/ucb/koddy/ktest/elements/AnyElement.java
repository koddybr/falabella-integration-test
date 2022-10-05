package ucb.koddy.ktest.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnyElement {
    public static WebElement get(WebDriver webDriver, By locator){
        return webDriver.findElement(locator);
    }
}
