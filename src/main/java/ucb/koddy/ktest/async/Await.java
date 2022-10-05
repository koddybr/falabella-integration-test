package ucb.koddy.ktest.async;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ucb.koddy.ktest.async.Constants.TIMEOUT;

public class Await {
    public static WebDriver webDriver;
    public static WebDriverWait await;
    public static void await(By locator) throws Exception{
        await = new WebDriverWait(webDriver, TIMEOUT);
        await.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void awaitCLikable(By locator) throws Exception{
        await = new WebDriverWait(webDriver, TIMEOUT);
        await.until(ExpectedConditions.elementToBeClickable(locator));

    }
}
