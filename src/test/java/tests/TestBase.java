package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.TextBoxPage;

public class TestBase {


    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a.shabelnikov\\Homework-lessons333\\src\\test\\resources\\chromedriver.exe");

    }


}
