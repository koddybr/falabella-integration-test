package ucb.koddy.testServices.features.searcher.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;
import ucb.koddy.ktest.async.Await;

public class OptionsProduct {

    public static boolean resultSearch(WebDriver driver){
        return Displayed.check(driver, By.id("testId-searchResults-actionBar"));
    }

    public static boolean numberResults(WebDriver driver){
        return Displayed.check(driver, By.id("testId-SearchLandingContainer-totalResults"));
    }

    public static boolean freeSend(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/section[1]/div[2]"));
    }

    public static boolean cyberMondayOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Cyber Monday"));
    }

    public static boolean categoryOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Categoría"));
    }

    public static boolean brandOption(WebDriver driver) throws Exception{
        Await.await(By.id("testId-Accordion-Marca"));
        return Displayed.check(driver, By.id("testId-Accordion-Marca"));
    }

    public static boolean highOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Alto"));
    }

    public static boolean priceOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Precio"));
    }

    public static boolean discountOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Descuentos"));
    }

    public static boolean sellForOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Vendido por"));
    }

    public static boolean moreCommentOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Más Comentados"));
    }

    public static boolean sizeOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Talla"));
    }

    public static boolean conditionOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Condicion de Producto"));
    }

    public static boolean toolOption(WebDriver driver){
        return Displayed.check(driver, By.id("testId-Accordion-Herramienta Inalámbrica"));
    }

}
