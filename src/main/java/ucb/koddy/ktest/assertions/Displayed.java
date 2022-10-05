package ucb.koddy.ktest.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Displayed {
    public static boolean check(WebDriver webDriver, By locator){
        return webDriver.findElement(locator).isDisplayed();
    }
}
