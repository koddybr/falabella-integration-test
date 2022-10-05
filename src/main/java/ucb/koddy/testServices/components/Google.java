package ucb.koddy.testServices.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ucb.koddy.ktest.actions.Click;
import ucb.koddy.ktest.actions.InputText;
import ucb.koddy.ktest.actions.Return;
import ucb.koddy.ktest.assertions.Displayed;
import ucb.koddy.ktest.elements.InputTextElement;

public class Google {

    public static boolean hasLogoGoogle(WebDriver driver){
        return Displayed.check(driver, By.xpath("/html/body/div[1]/div[2]/div/img"));
    }

    public static boolean hasInPutGoogle(WebDriver driver){
        return Displayed.check(driver, By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]"));
    }

    public static void goFalabella(WebDriver webDriver){
        InputText.fire(webDriver, By.name("q"), "falabella chile");
        Return.fire(webDriver, By.name("q"));
        Click.fire(webDriver, By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
    }
}
