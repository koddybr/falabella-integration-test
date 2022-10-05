package ucb.koddy.ktest.userActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickUser {
    public static void fire(WebDriver webDriver, By locator){
        Actions actions = new Actions(webDriver);
        WebElement target = webDriver.findElement(locator);
        actions.moveToElement(target);
        target.click();
    }
}
