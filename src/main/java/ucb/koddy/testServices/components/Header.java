package ucb.koddy.testServices.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ucb.koddy.ktest.assertions.Displayed;

public class Header {
    public static boolean hasLogo(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"testId-logo-btn\"]/div"));
    }

    public static boolean hasMenuButton(WebDriver driver){
        return Displayed.check(driver, By.id("testId-HamburgerBtn-toggle"));
    }

    public static boolean hasLogInButton(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"testId-UserAction-userinfo\"]/div/div[2]"));
    }

    public static boolean hasMyByuButton(WebDriver driver){
        return Displayed.check(driver, By.id("id=\"testId-userAction-orders\""));
    }

    public static boolean hasCarBUyButton(WebDriver driver){
        return Displayed.check(driver, By.id("testId-UserAction-basket"));
    }

    public static boolean hasWhereReceive(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"modal-wrapper\"]/div/div/p"));
    }

    public static boolean hasFButton(WebDriver driver){
        return Displayed.check(driver, By.id("testId-store-links-0"));
    }

    public static boolean hasHouseButton(WebDriver driver){
        return Displayed.check(driver, By.id("testId-store-links-1"));
    }

    public static boolean hasPointsButton(WebDriver driver){
        return Displayed.check(driver, By.id("testId-store-links-2"));
    }

    public static boolean hasLButton(WebDriver driver){
        return Displayed.check(driver, By.id("testId-store-links-3"));
    }

    public static boolean hasSaleFalabella(WebDriver driver){
        return Displayed.check(driver, By.id("testId-extra-links-0"));
    }

    public static boolean hasTargetCar(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"bottom-header\"]/nav/div[2]/div[2]/div[1]/div[2]"));
    }

    public static boolean hasSaleCall(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"bottom-header\"]/nav/div[2]/div[2]/div[2]/div[2]"));
    }
}
