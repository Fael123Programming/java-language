package br.com.rafael.annotations.ex04;

public class Diet {
//    @Meal("breakfast", mainDish = "cereal") would not work. You must pass which field to assign to.
    @Meal(meal = "breakfast", mainDish = "cereal")
//    @Meal(meal = "lunch", mainDish = "pizza") -> Meal must be repeatable to be used more than once!
//    @Meal(meal = "dinner", mainDish = "salad")
    public void evaluateDiet() {}
}
