package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

public void setDate (String day, String month, String year){
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOption("September");
    $(".react-datepicker__year-select").selectOption("2023");
    $(".react-datepicker__day--002").click();
}
}
