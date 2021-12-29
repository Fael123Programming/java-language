package br.com.rafael.exercises.ex06.greeting;

import java.time.LocalTime;

public class Greeting {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour > 5 && hour < 12)
            System.out.println("Good morning!!!");
        else if (hour >= 12 && hour < 19)
            System.out.println("Good afternoon!!!");
        else if (hour >= 19)
            System.out.println("Good evening!!!");
        else
            System.out.println("Good night!!!");
    }
}
