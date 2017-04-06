package store.demoqa.steps;


import net.thucydides.core.annotations.Step;
import store.demoqa.ui.DemoQAHomePage;
import store.demoqa.ui.SearchProduct;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/6/2017.
 */
public class SearchForProductNavigatingUser {
    SearchProduct srch;
    DemoQAHomePage homePage;

    @Step
    public void isOnTheHomePage(){
    homePage.open();
    }

    @Step
    public void searchForProduct(String s) {
        srch.searchForProduct(s);

    }

    public void shouldSeeProduct(String expectedTitle) {
        assertThat(getDriver().getTitle().equalsIgnoreCase(expectedTitle));
    }
}
