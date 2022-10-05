package ucb.koddy.testServices.features.searcher.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class Publicity {

    public static boolean publi(WebDriver driver){
        return Displayed.check(driver, By.id("google_image_div"));
    }

}
