package store.demoqa.features.myAccount;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import store.demoqa.steps.MyAccount_Step;

/**
 * Created by FlavianDurigu on 4/7/2017.
 */
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src\\test\\java\\store\\demoqa\\resources\\TestData.csv")
public class TestMyAccount_Feature {

    String username;
    String password;

    @Qualifier
    public String getQualifier() {
        return username;
    }

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

        // username/password are extracted from csv
        user1.login(username,password);

        //Then
        user1.shouldSeeLogoutButton();

        user1.logout();
        user1.shouldNotSeeLogoutButton();
    }
}
