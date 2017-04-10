package store.demoqa.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/10/2017.
 */
public class Checkout_POF extends PageObject {

    @FindBy(css = "#header_cart .icon")
    WebElement checkoutButton;

    @FindBy(css = ".adjustform.remove [type='submit']")
    List<WebElement> removeButtons;

    @FindBy(css=".entry-content")
    WebElement entryContent;

    public void goToCheckout() {
        checkoutButton.click();
    }

    public void removeAllProducts() {
        if(!removeButtons.isEmpty()) {
            int numberOfButtons = removeButtons.size();
            for (int i = numberOfButtons - 1; i >= 0; i--) {
                removeButtons.get(i).click();
            }
        }
    }

    public void nothingInCart() {
        System.out.println(entryContent.getText());
        assertThat(entryContent.getText().equalsIgnoreCase("Oops, there is nothing in your cart."));
    }
}
