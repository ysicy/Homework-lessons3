package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;


public class TextBoxPageTestWithpageobjects extends TestBase {
    public TextBoxPage textBoxTest = new TextBoxPage();

    @Test
    void fillFormTest() {
//test
        textBoxTest.openPage()
                .setUserName("Alex")
                .setUserEmail("alex@mail.ru")
                .setCurrentAddress("Moscow")
                .setPermanentAddress("Moscow2")
                .clickButton();

//check
        textBoxTest
                .blockResult("Alex")
                .blockResult("alex@mail.ru")
                .blockResult("Moscow")
                .blockResult("Moscow2");
    }
}
