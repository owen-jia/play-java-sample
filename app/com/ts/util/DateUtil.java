package com.ts.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author: Owen Jia
 * @time: 2019/1/18 17:44
 */
public class DateUtil {

    final static String defaultDateFormat = "yyyy-MM-dd HH:mm:SS";

    public static String currentDate(){
        LocalDate localDate = LocalDate.now();
        return localDate.toString();
    }

}
