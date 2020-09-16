package com.papaya.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {

    //jsr - 310
    public static void main(String[] args) {

//        LocalTime now1 = LocalTime.now();

//        LocalDateTime now1 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("G uuuu/MM/dd E");

        LocalDate now = LocalDate.now();

        LocalDate yest = now.minusDays(1);

        LocalDate localDate = now.withYear(1978);


        long between = ChronoUnit.DAYS.between(localDate, now);
        System.out.println("between = " + between);

        LocalDate birthday = LocalDate.of(1978, 10, 3);

        System.out.println(birthday.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));
        System.out.println(birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));


        String s = formatter.format(now);
        System.out.println("s = " + s);


    }
}
