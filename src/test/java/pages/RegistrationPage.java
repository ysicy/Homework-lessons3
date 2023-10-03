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
            userNumberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            youHobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateWrapper = $("#stateCity-wrapper #state input"),
            cityWrapper = $("#stateCity-wrapper #city input"),
            submit = $("#submit");

    public RegistrationPage openPage(String url) {
        open(url);
        removeBanners();
        return this;
    }

    public RegistrationPage removeFooterAndBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    //Actions
    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegistrationPage setUserEmail(String email) {
        userEmailInput.setValue(email);

        return this;
    }

    public RegistrationPage setGender(String gender) {
        genderWrapper.$(byText(gender)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String number) {
        userNumberInput.setValue(number);

        return this;
    }

    public RegistrationPage setDateForm(String day, String month, String year) {
        calendar.setDate(day, month, year);


        return this;
    }

    public RegistrationPage setSubjects(String subjects) {
        subjectsInput.setValue(subjects).pressEnter();

        return this;
    }

    public RegistrationPage setHobbiesWrapper(String hobby) {
        youHobbiesWrapper.$(byText(hobby)).click();

        return this;
    }

    public RegistrationPage setUploadPicture(String picture) {
        uploadPicture.uploadFromClasspath("1.png");

        return this;
    }

    public RegistrationPage setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);

        return this;
    }

    public RegistrationPage setStateWrapper(String state) {
        stateWrapper.setValue(state).pressEnter();

        return this;
    }

    public RegistrationPage setCityWrapper(String city) {
        cityWrapper.setValue(city).pressEnter();

        return this;
    }

    public void clickSubmit() {
        submit.click();
    }

    public RegistrationPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));

        return this;
    }
}
