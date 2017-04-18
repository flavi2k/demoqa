package store.demoqa.features.navigation;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import store.demoqa.steps.ProductCategory_Step;


/**
 * Created by FlavianDurigu on 4/5/2017.
 */
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src\\test\\java\\store\\demoqa\\resources\\Categories.csv")
public class TestBrowseProductCategory_Feature {

    String category;
    String expectedTitle;

    @Qualifier
    public String getQualifier() {
        return category;
    }

    @Steps
    ProductCategory_Step user1;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    //@BlurScreenshots(BlurLevel.LIGHT)
    public void navigating(){
        user1.isOnTheHomePage();
        user1.catNavigation(category);
        user1.shouldSeePageTitleContaining(expectedTitle);
    }

    /* @Test

    public void userShouldBeAbleToNavigateToAccessoriesCategory()  {

        // Given
        user1.isOnTheHomePage();

        // When
        user1.navigatesToAccessoriesCategory();

        // Then
        user1.shouldSeePageTitleContaining("Accessories | ONLINE STORE");

        user1.addAllToCart();
    }*/

    /*@Test
    public void userShouldBeAbleToNavigateToImacsCategory(){

        // Given
        user1.isOnTheHomePage();

        // When
        user1.navigatesToImacsCategory();

        // Then
        user1.shouldSeePageTitleContaining("IMACS | ONLINE STORE");
    }

    @Test
    public void userShouldBeAbleToNavigateToIpadsCategory(){

        // Given
        user1.isOnTheHomePage();

        // When
        user1.navigatesToIpadsCategory();

        // Then
        user1.shouldSeePageTitleContaining("IPADS | ONLINE STORE");
    }

    @Test
    public void userShouldBeAbleToNavigateToIphonesCategory(){

        // Given
        user1.isOnTheHomePage();

        // When
        user1.navigatesToIphonesCategory();

        // Then
        user1.shouldSeePageTitleContaining("IPHONES | ONLINE STORE");
    }

    @Test
    public void userShouldBeAbleToNavigateToIpodsCategory(){

        // Given
        user1.isOnTheHomePage();

        // When
        user1.navigatesToIpodsCategory();

        // Then
        user1.shouldSeePageTitleContaining("IPODS | ONLINE STORE");
    }

    @Test
    public void userShouldBeAbleToNavigateToMacbooksCategory(){

        // Given
        user1.isOnTheHomePage();

        // When
        user1.navigatesToMacbooksCategory();

        // Then
        user1.shouldSeePageTitleContaining("MACBOOKS | ONLINE STORE");
    }*/
}
