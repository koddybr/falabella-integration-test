package ucb.koddy.testServices.features.home.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class Deals {

    public static boolean dealOne(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-HoldingBanner-035702be-d75a-4eb5-979d-23a78a474b5f-banner-card-0\"]/a/picture[1]/img"));
    }

    public static boolean dealTwo(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-HoldingBanner-035702be-d75a-4eb5-979d-23a78a474b5f-banner-card-1\"]/a/picture[1]/img"));
    }

    public static boolean dealTree(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-HoldingBanner-035702be-d75a-4eb5-979d-23a78a474b5f-banner-card-2\"]/a/picture[1]/img"));
    }

    public static boolean dealFour(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-HoldingBanner-035702be-d75a-4eb5-979d-23a78a474b5f-banner-card-3\"]/a/picture[1]/img"));
    }

    public static boolean productOne(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/a/div"));
    }

    public static boolean productTwo(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[2]"));
    }

    public static boolean productTree(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]"));
    }

    public static boolean productFour(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[4]"));
    }

    public static boolean productFive(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[5]"));
    }

    public static boolean productSix(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[6]"));
    }

    public static boolean backButton(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[1]/div/svg"));
    }

    public static boolean forwardButton(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"home-retorno-retomaexperiencia\"]//div[2]/div/div[2]/div[1]/div[3]/div/svg"));
    }

    public static boolean headDealProduct(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-Banner-a170a61c-d4f3-4cab-b954-224acfff21f7\"]/div/a[1]/div[1]/picture/img"));
    }

    public static boolean ProductDealTwo(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"mc-row-0-card-1\"]/a/div[1]/picture/img"));
    }

    public static boolean ProductDealTree(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"mc-row-0-card-2\"]/a/div[1]/picture/img"));
    }

    public static boolean ProductDealFour(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"mc-row-1-card-0\"]/a/div[1]/picture/img"));
    }

    public static boolean ProductDealFive(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"mc-row-1-card-1\"]/a/div[1]/picture/img"));
    }

    public static boolean menuElectro(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[6]/div[2]/div[1]/div/div/div[1]"));
    }

    public static boolean menuElectroProducts(WebDriver driver){
        return Displayed.check(driver, By.id("menu-id-0"));
    }

    public static boolean menuWoman(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[6]/div[2]/div[1]/div/div/div[2]"));
    }

    public static boolean menuWomanProducts(WebDriver driver){
        return Displayed.check(driver, By.id("menu-id-1"));
    }

    public static boolean menuHouse(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[6]/div[2]/div[1]/div/div/div[3]"));
    }

    public static boolean menuHouseProducts(WebDriver driver){
        return Displayed.check(driver, By.id("menu-id-2"));
    }

    public static boolean menuMoreHouse(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[6]/div[2]/div[1]/div/div/div[4]"));
    }

    public static boolean menuMoreHouseProducts(WebDriver driver){
        return Displayed.check(driver, By.id("menu-id-3"));
    }

    public static boolean menuMen(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[6]/div[2]/div[1]/div/div/div[5]"));
    }

    public static boolean menuMenProducts(WebDriver driver){
        return Displayed.check(driver, By.id("menu-id-4"));
    }

    public static boolean menuKid(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[6]/div[2]/div[1]/div/div/div[6]"));
    }

    public static boolean menuKidProducts(WebDriver driver){
        return Displayed.check(driver, By.id("menu-id-5"));
    }

    public static boolean menuNewCategory(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[6]/div[2]/div[1]/div/div/div[7]"));
    }

    public static boolean menuNewCategoryProducts(WebDriver driver){
        return Displayed.check(driver, By.id("menu-id-6"));
    }



}
