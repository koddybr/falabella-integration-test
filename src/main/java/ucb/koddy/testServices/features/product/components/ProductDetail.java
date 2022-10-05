package ucb.koddy.testServices.features.product.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;
import ucb.koddy.ktest.async.Await;

public class ProductDetail {

    public static boolean arrowOption(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"breadcrumb\"]/div"));
    }

    public static boolean homeOption(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"breadcrumb\"]/ol/li[1]"));
    }

    public static boolean technologyOption(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"breadcrumb\"]/ol/li[2]"));
    }

    public static boolean accessOption(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"breadcrumb\"]/ol/li[3]"));
    }

    public static boolean imageProduct(WebDriver driver){
        return Displayed.check(driver, By.id("testId-pod-image-6384387419537408"));
    }

    public static boolean othersImages(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]"));
    }

    public static boolean nameProduct(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[2]/div[1]/div[2]/h1/div"));
    }

    public static boolean saleForName(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[2]/div[2]/div/div[1]/div[1]"));
    }

    public static boolean priceProduct(WebDriver driver) throws Exception {
        Await.await(By.id("testId-pod-prices-112341598"));
        return Displayed.check(driver, By.id("testId-pod-prices-112341598"));
    }

    public static boolean addProductButton(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]"));
    }

    public static boolean lessProductButton(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/button[1])"));
    }

    public static boolean addCarButton(WebDriver driver){
        return Displayed.check(driver, By.id("buttonForCustomers"));
    }



}
