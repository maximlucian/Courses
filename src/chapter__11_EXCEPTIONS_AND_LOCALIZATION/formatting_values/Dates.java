package chapter__11_EXCEPTIONS_AND_LOCALIZATION.formatting_values;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, Month.OCTOBER, 20);

        System.out.println(date.getDayOfWeek());  // MONDAY
        System.out.println(date.getMonth());      // OCTOBER
        System.out.println(date.getYear());       // 2025
        System.out.println(date.getDayOfYear());  // 293

        LocalDate dateTwo = LocalDate.of(2025, Month.OCTOBER, 20);
        LocalTime timeTwo = LocalTime.of(11, 12, 34);
        LocalDateTime dtTwo = LocalDateTime.of(dateTwo, timeTwo);

        System.out.println(dateTwo.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(timeTwo.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dtTwo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    }
}
