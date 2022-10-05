package ucb.koddy.testServices.features.home.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class MoreOptions {

    public static boolean titleFashion(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-nuevos-rec2\"]//div[2]/div/div[1]"));
    }

    public static boolean productsFashion(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-nuevos-rec2\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]"));
    }

    public static boolean titleCyber(WebDriver driver){
        return Displayed.check(driver, By.id("main-Banner-a170a61c-d4f3-4cab-b954-224acfff21f7"));
        //*[@id="main-Banner-a170a61c-d4f3-4cab-b954-224acfff21f7"]/div/a[1]/div[1]/picture/img
    }

    public static boolean productsCyber(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-nuevos-rec3\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]"));
    }

}
