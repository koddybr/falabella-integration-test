import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VersionOne {

    public static void main(String args[]) throws Exception{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait await = new WebDriverWait(driver, 5);
        //await.until(ExpectedConditions.alertIsPresent());
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        WebElement searcherInput = driver.findElement(By.name("q"));
        searcherInput.sendKeys("falabella colombia");
        searcherInput.sendKeys(Keys.RETURN);

        WebElement selectWebPage = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        selectWebPage.click();
        //driver.wait(10000);
        //WebElement alertNoButton = driver.findElement(By.xpath("/html/body/div[4]//div/div/div[3]/button[1]"));
        //alertNoButton.click();

        await.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("testId-SearchBar-Input"))));
        WebElement searchProductButton = driver.findElement(By.id("testId-SearchBar-Input"));
        searchProductButton.sendKeys("usb");
        searchProductButton.sendKeys(Keys.RETURN);

        await = new WebDriverWait(driver, 10);
        System.out.println("worrd");
        await.until(ExpectedConditions.elementToBeClickable(By.id("testId-pod-3215623")));
        System.out.println("helloo");
        //Thread.sleep(1000):
        WebElement selectProduct = driver.findElement(By.id("testId-pod-3215623"));
        System.out.println("qwerty"+selectProduct.getTagName()+"  "+selectProduct.isEnabled());

        selectProduct.click();
        System.out.println("zxcvb");
        //WebDriverWait await = new WebDriverWait(webDriver, )

        //WebElement buttonAdd = driver.findElement(By.id("testId-pod-displaySubTitle-9944403"));
        //buttonAdd.click();

        //WebElement closeAdd = driver.findElement(By.xpath("//*[@id=\"testId-searchResults\"]/div[1]/div/div/div/div/div[1]/button"));
        //closeAdd.click();

        //WebElement bagProduct = driver.findElement(By.xpath("//*[@id=\"testId-UserAction-basket\"]/div/a"));
        //buttonAdd.click();
        await = new WebDriverWait(driver, 8);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonForCustomers")));
        WebElement buttonAddBag = driver.findElement(By.id("buttonForCustomers"));
        buttonAddBag.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"linkButton\"]")));
        WebElement seeBag = driver.findElement(By.xpath("//*[@id=\"linkButton\"]"));
        seeBag.click();


        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section/form/section/div[2]/div/button[2]")));
        WebElement plusProduct = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section/form/section/div[2]/div/button[2]"));
        plusProduct.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button")));
        WebElement goBuy = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));
        goBuy.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("region")));
        WebElement country = driver.findElement(By.id("region"));
        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText("ATLANTICO");

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("ciudad")));
        WebElement city = driver.findElement(By.id("ciudad"));
        Select selectCity = new Select(city);
        selectCity.selectByVisibleText("BARANOA");

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("comuna")));
        WebElement town = driver.findElement(By.id("comuna"));
        Select selectTown = new Select(town);
        selectTown.selectByVisibleText("BARANOA");

        WebElement sendDispatchButton = driver.findElement(By.xpath("//*[@id=\"fbra_checkoutRegionAndComuna\"]/div/section/section/form/div/div[4]/div/button"));
        sendDispatchButton.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
        WebElement addressInput = driver.findElement(By.id("address"));
        addressInput.sendKeys("calle1");

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("departmentNumber")));
        WebElement apartmentInput = driver.findElement(By.id("departmentNumber"));
        apartmentInput.sendKeys("A-4");

        WebElement sendShippingButton = driver.findElement((By.xpath("//*[@id=\"fbra_checkoutDeliverAndCollect\"]/div/div/div[1]/div/div[2]/div/div/form/section/div/div[4]/button")));
        sendShippingButton.click();



        //WebElement goBuy = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));
        //goBuy.click();
    }
}
