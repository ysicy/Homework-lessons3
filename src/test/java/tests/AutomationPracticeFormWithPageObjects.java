package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;


public class AutomationPracticeFormWithPageObjects extends TestBase {
    private static final String URL = "/automation-practice-form";
    private String firstNameInput = "Alex",
            lastNameInput = "Sh",
            userEmailInput = "user@email.com",
            genderWrapper = "Male",
            userNumberInput = "1234567890",
            year = "2023",
            month = "September",
            day = "02",
            subjectsInput = "Maths",
            youHobbiesWrapper = "Sports",
            uploadPicture = "1.png",
            currentAddress = "Maybe",
            stateWrapper = "Haryana",
            cityWrapper = "Karnal";


    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {

        registrationPage.openPage(URL)
                .setFirstName(firstNameInput)
                .setLastName(lastNameInput)
                .setUserEmail(userEmailInput)
                .setGender(genderWrapper)
                .setUserNumber(userNumberInput)
                .setDateForm(day, month, year)
                .setSubjects(subjectsInput)
                .setHobbiesWrapper(youHobbiesWrapper)
                .setUploadPicture(uploadPicture)
                .setCurrentAddress(currentAddress)
                .setStateWrapper(stateWrapper)
                .setCityWrapper(cityWrapper)
                .clickSubmit();

        registrationPage.checkResult("Student Name", firstNameInput + " " + lastNameInput)
                .checkResult("Student Email", userEmailInput)
                .checkResult("Mobile", userNumberInput)
                .checkResult("Gender", genderWrapper)
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Subjects", subjectsInput)
                .checkResult("Hobbies", youHobbiesWrapper)
                .checkResult("Picture", uploadPicture)
                .checkResult("Address", currentAddress)
                .checkResult("State and City", stateWrapper + " " + cityWrapper);

    }
}