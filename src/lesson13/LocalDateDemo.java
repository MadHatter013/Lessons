package lesson13;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1993,5,14);

        System.out.println(birthday.getDayOfMonth());
        System.out.println(birthday.getDayOfYear());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getMonthValue());
        System.out.println(birthday.getYear());
        System.out.println(birthday.getChronology());

        System.out.println(birthday.isLeapYear());
        System.out.println(birthday);
    }
}
