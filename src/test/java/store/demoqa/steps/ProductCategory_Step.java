package store.demoqa.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import store.demoqa.ui.DemoQAHomePage_POF;
import store.demoqa.ui.ProductCategory_POF;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/5/2017.
 */
public class ProductCategory_Step {

    DemoQAHomePage_POF demoQAHomePage;
    ProductCategory_POF productCategory;

    @Step ("User is on the home page")
    public void isOnTheHomePage() {
        demoQAHomePage.open();
    }

    @Step
    public void navigatesToAccessoriesCategory() {
       productCategory.selectAccessoriesCategory();
    }

    @Step
    public void addAllToCart() throws InterruptedException {
        productCategory.addAllProductsToCart();
    }

    @Step
    public void navigatesToImacsCategory(){
        productCategory.selectiMacsCategory();
    }

    @Step
    public void navigatesToIpadsCategory(){
        productCategory.selectiPadsCategory();
    }

    @Step
    public void navigatesToIphonesCategory(){
        productCategory.selectiPhonesCategory();
    }

    @Step
    public void navigatesToIpodsCategory(){
        productCategory.selectiPodsCategory();
    }

    @Step
    public void navigatesToMacbooksCategory(){
        productCategory.selectMacBooksCategory();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
                Assert.assertTrue(getDriver().getTitle().equalsIgnoreCase(expectedTitle));
    }
}
