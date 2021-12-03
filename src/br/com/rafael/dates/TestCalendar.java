package br.com.rafael.dates;

import java.util.*;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.getCalendarType());
        calendar.add(Calendar.DAY_OF_WEEK, -1);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        A Date object can be used with a Calendar one and vice-versa.
        calendar.roll(Calendar.HOUR_OF_DAY, 24);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
