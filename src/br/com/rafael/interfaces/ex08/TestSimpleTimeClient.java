package br.com.rafael.interfaces.ex08;

public class TestSimpleTimeClient {
    public static void main(String[] args) {
        TimeSetter ts = new SimpleTimeClient();
        System.out.println(ts);
        System.out.println(ts.getLocalDateTime());
        ts.setDate(11, 6, 2002);
        System.out.println(ts);
        System.out.println(ts.getZonedDateTime("Europe/Paris"));
    }
}
