package ucb.koddy.testServices.features.home.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class Stores {

    public static boolean falabellaStore(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-CardGrid-6b42f0fd-7f42-4982-b687-d7b74ab78637-card-0\"]/a/picture[1]/img"));
    }

    public static boolean sodimacStore(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-CardGrid-6b42f0fd-7f42-4982-b687-d7b74ab78637-card-1\"]/a/picture[1]/img"));
    }

    public static boolean tottusStore(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-CardGrid-6b42f0fd-7f42-4982-b687-d7b74ab78637-card-2\"]/a/picture[1]/img"));
    }

    public static boolean linioStore(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-CardGrid-6b42f0fd-7f42-4982-b687-d7b74ab78637-card-3\"]/a/picture[1]/img"));
    }

    public static boolean optionCyber(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-Banner-308b2cfb-8241-4754-b365-1d5e6d59272a\"]/div/a[1]/div[1]/picture/img"));
    }

    public static boolean optionChange(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"main-Banner-308b2cfb-8241-4754-b365-1d5e6d59272a\"]/div/a[1]/div[1]/picture/img"));
    }

    public static boolean targetOne(WebDriver driver){
        return Displayed.check(driver, By.id("main-CardGroup-c2ffcecc-53a4-4d7e-b25c-f206eb8c307b-card-0"));
    }

    public static boolean targetTwo(WebDriver driver){
        return Displayed.check(driver, By.id("main-CardGroup-c2ffcecc-53a4-4d7e-b25c-f206eb8c307b-card-1"));
    }

    public static boolean targetTree(WebDriver driver){
        return Displayed.check(driver, By.id("main-CardGroup-c2ffcecc-53a4-4d7e-b25c-f206eb8c307b-card-2"));
    }

    public static boolean targetFour(WebDriver driver){
        return Displayed.check(driver, By.id("main-CardGroup-c2ffcecc-53a4-4d7e-b25c-f206eb8c307b-card-3"));
    }

    public static boolean targetFive(WebDriver driver){
        return Displayed.check(driver, By.id("main-CardGroup-c2ffcecc-53a4-4d7e-b25c-f206eb8c307b-card-4"));
    }

    public static boolean BuyOptionOne(WebDriver driver){
        return Displayed.check(driver, By.id("main-CollapsedCards-bfa2f2d9-427b-4550-9ed4-c445aa818544-desktop-card-0"));
    }

    public static boolean BuyOptionTwo(WebDriver driver){
        return Displayed.check(driver, By.id("main-CollapsedCards-bfa2f2d9-427b-4550-9ed4-c445aa818544-desktop-card-1"));
    }

    public static boolean BuyOptionTree(WebDriver driver){
        return Displayed.check(driver, By.id("main-CollapsedCards-bfa2f2d9-427b-4550-9ed4-c445aa818544-desktop-card-2"));
    }

    public static boolean BuyOptionFour(WebDriver driver){
        return Displayed.check(driver, By.id("main-CollapsedCards-bfa2f2d9-427b-4550-9ed4-c445aa818544-desktop-card-3"));
    }

    public static boolean BuyOptionFive(WebDriver driver){
        return Displayed.check(driver, By.id("main-CollapsedCards-bfa2f2d9-427b-4550-9ed4-c445aa818544-desktop-card-4"));
    }

    public static boolean BuyOptionSix(WebDriver driver){
        return Displayed.check(driver, By.id("main-CollapsedCards-bfa2f2d9-427b-4550-9ed4-c445aa818544-desktop-card-5"));
    }







}
