package br.com.rafael.exercises.ex39;

public interface Mythical {
    default String identifyMyself() {
        return "I'm a mythical creature";
    }
}
