package store.demoqa.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import store.demoqa.model.Category;

/**
 * Created by FlavianDurigu on 4/5/2017.
 */
public class ProductCategory extends PageObject{

    @FindBy(css = "#menu-item-33>a")
    WebElement products;

    @FindBy(css="#menu-item-34>a")
    WebElement acc;

    public void selectCategory() {
        Actions action = new Actions(getDriver());
        action.moveToElement(products).moveToElement(acc).click().build().perform();

    }
}
