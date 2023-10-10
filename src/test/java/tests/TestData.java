package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static utils.RandomUtilsWithFaker.*;

public class TestData extends TestBase {



     String firstNameInput = getRandomString(10);
    String lastNameInput = getRandomString(10);
    String userEmailInput = getRandomEmail ();
    String currentAddress = getRandomAddress();
    String genderWrapper = getRandomGender();
    String youHobbiesWrapper = getRandomHobbies();
    String subjectsInput = getRandomSubjects();
    String userNumberInput = getRandomPhone();
    int day = getRandomDay();
    String month = getRandomMonth();
    int year = getRandomYear();

    private static final String URL = "/automation-practice-form";

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {

        registrationPage
                .openPage(URL)
                .setFirstName(firstNameInput)
                .setLastName(lastNameInput)
                .setUserEmail(userEmailInput)
               .setGender(genderWrapper)
                .setUserNumber(userNumberInput)
//               .setDateForm(day, month, year)
                .setSubjects(subjectsInput)
                .setHobbiesWrapper(youHobbiesWrapper)
//                .setUploadPicture(uploadPicture)
                .setCurrentAddress(currentAddress)
//                .setStateWrapper(stateWrapper)
//                .setCityWrapper(cityWrapper)
                .clickSubmit();

        registrationPage.checkResult("Student Name", firstNameInput + " " + lastNameInput)
                .checkResult("Student Email", userEmailInput)
               .checkResult("Mobile", userNumberInput)
               .checkResult("Gender", genderWrapper)
//               .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Subjects", subjectsInput)
                .checkResult("Hobbies", youHobbiesWrapper)
//                .checkResult("Picture", uploadPicture)
                .checkResult("Address", currentAddress);
//                .checkResult("State and City", stateWrapper + " " + cityWrapper);

    }
}
