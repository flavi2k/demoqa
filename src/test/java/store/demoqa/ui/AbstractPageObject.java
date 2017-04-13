package store.demoqa.ui;

import net.serenitybdd.core.pages.PageObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.annotation.Nullable;

/**
 * Created by FlavianDurigu on 4/13/2017.
 */
public class AbstractPageObject extends PageObject {

    public AbstractPageObject(WebDriver driver){
        super(driver);
    }

    protected void waitForPageToLoad(){
        try {
            ExpectedCondition<Boolean> pageLoadCondition = new
                    ExpectedCondition<Boolean>() {
                        @Nullable
                        @Override
                        public Boolean apply(@Nullable WebDriver driver) {
                            return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                        }
                    };
            WebDriverWait wait = new WebDriverWait(getDriver(),(waitForTimeoutInMilliseconds() / 1000));
            wait.until(pageLoadCondition);
        }catch (Exception e) {}
    }

    protected void waitForElementToDisappearFromDomById(String id) {
        long endTime = System.currentTimeMillis() + waitForTimeoutInMilliseconds();
        do {
            String pageSource = getDriver().getPageSource();
            Document document = Jsoup.parse(pageSource);
            Element element = document.getElementById(id);
            if (element == null){
                return;
            }
        } while (System.currentTimeMillis() <= endTime);
    }
}
