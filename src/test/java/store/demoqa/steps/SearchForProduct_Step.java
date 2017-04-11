package store.demoqa.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import store.demoqa.ui.DemoQAHomePage_POF;
import store.demoqa.ui.SearchProduct_POF;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by FlavianDurigu on 4/6/2017.
 */
public class SearchForProduct_Step {
    SearchProduct_POF searchPage;
    DemoQAHomePage_POF homePage;

    @Step
    public void isOnTheHomePage(){
    homePage.open();
    }

    @Step
    public void searchForProduct(String s) {
        searchPage.searchForProduct(s);
    }

    public void shouldSeeProduct(String expectedTitle) {
       /* System.out.println("Exp:"+expectedTitle);
        System.out.println("Act:"+getDriver().getTitle());*/
        Assert.assertTrue(getDriver().getTitle().equalsIgnoreCase(expectedTitle));
    }
}
