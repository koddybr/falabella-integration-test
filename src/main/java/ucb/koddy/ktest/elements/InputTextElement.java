package ucb.koddy.ktest.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputTextElement {

    public static WebElement get(WebDriver webDriver, By locator, String text){
        WebElement element = webDriver.findElement( locator);
        element.sendKeys(text);
        return element;
    }

}
