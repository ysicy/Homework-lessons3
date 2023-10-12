package pages.components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CalendarComponent {

public void setDate (String day, String month, String year){
    $(".react-datepicker__month-select").selectOption(month);
    $(".react-datepicker__year-select").selectOption(year);
//    $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();




}

    public void setFakeDate(String day, String month, String year) {

        $(By.id("dateOfBirthInput")).click();
//        $(By.className("react-datepicker__month-select")).selectOptionByValue(month);
        $(By.className("react-datepicker__month-select")).selectOption(month);
        $(By.className("react-datepicker__year-select")).selectOptionByValue(year);
        String hola = "react-datepicker__day--0"+day;
        $(By.className(hola)).click();



//        $(By.xpath("//*[@id='dateOfBirthInput']")).click();
//        $(By.xpath("//input[@class='form-control react-datepicker-ignore-onclickoutside']//")).clear();
////        $(By.id("#dateOfBirthInput")).clear();
//        sleep(5000);
//        $(By.id("#dateOfBirthInput")).setValue(dateFake).pressEnter();
    }
}
