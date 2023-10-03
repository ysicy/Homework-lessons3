package pages.components;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class DefaultSettingsPage {
    public void removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }
}