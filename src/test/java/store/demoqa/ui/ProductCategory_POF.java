package store.demoqa.ui;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by FlavianDurigu on 4/5/2017.
 */
public class ProductCategory_POF extends AbstractPageObject {

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

    public ProductCategory_POF(WebDriver driver) {
        super(driver);
    }

    public void addAllProductsToCart()  {
        int numberOfElements = buyButton.size();
        for(int i=0;i<numberOfElements;i++) {
            waitFor(ExpectedConditions.elementToBeClickable(buyButton.get(i)));
            buyButton.get(i).click();
            waitFor(ExpectedConditions.elementToBeClickable(continueShoppingButton));
            continueShoppingButton.click();
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
