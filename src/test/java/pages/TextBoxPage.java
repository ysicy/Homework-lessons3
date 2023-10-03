package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.DefaultSettingsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage   extends DefaultSettingsPage {


    SelenideElement mainHeaderText = $(".main-header"),
            userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddressTextArea = $("#currentAddress"),
            permanentAddressTextArea = $("#permanentAddress"),
            submitButton = $(".btn-primary"),
            result = $("#output");
    public TextBoxPage openPage() {
        open("/text-box");
        removeBanners();
        return this;
    }
    public TextBoxPage setUserName(String value) {
        userName.setValue(value);
        return this;
    }
    public TextBoxPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }
    public TextBoxPage setCurrentAddress(String value) {
        currentAddressTextArea.setValue(value);
        return this;
    }
    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressTextArea.setValue(value);
        return this;
    }
    public TextBoxPage clickButton() {
        submitButton.click();
        return this;
    }
    public TextBoxPage blockResult(String value) {
        result.shouldHave(text(value));
        return this;
    }



}
