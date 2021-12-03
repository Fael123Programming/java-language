package br.com.rafael.dates;

import java.util.Date;

public class TestDateClass {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt.getTime()); //Milliseconds since "the epoch": January 1, 1970 00:00:00 GMT.
        System.out.println(dt);
        Date dt2 = new Date(99999931223L);
        System.out.println(dt2.getTime());
        System.out.println(dt2);
        dt2.setTime(dt.getTime());
    }
}
