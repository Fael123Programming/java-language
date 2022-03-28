package br.com.rafael.annotations.ex01;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented  //Meta-annotation
@Target({ElementType.PARAMETER, ElementType.FIELD})  //Meta-annotation

public @interface NonNull {
    boolean nonNull() default true;
}
