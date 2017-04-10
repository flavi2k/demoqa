package store.demoqa.steps;

import net.thucydides.core.annotations.Step;
import store.demoqa.ui.Checkout_POF;
import store.demoqa.ui.DemoQAHomePage_POF;
import store.demoqa.ui.MyAccount_POF;

/**
 * Created by FlavianDurigu on 4/10/2017.
 */
public class CheckOut_Step {
    DemoQAHomePage_POF homePage;
    Checkout_POF checkoutPage;
    MyAccount_POF myAcc;

    @Step
    public void isOnTheHomePage() {
        homePage.open();
    }

    @Step
    public void login(String username, String password){
        myAcc.clickMyAccount();
        myAcc.login(username,password);
    }


    @Step
    public void goesToCheckout() {
        checkoutPage.goToCheckout();
    }

    @Step
    public void removesAllProductsFromCart() {
        checkoutPage.removeAllProducts();
    }

    public void shouldSeeNothingInTheCart() {
        checkoutPage.nothingInCart();
    }
}
