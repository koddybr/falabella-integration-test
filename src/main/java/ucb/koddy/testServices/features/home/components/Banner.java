package ucb.koddy.testServices.features.home.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ucb.koddy.ktest.assertions.Displayed;

public class Banner {

    public static boolean scrollOne(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46-item-0\"]/div/div[3]/a"));
    }

    public static boolean scrollTwo(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46-item-1\"]/div/div[3]/a"));
    }

    public static boolean scrollTree(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46-item-2\"]/div/div[3]/a"));
    }

    public static boolean scrollFour(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46-item-3\"]/div/div[3]/a"));
    }

    public static boolean scrollFive(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46-item-4\"]/div/div[3]/a"));
    }

    public static boolean scrollSix(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46-item-5\"]/div/div[3]/a"));
    }

    public static boolean scrollSeven(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46-item-6\"]/div/div[3]/a"));
    }

    public static boolean scrollButton(WebDriver driver){
        return Displayed.check(driver, By.xpath("//*[@id=\"showcase-Showcase-3fe29f54-17ad-40ed-b585-1d2747d71f46\"]/div/ol"));
    }

}
