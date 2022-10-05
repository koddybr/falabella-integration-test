import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VersionTwo {

    public static void main(String args[]) throws Exception{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait await = new WebDriverWait(driver, 5);
        //await.until(ExpectedConditions.alertIsPresent());
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        WebElement searcherInput = driver.findElement(By.name("q"));
        searcherInput.sendKeys("falabella chile");
        searcherInput.sendKeys(Keys.RETURN);

        WebElement selectWebPage = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
        selectWebPage.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("testId-SearchBar-Input"))));
        WebElement searchProductButton = driver.findElement(By.id("testId-SearchBar-Input"));
        searchProductButton.sendKeys("usb");
        searchProductButton.sendKeys(Keys.RETURN);

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-pod-image-https://falabella.scene7.com/is/image/Falabella/gsc_112341598_334401_1")));
        WebElement selectProduct = driver.findElement(By.id("testId-pod-image-https://falabella.scene7.com/is/image/Falabella/gsc_112341598_334401_1"));
        selectProduct.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]")));
        WebElement plusProduct = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div[1]/div[1]/div[2]/section[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]"));
        plusProduct.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonForCustomers")));
        WebElement addCar = driver.findElement(By.id("buttonForCustomers"));
        addCar.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkButton")));
        WebElement goCar = driver.findElement(By.id("linkButton"));
        goCar.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/div/div[3]/button")));
        WebElement continueBuyButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/div/div[3]/button"));
        continueBuyButton.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-Input-email")));
        WebElement addressInput = driver.findElement(By.id("testId-Input-email"));
        addressInput.sendKeys("examplemail@gmail.com");

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/div/div[3]/div[1]/div[2]/button")));
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/div/div[3]/div[1]/div[2]/button"));
        continueButton.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-Input-street")));
        WebElement streetNumber = driver.findElement(By.id("testId-Input-street"));
        streetNumber.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"testId-editOption-button\"]/span")));
        WebElement addAddressHand = driver.findElement(By.xpath("//*[@id=\"testId-editOption-button\"]/span"));
        addAddressHand.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div/div[2]/div/div[1]/div/div/div/div/div/button/i")));
        WebElement regionOption = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/div[1]/div/div/div/div/div/button/i"));
        regionOption.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-Dropdown-ANTOFAGASTA")));
        WebElement selectRegion = driver.findElement(By.id("testId-Dropdown-ANTOFAGASTA"));
        selectRegion.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div/div/button/i")));
        WebElement townOption = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div/div/div/div/div/button/i"));
        townOption.click();

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-Dropdown-ANTOFAGASTA")));
        WebElement selectTown = driver.findElement(By.id("testId-Dropdown-ANTOFAGASTA"));
        selectTown.click();

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-Input-street")));
        WebElement streetInput = driver.findElement(By.id("testId-Input-street"));
        streetInput.sendKeys("Antofagasta");

        await = new WebDriverWait(driver, 5);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-Input-number")));
        WebElement numberInput = driver.findElement(By.id("testId-Input-number"));
        numberInput.sendKeys("2");

        await = new WebDriverWait(driver, 10);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-infoModalFooter-button")));
        WebElement confirmAddressButton = driver.findElement(By.id("testId-infoModalFooter-button"));
        confirmAddressButton.click();

        await = new WebDriverWait(driver, 20);
        await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-infoModalFooter-button")));
        WebElement confirmSearch = driver.findElement(By.id("testId-infoModalFooter-button"));
        confirmSearch.click();


}}


