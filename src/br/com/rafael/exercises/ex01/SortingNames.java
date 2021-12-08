package br.com.rafael.exercises.ex01;

import java.util.*;

public class SortingNames {
    public static void main(String[] args) {
        Name[] names = new Name[6];
        names[0] = new Name("Marcelo Vieira dos Santos");
        names[1] = new Name("Andrea Pereira de Andrade");
        names[2] = new Name("Pedro Ricardo Alves");
        names[3] = new Name("James Gosling");
        names[4] = new Name("Jair Messias Bolsonaro");
        names[5] = new Name("Bruno Fagner");
        Arrays.sort(names);
        for (Name name : names)
            System.out.println(name.getFullName());
        List<Name> listNames = new LinkedList<>(Arrays.asList(names));
        System.out.println(listNames); //toString() overridden.
//        Lists are fast when inserting elements but very slow when searching for them.
//        Prefer sets and maps when searching.
        Name mine = new Name("Sr. Captain America");
        Name wished = new Name("Sr. Captain America");
        System.out.println(mine.equals(wished));
        System.out.println(mine.hashCode() + "\t" + wished.hashCode());
        Set<Name> setOfNames = new HashSet<>();
        setOfNames.add(mine);
        setOfNames.add(wished); //Not inserted because is equal to mine. Method hashCode() was used there.
//        See that equals() and hashCode() "must walk on the same road".
        System.out.println(setOfNames.size());
    }
}
