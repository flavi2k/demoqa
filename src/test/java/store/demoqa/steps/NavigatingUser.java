package store.demoqa.steps;

import net.thucydides.core.annotations.Step;
import store.demoqa.ui.DemoQAHomePage;
import store.demoqa.ui.ProductCategory;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/5/2017.
 */
public class NavigatingUser {

    DemoQAHomePage demoQAHomePage;
    ProductCategory productCategory;

    @Step
    public void isOnTheHomePage() {
        demoQAHomePage.open();
    }

    @Step
    public void navigatesToAccessoriesCategory() {
       productCategory.selectAccessoriesCategory();
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
        assertThat(getDriver().getTitle().equalsIgnoreCase(expectedTitle));
    }
}
