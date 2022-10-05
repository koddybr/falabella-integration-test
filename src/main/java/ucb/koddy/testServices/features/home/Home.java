package ucb.koddy.testServices.features.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ucb.koddy.ktest.actions.Return;
import ucb.koddy.ktest.async.ClickAwait;
import ucb.koddy.ktest.async.InputTextAwait;
import ucb.koddy.testServices.features.home.components.*;

public class Home {

    public static void searchProduct(WebDriver webDriver)throws Exception{
        Adds.closeCenterAdd(webDriver, By.className("dy-lb-close"));
        InputTextAwait.fire(webDriver, By.id("testId-SearchBar-Input"), "usb");
        Return.fire(webDriver, By.id("testId-SearchBar-Input"));

    }

    public static boolean hasCorrectBanner(WebDriver webDriver) throws  Exception{
        return Banner.scrollOne(webDriver);
    }

    public static boolean hasCorrectDeals(WebDriver webDriver) throws Exception{
        return Deals.dealOne(webDriver);
    }

    public static boolean hasMoreOptions(WebDriver webDriver) throws  Exception {
        return MoreOptions.titleCyber(webDriver);
    }

    public static boolean hasStores(WebDriver webDriver) throws Exception {
        return Stores.falabellaStore(webDriver);
    }
}
