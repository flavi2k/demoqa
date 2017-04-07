package store.demoqa.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/7/2017.
 */
public class MyAccount_POF extends PageObject{

    @FindBy(css=".account_icon")
    WebElement myAccountButton;

    @FindBy(css="#log")
    WebElement usernameInput;

    @FindBy(css="#pwd")
    WebElement passwordInput;

    @FindBy(css="#rememberme")
    WebElement rememberCheckBox;

    @FindBy(css="#login")
    WebElement loginButton;

    @FindBy(css="#account_logout>a")
    WebElement logoutButton;

    public void clickMyAccount() {
        myAccountButton.click();
    }

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.submit();
    }

    public void verifyLoginButton() {
        assertThat(loginButton.isDisplayed());
    }

    public void verifyLogoutButton() {
        assertThat(logoutButton.isDisplayed());
    }
}
