package br.com.rafael.collections_framework.firstcontact.generics.upperboundedwildcards;

import br.com.rafael.collections_framework.firstcontact.generics.lowerboundedwildcards.LivingBeing;

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
