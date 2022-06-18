package br.com.rafael.exercises.ex40;

public interface EggLayer extends Animal {
    default String identifyMyself() {
        //Overriding identifyMyself() from Animal for not causing conflicts.
        return "I am able to lay eggs";
    }
}
