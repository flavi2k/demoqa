package store.demoqa.ui;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by FlavianDurigu on 4/10/2017.
 */
public class Checkout_POF extends PageObject {

    @FindBy(css = "#header_cart .icon")
    WebElement checkoutButton;

    @FindBy(css = ".adjustform.remove [type='submit']")
    List<WebElement> removeButtons;

    @FindBy(css = ".entry-content")
    WebElement entryContent;

    @FindBy(css = ".yourtotal .pricedisplay")
    WebElement oYourTotal;

    @FindBy(css = ".adjustform.qty [name='quantity']")
    List<WebElement> oQuantity;

    @FindBy(css = ".adjustform.qty [name='submit']")
    List<WebElement> oUpdate;

    @FindBy(css = "td:nth-child(4) .pricedisplay")
    List<WebElement> oPricePerItem;

    @FindBy(css = "td:nth-child(5) .pricedisplay .pricedisplay")
    List<WebElement> oSubTotal;

    public void goToCheckout() {
        checkoutButton.click();
    }

    public void updateAllQuantities(String quantity){
        for (int i=0; i<oQuantity.size(); i++){
            oQuantity.get(i).clear();
            oQuantity.get(i).sendKeys(quantity);
            oUpdate.get(i).click();
        }
    }

    public void verifyPrices() {
        //our variables
        Double dYourTotal = 0.00d, dSubTotal = 0.00d;


        //variables for the values in the web-page
        Double dYourTotalFromWebPage = 0.00d, dSubTotalFromWebPage = 0.00d, dPricePerItemFromWebPage = 0.00d, dQuantityFromWebPage = 0.00d;

        dYourTotalFromWebPage = Double.parseDouble(oYourTotal.getText().toString().replaceAll("[^\\d.]+", ""));

        //if the cart is empty, do nothing
        if (!oQuantity.isEmpty()) {
            for (int i = 0; i < oQuantity.size(); i++) {
                //convert the values to double
                dPricePerItemFromWebPage = Double.parseDouble(oPricePerItem.get(i).getText().toString().replaceAll("[^\\d.]+", ""));
                dSubTotalFromWebPage = Double.parseDouble(oSubTotal.get(i).getText().toString().replaceAll("[^\\d.]+", ""));
                dQuantityFromWebPage = Double.parseDouble(oQuantity.get(i).getAttribute("value").toString().replaceAll("[^\\d.]+", ""));

                dSubTotal = dPricePerItemFromWebPage * dQuantityFromWebPage;

                Assert.assertTrue((dSubTotal).equals(dSubTotalFromWebPage));
                System.out.println("calculated sub-total is: " + dSubTotal);
                System.out.println("Sub-total from web-page is: " + dSubTotalFromWebPage);
                dYourTotal = dYourTotal + dSubTotal;
            }
        }
        Assert.assertTrue((dYourTotal).equals(dYourTotalFromWebPage));
        System.out.println("calculated Total is: " + dYourTotal);
        System.out.println("Total from web-page is: " + dYourTotalFromWebPage);
    }

    public void removeAllProducts() {
        if (!removeButtons.isEmpty()) {
            int numberOfButtons = removeButtons.size();
            for (int i = numberOfButtons - 1; i >= 0; i--) {
                removeButtons.get(i).click();
            }
        }
    }

    public void nothingInCart() {
        //System.out.println(entryContent.getText());
        Assert.assertTrue(entryContent.getText().equalsIgnoreCase("Oops, there is nothing in your cart."));
    }
}
