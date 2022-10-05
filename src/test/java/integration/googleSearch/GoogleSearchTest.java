package integration.googleSearch;

import integration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ucb.koddy.testServices.components.Google;

public class GoogleSearchTest extends BaseTest {
    @Test
    public void should_verify_google_is_correctly_loaded(){
        Assert.assertTrue(Google.hasLogoGoogle(webDriver));
        Assert.assertTrue(Google.hasInPutGoogle(webDriver));
    }
}
