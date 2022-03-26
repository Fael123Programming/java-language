package br.com.rafael.collections_framework.firstcontact.generics.lowerboundedwildcards;

public class LivingBeing {
    private String species;

    public LivingBeing(String species) {
        this.species = species;
    }

    public LivingBeing() {}

    @Override
    public String toString() {
        return "a/an " + this.species;
    }
}
