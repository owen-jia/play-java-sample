package com.ts.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

/**
 * @author: Owen Jia
 * @time: 2019/1/29 10:33
 */
public class Java8TimeTest {
    static int printCount = 1;

    public static void dateCalculateTest(){
        LocalDateTime dateTime = LocalDateTime.now(Clock.system(ZoneId.systemDefault()));
        LocalDateTime datetime2 =dateTime.minusDays(2);

        printTest(dateTime);
        printTest(datetime2);
        printTest(datetime2.plusHours(3));
        printTest(datetime2.minusWeeks(1));
        printTest(datetime2.plus(1,ChronoUnit.MONTHS));

        printTest(datetime2.compareTo(dateTime));
        printTest(datetime2.withYear(2));
        printTest(datetime2.isBefore(dateTime));

        Duration duration = Duration.ofDays(5);
        printTest(duration);
        printTest(duration.plusHours(2).toMinutes());
    }

    public static void dateFormatTest(){
        LocalDateTime dateTime = LocalDateTime.now(Clock.systemDefaultZone());

        printTest(dateTime);
        printTest(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        printTest(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        printTest(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));
        printTest(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));

        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("yyyy-MM-dd");
        builder.parseStrict().toFormatter();
        printTest(dateTime.format(builder.parseStrict().toFormatter()));
    }

    public static void dateStringTest(){
        LocalDateTime dateTime = LocalDateTime.now(Clock.system(ZoneId.systemDefault()));
        printTest(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        printTest(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        printTest(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        printTest(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        printTest(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        printTest(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        printTest(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        printTest(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.valueOf("MEDIUM"))));

        printTest(LocalDateTime.parse("2019-12-03T10:15:30").toString());
        printTest(LocalDate.parse("2019-12-03",DateTimeFormatter.ISO_LOCAL_DATE));
        printTest(LocalTime.parse("10:15:30",DateTimeFormatter.ISO_LOCAL_TIME));
    }

    public static void date2OldTest(){

        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.minusHours(2);
        printTest(localDateTime);
        Date localDateTime2 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        printTest(localDateTime2.toString());

        LocalDate localDate = LocalDate.now();
        printTest(localDate);
        Date localDate2 = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        printTest(localDate2);

        Date date = new Date();
        printTest(date);
        LocalDateTime date2 = LocalDateTime.ofInstant(date.toInstant(),ZoneId.systemDefault());
        printTest(date2);

        LocalTime localTime = LocalDateTime.ofInstant(new Date().toInstant(),ZoneId.systemDefault()).toLocalTime();
        printTest(localTime);
    }

    public static void printTest(Object print){
        if(print instanceof LocalDateTime){
            LocalDateTime localDateTime = (LocalDateTime) print;
            System.out.println(printCount++ + " : " + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        } else
            System.out.println(printCount++ + " : " + print);
    }

    public static void main(String[] args){
        Java8TimeTest.date2OldTest();
    }
}
