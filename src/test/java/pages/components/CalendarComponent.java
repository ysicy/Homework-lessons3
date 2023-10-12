package pages.components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
//    $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();


    }

    public void setFakeDate(Integer day, String month, String year) {
        if (day >= 1 && day <= 9) {
            $(By.id("dateOfBirthInput")).click();
            $(By.className("react-datepicker__month-select")).selectOption(month);
            $(By.className("react-datepicker__year-select")).selectOptionByValue(year);
            String hola = "react-datepicker__day--00" + day;
            $(By.className(hola)).click();
        } else {
            $(By.id("dateOfBirthInput")).click();
            $(By.className("react-datepicker__month-select")).selectOption(month);
            $(By.className("react-datepicker__year-select")).selectOptionByValue(year);
            String hola = "react-datepicker__day--0" + day;
            $(By.className(hola)).click();
        }
    }
}