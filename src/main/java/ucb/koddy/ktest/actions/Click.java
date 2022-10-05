package ucb.koddy.ktest.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click {
    public static void fire(WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }
}
