package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;




public class TextBoxPageTestWithpageobjects extends TestBase {
    private static final String URL = "/text-box";
    private String userName = "alex",
            userEmail = "alex@mail.ru",
            currentAddressTextArea = "Moscow",
            permanentAddressTextArea = "Moscow2";

    public TextBoxPage textBoxTest = new TextBoxPage();

    @Test
    void fillFormTest() {
//test
        textBoxTest.openPage(URL)
                .setUserName(userName)
                .setUserEmail(userEmail)
                .setCurrentAddress(currentAddressTextArea)
                .setPermanentAddress(permanentAddressTextArea)
                .clickButton();

//check
        textBoxTest
                .blockResult(userName)
                .blockResult(userEmail)
                .blockResult(currentAddressTextArea)
                .blockResult(permanentAddressTextArea);

    }
    @Test
        public void dontFillFormTest() {
            textBoxTest.openPage(URL)
                    .setUserName(userEmail)
                    .clickButton();

            textBoxTest.blockResult(userEmail);

        }

}
