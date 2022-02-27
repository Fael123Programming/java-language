package br.com.rafael.collections_framework.generics.upperboundedwildcards;

import br.com.rafael.collections_framework.generics.lowerboundedwildcards.LivingBeing;

public class Person extends LivingBeing {
    protected String name;

    public Person(String name) {
        super("Human being");
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
