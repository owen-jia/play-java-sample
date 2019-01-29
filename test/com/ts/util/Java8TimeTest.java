package com.ts.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author: Owen Jia
 * @time: 2019/1/29 10:33
 */
public class Java8TimeTest {
    static int printCount = 1;

    public static void dateCalculateTest(){
        LocalDateTime dateTime = LocalDateTime.now(Clock.system(ZoneId.systemDefault()));
        LocalDateTime datetime2 =dateTime.minusDays(2);

    }

    public static void dateFormatTest(){

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

    }

    public static void printTest(Object print){
        System.out.println(printCount++ + " : " + print);
    }

    public static void main(String[] args){
        Java8TimeTest.dateStringTest();
    }
}
