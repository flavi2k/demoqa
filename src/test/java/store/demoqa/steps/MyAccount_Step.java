package store.demoqa.steps;

import net.thucydides.core.annotations.Step;
import store.demoqa.ui.DemoQAHomePage_POF;
import store.demoqa.ui.MyAccount_POF;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/7/2017.
 */
public class MyAccount_Step {

    DemoQAHomePage_POF homePage;
    MyAccount_POF myAccount;

    @Step
    public void isOnTheHomePage() {
        homePage.open();
    }

    @Step
    public void clickMyAccount() {
        myAccount.clickMyAccount();
    }

    @Step
    public void login(String username, String password) {
        myAccount.login(username,password);
    }

    @Step
    public void shouldSeeLoginButton() {
        myAccount.verifyLoginButton();
    }

    @Step
    public void shouldSeeLogoutButton() {
        myAccount.verifyLogoutButton();
    }
}
