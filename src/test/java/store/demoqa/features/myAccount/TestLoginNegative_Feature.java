package store.demoqa.features.myAccount;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import store.demoqa.steps.MyAccount_Step;

/**
 * Created by FlavianDurigu on 4/20/2017.
 */
@RunWith(SerenityRunner.class)
public class TestLoginNegative_Feature {

    @Steps
    MyAccount_Step user1;

    @Managed(driver ="chrome")
    WebDriver browser;

    @Test
    public void userEntersWrongPassword(){
        user1.isOnTheHomePage();
        user1.clickMyAccount();
        user1.shouldSeeLoginButton();
        user1.logsInWithWrongPassword("clr","WrongPassword");
        user1.shouldSeeInvalidCredentialsError();
    }

    @Test
    public void userEntersWrongUsername(){
        user1.isOnTheHomePage();
        user1.clickMyAccount();
        user1.shouldSeeLoginButton();
        user1.logsInWithWrongPassword("clr213","test123");
        user1.shouldSeeInvalidCredentialsError();
    }
}
