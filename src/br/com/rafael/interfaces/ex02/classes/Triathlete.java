package br.com.rafael.interfaces.ex02.classes;

import br.com.rafael.interfaces.ex02.interfaces.*;
import java.time.LocalDate;

public class Triathlete extends Person implements Athlete, Runner, Swimmer, Ciclist {

    public Triathlete(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void warmUp() {
        System.out.println(this.getName() + " is warming up...");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running...");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming...");
    }

    @Override
    public void pedal() {
        System.out.println(this.getName() + " is pedaling...");
    }
}
