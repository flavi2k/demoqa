package store.demoqa.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import store.demoqa.steps.SearchForProductNavigatingUser;

/**
 * Created by FlavianDurigu on 4/6/2017.
 */
@RunWith(SerenityRunner.class)
public class WhenSearchingForProduct {

    @Steps
    SearchForProductNavigatingUser bill;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToSearchForProducts() {
        // Given
        bill.isOnTheHomePage();

        // When
        bill.searchForProduct("iphone");

        //Then
        bill.shouldSeeProduct("iphone | Search Results  | ONLINE STORE");
    }

}
