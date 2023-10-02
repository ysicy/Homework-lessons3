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
     userNumberInput=  $("#userNumber"),
     subjectsInput = $("#subjectsInput"),
    youHobbiesWrapper = $("#hobbiesWrapper"),
    uploadPicture =   $("#uploadPicture"),
    currentAddress = $("#currentAddress"),
    stateWrapper = $("#stateCity-wrapper #state input"),
    cityWrapper = $("#stateCity-wrapper #city input"),
    submit = $("#submit");


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
    public RegistrationPage setSubjects (String value) {
        subjectsInput.setValue("Maths").pressEnter();

        return this;
    }
    public RegistrationPage setHobbiesWrapper (String value) {
        youHobbiesWrapper.$(byText("Sports")).click();

        return this;
    }
    public RegistrationPage setUploadPicture (String value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }
    public RegistrationPage setCurrentAddress (String value) {
        currentAddress.setValue(value);

        return this;
    }
    public RegistrationPage setStateWrapper (String value) {
        stateWrapper.setValue("Haryana").pressEnter();

        return this;
    }
    public RegistrationPage setCityWrapper (String value) {
        cityWrapper.setValue("Karnal").pressEnter();

        return this;
    }
    public RegistrationPage clickSubmit (String value) {
        submit.click();

        return this;
    }
    public RegistrationPage checkResult (String key, String value) {
$(".table-responsive").$(byText(key)).parent()
        .shouldHave(text(value));

        return this;
    }
}
