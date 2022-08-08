package br.com.rafael.collections_framework.third_contact;

public class Country implements Comparable<Country> {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName == null || newName.isBlank()) {
            throw new IllegalArgumentException("Invalid country name: " + newName);
        }
        name = newName;
    }

    @Override
    public boolean equals(Object anotherObj) {
        if (!(anotherObj instanceof Country castedObj)) {
            return false;
        }
        return name.equals(castedObj.name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Country otherCountry) {
        return name.compareTo(otherCountry.name);
    }
}
