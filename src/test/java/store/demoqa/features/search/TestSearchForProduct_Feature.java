package store.demoqa.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import store.demoqa.steps.SearchForProduct_Step;

/**
 * Created by FlavianDurigu on 4/6/2017.
 */
@RunWith(SerenityRunner.class)
public class TestSearchForProduct_Feature {

    @Steps
    SearchForProduct_Step user1;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    public void userShouldBeAbleToSearchForProducts() {
        // Given
        user1.isOnTheHomePage();

        // When
        user1.searchForProduct("iphone");

        //Then
        user1.shouldSeeProduct("iphone | Search Results | ONLINE STORE");
    }

}
