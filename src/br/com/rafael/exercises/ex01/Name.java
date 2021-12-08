package br.com.rafael.exercises.ex01;

import java.util.*;

public class Name implements Comparable<Name> {
    private final List<String> compositeName;

    {
        compositeName = new ArrayList<>();
    }

    public Name(String fullName) {
        String[] names = fullName.split(" ");
        compositeName.addAll(Arrays.asList(names));
    }

    public String getFullName(){
        StringBuilder fullName = new StringBuilder();
        compositeName.forEach(name -> fullName.append(name).append(" "));
        return fullName.toString().trim();
    }

    @Override
    public int compareTo(Name anotherName) {
        return this.getFullName().compareTo(anotherName.getFullName());
    }

    @Override
    public String toString(){
        return getFullName();
    }

    @Override
    public boolean equals(Object anotherName) {
        if(!(anotherName instanceof Name castedName))
            return false;
        return this.compareTo(castedName) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName());
    }
}
