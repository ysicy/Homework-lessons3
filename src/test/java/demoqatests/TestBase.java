package demoqatests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.TextBoxPage;

public class TestBase {
    public TextBoxPage textBoxTest = new TextBoxPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";

    }


}
