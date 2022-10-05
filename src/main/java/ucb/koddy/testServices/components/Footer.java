package ucb.koddy.testServices.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class Footer {

    public static boolean helpOptions(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/footer/section[1]/div/div[1]"));
    }

    public static boolean toBePartOptions(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/footer/section[1]/div/div[2]"));
    }

    public static boolean joinUpOptions(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/footer/section[1]/div/div[3]"));
    }

    public static boolean hasOurCompanyOptions(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/footer/section[1]/div/div[4]"));
    }

    public static boolean socialIcons(WebDriver driver){
        return Displayed.check(driver, By.id("footer-top-column-1-SocialIcons"));
    }

    public static boolean termsPolicy(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/footer/section[2]/div/div[2]"));
    }



}
