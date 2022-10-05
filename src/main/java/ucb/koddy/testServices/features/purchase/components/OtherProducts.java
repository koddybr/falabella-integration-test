package ucb.koddy.testServices.features.purchase.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class OtherProducts {

    public static boolean otherProducts(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"dy-vistos-juntos\"]//div[2]/div/div[1]"));
    }

    public static boolean otherProductsList(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"dy-vistos-juntos\"]//div[2]/div/div[2]/div[1]/div[2]"));
    }

    public static boolean moreProducts(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"flb-modelo-AA\"]//div[2]/div/div[1]"));
    }

    public static boolean moreProductsList(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"flb-modelo-AA\"]//div[2]/div/div[2]/div[1]/div[2]"));
    }

    public static boolean informationProduct(WebDriver driver){
        return Displayed.check(driver, By.id("productInfoContainer"));
    }

    public static boolean commentsProduct(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[9]"));
    }

}
