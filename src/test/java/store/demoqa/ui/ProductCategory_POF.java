package store.demoqa.ui;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by FlavianDurigu on 4/5/2017.
 */
public class ProductCategory_POF extends PageObject {

    @FindBy(css = "#menu-item-33>a")
    WebElement products;

    @FindBy(css = "#menu-item-34>a")
    WebElement accessories;

    @FindBy(css = "#menu-item-35>a")
    WebElement iMacs;

    @FindBy(css = "#menu-item-36>a")
    WebElement iPads;

    @FindBy(css = "#menu-item-37>a")
    WebElement iPhones;

    @FindBy(css = "#menu-item-38>a")
    WebElement iPods;

    @FindBy(css = "#menu-item-39>a")
    WebElement MacBooks;

    @FindBy(css=".wpsc_buy_button")
    List<WebElement> buyButton;

    @FindBy(css=".continue_shopping")
    WebElement continueShoppingButton;

    public void addAllProductsToCart() throws InterruptedException {
        int numberOfElements = buyButton.size();
        for(int i=0;i<numberOfElements;i++) {
            buyButton.get(i).click();
            Thread.sleep(3000);
            continueShoppingButton.click();
            Thread.sleep(3000);
        }
    }

    public void selectAccessoriesCategory() {
        Actions action = new Actions(getDriver());
        action.moveToElement(products).moveToElement(accessories).click().build().perform();
    }

    public void selectiMacsCategory() {
        Actions action = new Actions(getDriver());
        action.moveToElement(products).moveToElement(iMacs).click().build().perform();
    }

    public void selectiPadsCategory() {
        Actions action = new Actions(getDriver());
        action.moveToElement(products).moveToElement(iPads).click().build().perform();
    }

    public void selectiPhonesCategory() {
        Actions action = new Actions(getDriver());
        action.moveToElement(products).moveToElement(iPhones).click().build().perform();
    }

    public void selectiPodsCategory() {
        Actions action = new Actions(getDriver());
        action.moveToElement(products).moveToElement(iPods).click().build().perform();
    }

    public void selectMacBooksCategory() {
        Actions action = new Actions(getDriver());
        action.moveToElement(products).moveToElement(MacBooks).click().build().perform();
    }
}
