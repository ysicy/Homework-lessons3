package demoqatests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;




public class AutomationPracticeFormWithPageObjects extends  TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {


        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Sh")
                .setUserEmail("user@email.com")
                .setGender("Male")
                .setUserNumber("1234567890")
                .setDateForm("002", "September", "2023")
                .setSubjects("Maths")
                .setHobbiesWrapper("Sports")
                .setUploadPicture("1.png")
                .setCurrentAddress("Maybe")
                .setStateWrapper("Haryana")
                .setCityWrapper("Karnal").clickSubmit("submit");

        registrationPage.checkResult("Student Name","Alex Sh")
                .checkResult("Student Email", "user@email.com")
                .checkResult("Mobile", "1234567890")
                .checkResult("Gender","Male")
                .checkResult("Date of Birth","02 September,2023" )
                .checkResult("Subjects","Maths")
                .checkResult("Hobbies","Sports")
                .checkResult("Picture","1.png")
                .checkResult("Address","Maybe")
                .checkResult("State and City","Haryana Karnal");

    }
}