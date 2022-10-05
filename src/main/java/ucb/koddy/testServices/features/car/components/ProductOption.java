package ucb.koddy.testServices.features.car.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class ProductOption {

    public static boolean carNumberProducts(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/div[2]"));
    }

    public static boolean product(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/div[3]/div[1]"));
    }

    public static boolean productTotalNumber(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/div/div[2]/div[1]"));
    }

    public static boolean productTotalCost(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/div/div[2]/div[2]"));
    }

    public static boolean continueButton(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/div/div[3]"));
    }
}
