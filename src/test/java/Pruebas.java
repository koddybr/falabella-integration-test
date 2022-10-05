import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pruebas {

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

        WebElement buttonFalabella = driver.findElement(By.xpath("//*[@id=\"testId-logo-btn\"]/div"));

        WebElement buttonMenu = driver.findElement(By.id("testId-HamburgerBtn-toggle"));

        WebElement buttonLogIn = driver.findElement(By.xpath("//*[@id=\"testId-UserAction-userinfo\"]/div/div[2]"));

        WebElement buttonMyBuy = driver.findElement(By.id("id=\"testId-userAction-orders\""));

        WebElement buttonCarBuy = driver.findElement(By.id("testId-UserAction-basket"));

        WebElement whereReceive = driver.findElement(By.xpath("//*[@id=\"modal-wrapper\"]/div/div/p"));

        WebElement buttonF = driver.findElement(By.id("testId-store-links-0"));

        WebElement buttonHouse = driver.findElement(By.id("testId-store-links-1"));

        WebElement buttonPoints = driver.findElement(By.id("testId-store-links-2"));

        WebElement buttonL = driver.findElement(By.id("testId-store-links-3"));

        WebElement saleFalabella = driver.findElement(By.id("testId-extra-links-0"));

        WebElement targetCmr = driver.findElement(By.xpath("//*[@id=\"bottom-header\"]/nav/div[2]/div[2]/div[1]/div[2]"));

        WebElement saleCall = driver.findElement(By.xpath("//*[@id=\"bottom-header\"]/nav/div[2]/div[2]/div[2]/div[2]"));



}}
