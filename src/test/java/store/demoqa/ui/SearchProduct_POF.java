package store.demoqa.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by FlavianDurigu on 4/6/2017.
 */
public class SearchProduct_POF extends PageObject {

    @FindBy (css = ".search")
    WebElement searchButton;

    public void searchForProduct(String str){
        searchButton.sendKeys(str);
        searchButton.sendKeys(Keys.ENTER);
    }
}
