package br.com.rafael.interfaces.ex02;

import br.com.rafael.interfaces.ex02.classes.Triathlete;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete("Rafael Fonseca", LocalDate.of(2002, 6, 11));
        triathlete.warmUp();
        triathlete.run();
        triathlete.swim();
        triathlete.pedal();
        System.out.println(triathlete.getDateOfBirth().toString());
    }
}
