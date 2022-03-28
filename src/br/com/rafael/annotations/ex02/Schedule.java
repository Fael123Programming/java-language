package br.com.rafael.annotations.ex02;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Documented
@Repeatable(Schedule.Schedules.class)  //Schedules annotation works as a container to keep all schedules used.
@Target(ElementType.METHOD)
public @interface Schedule {
    int dayOfMonth() default 1;
    int dayOfWeek() default 1;
    int hour() default 12;

    @Documented
    @Target(ElementType.METHOD)
    @interface Schedules { //Container annotation type.
        Schedule[] value();
    }
}
