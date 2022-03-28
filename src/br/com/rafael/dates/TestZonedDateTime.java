package br.com.rafael.dates;

import java.time.*;

public class TestZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
//      Similar to LocalDateTime but it stores time zone information.
        System.out.println("Date and time in Tokyo right now: " + zdt);
        System.out.println("Date and time in Paris right now: " + ZonedDateTime.now(ZoneId.of("Europe/Paris")));
    }
}
