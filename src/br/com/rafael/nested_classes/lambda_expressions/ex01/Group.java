package br.com.rafael.nested_classes.lambda_expressions.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Group {
    private final List<Person> roster;

    {
        roster = new ArrayList<>();
    }

    public Group(Person... people) {
        roster.addAll(Arrays.asList(people));
    }

    public List<Person> getList() {
        return roster;
    }

    public List<Person> listPeopleOlderThan(int age) {
        if (age < 0)
            throw new IllegalArgumentException("age must be non-negative");
        List<Person> people = new ArrayList<>();
        for (Person p : roster)
            if (p.getAge() > age)
                people.add(p);
        return people;
    }

    public List<Person> listPeopleWithinAnAgeRange(int low, int high) {
        if (low < 0 || high < 0 || low > high)
            throw new IllegalArgumentException("invalid range arguments");
        List<Person> matchedPeople = new ArrayList<>();
        int age;
        for (Person p : roster) {
            age = p.getAge();
            if (low <= age && age <= high)
                matchedPeople.add(p);
        }
        return matchedPeople;
    }

    public List<Person> listPeople(Criteria criteria) {
        if (criteria ==  null)
            throw new IllegalArgumentException("criteria cannot be null");
        List<Person> matchedPeople = new ArrayList<>();
        for (Person p : roster)
            if (criteria.check(p))
                matchedPeople.add(p);
        return matchedPeople;
    }

    public void processPeople(Predicate<Person> predicate, Consumer<String> consumer, Function<Person, String> function) {
//      Function receives a Person as argument for the method apply() and returns a String as result.
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(function);
        for (Person p : roster)
            if (predicate.test(p))
                consumer.accept(function.apply(p));
    }
}
