package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

public void setDate (String day, String month, String year){
    $("#dateOfBirthInput").click();
<<<<<<< HEAD
    $(".react-datepicker__month-select").selectOption(month);
    $(".react-datepicker__year-select").selectOption(year);
    $(".react-datepicker__day--0" + day).click();
=======
    $(".react-datepicker__month-select").selectOption("September");
    $(".react-datepicker__year-select").selectOption("2023");
    $(".react-datepicker__day--002").click();
>>>>>>> origin/main
}
}
