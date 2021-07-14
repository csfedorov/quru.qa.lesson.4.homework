package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Konstantin Fedorov on 14.07.2021.
 */
public class SoftAssertionTest {
    String softAssertionPageName = "SoftAssertions";

    @BeforeAll
    public static void setUp() {
        Configuration.startMaximized = true;
    }

    @Test
    void softAssertionTest() {
        open("https://github.com/selenide/selenide");
        $("[data-content=Wiki]").click();
        $("#wiki-pages-filter").setValue(softAssertionPageName);
        $(byText(softAssertionPageName)).click();
        $("#wiki-body").shouldHave(text("JUnit5 extension - com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
