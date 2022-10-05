package ucb.koddy.ktest.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Return {

    public static void fire(WebDriver webDriver, By locator){
        webDriver.findElement(locator).sendKeys(Keys.RETURN);
    }

}
