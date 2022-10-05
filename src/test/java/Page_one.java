import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_one {
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

    await = new WebDriverWait(driver, 5);
    await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-HamburgerBtn-toggle")));
    WebElement categoriesButton = driver.findElement(By.id("testId-HamburgerBtn-toggle"));
    categoriesButton.click();

    await = new WebDriverWait(driver, 5);
    await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"testId-UserAction-userinfo\"]/div/div[2]")));
    WebElement logIn = driver.findElement(By.xpath("//*[@id=\"testId-UserAction-userinfo\"]/div/div[2]"));
    logIn.click();

    await = new WebDriverWait(driver, 5);
    await.until(ExpectedConditions.visibilityOfElementLocated(By.id("testId-cc-modal-close-button")));
    WebElement closeLogIn = driver.findElement(By.id("testId-cc-modal-close-button"));
    closeLogIn.click();

    await = new WebDriverWait(driver, 5);
    await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"testId-userAction-orders\"]/div/div/a")));
    WebElement myShoppingButton = driver.findElement(By.xpath("//*[@id=\"testId-userAction-orders\"]/div/div/a"));
    myShoppingButton.click();

    await = new WebDriverWait(driver, 5);
    await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logo\"]/a")));
    WebElement closeMyShopping = driver.findElement(By.xpath("//*[@id=\"logo\"]/a"));
    closeMyShopping.click();

    await = new WebDriverWait(driver, 5);
    await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"testId-UserAction-basket\"]/div")));
    WebElement bagButton = driver.findElement(By.xpath("//*[@id=\"testId-UserAction-basket\"]/div"));
    bagButton.click();

    await = new WebDriverWait(driver, 5);
    await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cross-header\"]/div[3]/div/div[1]/a")));
    WebElement logoButton = driver.findElement(By.xpath("//*[@id=\"cross-header\"]/div[3]/div/div[1]/a"));
    logoButton.click();

}}
