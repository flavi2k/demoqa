package store.demoqa.features.myAccount;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import store.demoqa.steps.MyAccount_Step;

/**
 * Created by FlavianDurigu on 4/7/2017.
 */
@RunWith(SerenityRunner.class)
public class TestMyAccount_Feature {

    @Steps
    MyAccount_Step user1;

    @Managed(driver ="chrome")
    WebDriver browser;

    @Test
    public void userShouldBeAbleToLogin_Logout(){

        // Given
        user1.isOnTheHomePage();

        // When
        user1.clickMyAccount();

        // Then
        user1.shouldSeeLoginButton();

        // When
        user1.login("clr","test123");

        //Then
        user1.shouldSeeLogoutButton();

        user1.logout();
    }
}
