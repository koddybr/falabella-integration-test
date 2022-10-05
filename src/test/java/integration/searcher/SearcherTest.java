package integration.searcher;

import integration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ucb.koddy.ktest.assertions.HasNItems;
import ucb.koddy.ktest.async.Await;
import ucb.koddy.testServices.components.Google;
import ucb.koddy.testServices.features.home.Home;
import ucb.koddy.testServices.features.home.components.Adds;
import ucb.koddy.testServices.features.searcher.Searcher;

import java.util.List;

public class SearcherTest extends BaseTest {
    @Test
    public  void should_check_if_searcher_page_is_correctly_displayed() throws Exception{
        Google.goFalabella(webDriver);
        Home.searchProduct(webDriver);

        Assert.assertTrue(
                Searcher.hasCorrectOptions(webDriver));
        Assert.assertTrue(
                HasNItems.check(webDriver, By.className("pod-4_GRID"), 56));
    }
}
