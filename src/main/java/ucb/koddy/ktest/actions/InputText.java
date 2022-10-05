package ucb.koddy.ktest.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputText {
    public static void fire(WebDriver webDriver, By locator, String text){
        webDriver.findElement( locator).sendKeys(text);
    }
}
