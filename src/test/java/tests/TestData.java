package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.RandomUtilsWithFaker;

import static utils.RandomUtilsWithFaker.*;

public class TestData extends TestBase {

    private static final String URL = "/automation-practice-form";

    RegistrationPage registrationPage = new RegistrationPage();
    RandomUtilsWithFaker random = new RandomUtilsWithFaker();

    @Test
    void fillFormTest() {

        registrationPage
                .openPage(URL)
                .setFirstName(random.getFirstName)
                .setLastName(random.getLastName)
                .setUserEmail(random.getRandomEmail)
               .setGender(random.getRandomGender())
//                .setUserNumber()
               .setDateForm(random.getDayOfBirth, random., ra)
                .setSubjects(random.getRandomSubjects())
                .setHobbiesWrapper(random.getRandomHobbies())
//                .setUploadPicture(uploadPicture)
                .setCurrentAddress(random.getRandomCurrentAddress)
//                .setStateWrapper(stateWrapper)
//                .setCityWrapper(cityWrapper)
                .clickSubmit();

        registrationPage.checkResult("Student Name", random.getFirstName + " " + random.getLastName)
                .checkResult("Student Email", random.getRandomEmail)
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
