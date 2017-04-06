package store.demoqa.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import store.demoqa.features.steps.NavigatingUser;
import store.demoqa.model.Category;

/**
 * Created by FlavianDurigu on 4/5/2017.
 */
@RunWith(SerenityRunner.class)
public class WhenBrowsingCategories {

    @Steps
    NavigatingUser user1;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    public void shouldSeeTheProductCategories(){

        // Given
        user1.isOnTheHomePage();

        // When
        user1.navigatesToCategory();

        // Then
        user1.shouldSeePageTitleContaining("Accessories | ONLINE STORE");


    }


}
