package br.com.rafael.annotations.ex04;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Documented
//@Repeatable(Meal.Meals.class)
@Target(ElementType.METHOD)
public @interface Meal {
    String meal() default ""; //Breakfast, lunch, dinner and so on.
    String mainDish() default "";

//    @Documented
//    @Target(ElementType.METHOD)
//    @interface Meals {
//        Meal[] value();
//    }
}
