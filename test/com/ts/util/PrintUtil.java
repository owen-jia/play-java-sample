package com.ts.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: Owen Jia
 * @time: 2019/2/12 16:08
 */
public class PrintUtil {

    static int printCount = 1;

    public static void printTest(Object print){
        if(print instanceof LocalDateTime){
            LocalDateTime localDateTime = (LocalDateTime) print;
            System.out.println(printCount++ + " : " + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        } else
            System.out.println(printCount++ + " : " + print);
    }
}
