package store.demoqa.features.Checkout;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import store.demoqa.steps.CheckOut_Step;

/**
 * Created by FlavianDurigu on 4/10/2017.
 */
@RunWith(SerenityRunner.class)
public class TestCheckout_Feature {

    @Managed(driver="chrome")
    WebDriver browser;

    @Steps
    CheckOut_Step user1;

    @Test
    public void verifyCart()  {

        // Given
        user1.isOnTheHomePage();
        user1.login("clr","test123");

        // When
        user1.goesToCheckout();
        //user1.removesAllProductsFromCart();

        //Then
        user1.verifyPrices();
        //user1.shouldSeeNothingInTheCart();

    }
}
