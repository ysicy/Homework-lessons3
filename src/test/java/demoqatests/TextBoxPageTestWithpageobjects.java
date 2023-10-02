package demoqatests;

import org.junit.jupiter.api.Test;


public class TextBoxPageTestWithpageobjects extends  TestBase {



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
