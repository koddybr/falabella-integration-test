package integration.purchaseProduct;

import com.aventstack.extentreports.Status;
import integration.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ucb.koddy.ktest.actions.Click;
import ucb.koddy.testServices.components.Footer;
import ucb.koddy.testServices.components.Google;
import ucb.koddy.testServices.components.Header;
import ucb.koddy.testServices.features.home.Home;
import ucb.koddy.testServices.features.home.components.Adds;
import ucb.koddy.testServices.features.home.components.Banner;
import ucb.koddy.testServices.features.payment.Payment;
import ucb.koddy.testServices.features.product.Product;
import ucb.koddy.testServices.features.purchase.Purchase;
import ucb.koddy.testServices.features.searcher.Searcher;
import ucb.koddy.testServices.utils.ScreenShot;

public class PurchaseProductTest extends BaseTest {

    @Test
    public void should_verify_if_header_is_correctly_displayed() throws Exception {
        Google.goFalabella(webDriver);
        Assert.assertTrue(
                Header.hasLogo(webDriver));
        Assert.assertTrue(
                Header.hasCarBUyButton(webDriver));
        Assert.assertTrue(
                Header.hasLButton(webDriver));
        Assert.assertTrue(
                Header.hasMenuButton(webDriver));
        Assert.assertTrue(
                Header.hasLogInButton(webDriver));
        Assert.assertTrue(
                Header.hasFButton(webDriver));
        Assert.assertTrue(
                Header.hasHouseButton(webDriver));
        Assert.assertTrue(
                Header.hasWhereReceive(webDriver));
        Assert.assertTrue(
                Header.hasPointsButton(webDriver));
        Assert.assertTrue(
                Header.hasSaleFalabella(webDriver));
        Assert.assertTrue(
                Header.hasTargetCar(webDriver));
        Assert.assertTrue(
                Header.hasSaleCall(webDriver));
    }

    @Test
    public void should_verify_if_footer_is_correctly_displayed() throws Exception{
        Google.goFalabella(webDriver);
        Assert.assertTrue(
                Footer.helpOptions(webDriver));
        Assert.assertTrue(
                Footer.toBePartOptions(webDriver));
        Assert.assertTrue(
                Footer.joinUpOptions(webDriver));
        Assert.assertTrue(
                Footer.hasOurCompanyOptions(webDriver));
        Assert.assertTrue(
                Footer.socialIcons(webDriver));
        Assert.assertTrue(
                Footer.termsPolicy(webDriver));
    }

    @Test
    public void should_search_and_purchase_product()throws Exception{

        Google.goFalabella(webDriver);
        //headerDisplayed();
        Home.searchProduct(webDriver);
        Searcher.selectProduct(webDriver);
        Product.addQuantity(webDriver);
        Product.addProductToCar(webDriver);
        Product.goToCar(webDriver);
        Purchase.startPurchase(webDriver);
        Purchase.addEmail(webDriver);
        Purchase.addDeliveryAddress(webDriver);
        Purchase.fillDataAddress(webDriver);
        Purchase.confirmAddress(webDriver);
        Purchase.finishPurchase(webDriver);
        Assert.assertTrue(
                Payment.checkPaymentWithCard(webDriver));

    }
}
