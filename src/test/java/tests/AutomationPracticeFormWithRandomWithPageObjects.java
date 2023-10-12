package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.RandomUtilsWithFaker;


public class AutomationPracticeFormWithRandomWithPageObjects extends TestBase {



    private static final String URL = "/automation-practice-form";

    RegistrationPage registrationPage = new RegistrationPage();

    RandomUtilsWithFaker random = new RandomUtilsWithFaker();

    @Test
    void fillFormTest() {

        registrationPage
                .openPage(URL)
                .setFirstName(random.firstName)
                .setLastName(random.lastName)
                .setUserEmail(random.email)
                .setGender(random.gender)
                .setUserNumber(random.userNumberInput)
                .setDateFakeForm(random.dayOfBirth, random.monthOfBirth, random.yearOfBirth)
                .setSubjects(random.subjects)
                .setHobbiesWrapper(random.hobbies)
                .setUploadPicture(random.picture)
                .setCurrentAddress(random.randomAddress)
                .setStateWrapper(random.state)
                .setCityWrapper(random.city)
                .clickSubmit();

        registrationPage.checkResult("Student Name", random.firstName + " " + random.lastName)
                .checkResult("Student Email", random.email)
                .checkResult("Mobile", random.userNumberInput)
                .checkResult("Gender", random.gender)
                .checkResult("Date of Birth", random.dayOfBirth + " " + random.monthOfBirth + "," + random.yearOfBirth)
                .checkResult("Subjects",random.subjects)
                .checkResult("Hobbies", random.hobbies)
                .checkPictureResult("Picture", random.picture)
                .checkResult("Address", random.randomAddress)
                .checkResult("State and City", random.state + " " + random.city);

    }
}
