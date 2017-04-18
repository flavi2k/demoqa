package store.demoqa.ui;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by FlavianDurigu on 4/7/2017.
 */
public class MyAccount_POF extends AbstractPageObject{

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

    public MyAccount_POF(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccount() {
        myAccountButton.click();
    }

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.submit();
    }

    public void verifyLogout() {
        waitForAbsenceOf("#account_logout>a");

        //waitForElementToDisappearFromDomById("account_logout");
    }
    public void verifyLoginButton() {
        Assert.assertTrue(loginButton.isDisplayed());
    }

    public void verifyLogoutButton() {
        Assert.assertTrue(logoutButton.isDisplayed());
    }

    public void logout(){
        logoutButton.click();
    }
}
