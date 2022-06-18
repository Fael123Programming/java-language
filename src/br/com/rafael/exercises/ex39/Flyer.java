package br.com.rafael.exercises.ex39;

public interface Flyer {
    default String identifyMyself() {
        return "I'm able to fly";
    }
}
