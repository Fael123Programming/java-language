package br.com.rafael.annotations.ex02;

public class Cleaner {

    @Schedule(dayOfMonth = 15, dayOfWeek = 6)
    @Schedule(hour = 10)
    public void doPeriodicCleanUp() {
        System.out.println("Clean up done!");
    }
}
