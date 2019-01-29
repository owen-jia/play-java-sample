package com.ts.util;

import java.util.Calendar;

/**
 * @author: Owen Jia
 * @time: 2019/1/29 16:00
 */
public class CalendarTest {

    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime() + " : " + calendar.getTimeZone());

        calendar.set(Calendar.HOUR,24);
        calendar.set(Calendar.MINUTE,2);
        System.out.println(calendar.getTime() + " : " + calendar.getTimeZone());

        calendar.set(2018,11,11,0,0,1);
        System.out.println(calendar.getTime() + " : " + calendar.getTimeZone());

    }
}
