package demoqatests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormWithPageObjects extends  TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {



        SelenideElement LastNameInput = $("#lastName");


        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Sh")
                .setUserEmail("user@email.com")
                .setGender("Male")
                .setUserNumber("1234567890");


        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Sh");
        $("#userEmail").setValue("user@email.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("September");
        $(".react-datepicker__year-select").selectOption("2023");
        $(".react-datepicker__day--002").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("1.png");
        $("#currentAddress").setValue("Maybe");
        $("#stateCity-wrapper #state input").setValue("Haryana").pressEnter();
        $("#stateCity-wrapper #city input").setValue("Karnal").pressEnter();
        $("#submit").click();





        $(".modal-content").shouldHave(text("Alex Sh"));
        $(".modal-content").shouldHave(text("user@email.com"));
        $(".modal-content").shouldHave(text("Male"));
        $(".modal-content").shouldHave(text("1234567890"));
        $(".modal-content").shouldHave(text("02 September,2023"));
        $(".modal-content").shouldHave(text("Maths"));
        $(".modal-content").shouldHave(text("Sports"));
        $(".modal-content").shouldHave(text("1.png"));
        $(".modal-content").shouldHave(text("Maybe"));
        $(".modal-content").shouldHave(text("Haryana Karnal"));
    }
}