package store.demoqa.features.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import store.demoqa.features.ui.DemoQAHomePage;
import store.demoqa.model.Category;
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
    public void navigatesToCategory() {
       productCategory.selectCategory();
    }

    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(getDriver().getTitle().equalsIgnoreCase(expectedTitle));
    }
}
