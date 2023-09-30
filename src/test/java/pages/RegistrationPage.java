package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    //Elements
    CalendarComponent calendar = new CalendarComponent();
    SelenideElement titleLabel = $(".practice-form-wrapper"),
     firstNameInput = $("#firstName"),
     lastNameInput = $("#lastName"),
     userEmailInput = $("#userEmail"),
     genderWrapper = $("#genterWrapper"),
     userNumberInput=  $("#userNumber");


    public RegistrationPage openPage () {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        titleLabel.shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");

        return this;
    }




    //Actions
    public RegistrationPage setFirstName (String value) {
        firstNameInput.setValue(value);

        return this;
    }
    //not used
//    public RegistrationPage clickFirstName () {
//        firstNameInput.click();
//    }

    public RegistrationPage setLastName (String value) {
        lastNameInput.setValue(value);

        return this;
    }
    public RegistrationPage setUserEmail (String value) {
        userEmailInput.setValue(value);

        return this;
    }
    public RegistrationPage setGender (String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }
    public RegistrationPage setUserNumber (String value) {
    userNumberInput.setValue(value);

        return this;
    }
    public RegistrationPage setDateForm (String day, String month, String year) {
        calendar.setDate("002", "September", "2023");


        return this;
    }
}
