package ucb.koddy.testServices.features.car;

import org.openqa.selenium.WebDriver;
import ucb.koddy.testServices.features.car.components.ProductOption;

public class Car {
    public static boolean correctDisplayed(WebDriver webDriver){
        return ProductOption.productTotalCost(webDriver);
    }
}
