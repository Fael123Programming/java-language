package br.com.rafael.exercises.ex40;

public interface Animal {
    default String identifyMyself() {
        return "I am an animal";
    }
}
