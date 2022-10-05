package integration.home;

import integration.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ucb.koddy.testServices.components.Google;
import ucb.koddy.testServices.features.home.Home;
import ucb.koddy.testServices.features.home.components.Adds;

public class HomeTest extends BaseTest {

    @Test
    public void should_verify_home_page_is_correctly_displayed() throws Exception{
        Google.goFalabella(webDriver);
        Adds.closeCenterAdd(webDriver, By.className("dy-lb-close"));

        Assert.assertTrue(
                Home.hasCorrectBanner(webDriver));
        Assert.assertTrue(
                Home.hasCorrectDeals(webDriver));
        Assert.assertTrue(
                Home.hasStores(webDriver));
        Assert.assertTrue(
                Home.hasMoreOptions(webDriver));
    }
}
