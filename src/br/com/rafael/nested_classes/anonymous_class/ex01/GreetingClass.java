package br.com.rafael.nested_classes.anonymous_class.ex01;

//Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at
//the same time. They are like local classes except that they do not have a name. Use them if you need to use a local
//class only once. Anonymous classes are expressions, which means that you define the class in another expression.
//The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class
//definition contained in a block of code.
//Anonymous classes are ideal for implementing an interface that contains two or more methods.

public class GreetingClass {
    public static final int ENGLISH = 1, PORTUGUESE = 2, FRENCH = 3, SPANISH = 4;

    interface SayHelloI {
        void sayHello();
    }

    public static void greet(int language) {
        SayHelloI greetingSayer;
        switch(language) {
            case ENGLISH -> {
                class EnglishHello implements SayHelloI { //Local class!
                    @Override
                    public void sayHello() {
                        System.out.println("Hello, how are you?");
                    }
                }
                greetingSayer = new EnglishHello();
            }
            case PORTUGUESE -> {
                greetingSayer = new SayHelloI() { //Anonymous class!
                    @Override
                    public void sayHello() {
                        System.out.println("Olá, como você está?");
                    }
                };
            }
            case FRENCH -> {
                greetingSayer = new SayHelloI() {
                    @Override
                    public void sayHello() {
                        System.out.println("Bonjour, comment ça va?");
                    }
                };
            }
            case SPANISH -> {
                greetingSayer = new SayHelloI() {
                    @Override
                    public void sayHello() {
                        System.out.println("¿Buenos días qué tal?");
                    }
                };
            }
            default -> throw new IllegalArgumentException("Unrecognized language");
        }
        greetingSayer.sayHello();
    }

    public static void main(String[] args) {
        greet(ENGLISH);
        greet(PORTUGUESE);
        greet(FRENCH);
        greet(SPANISH);
        try {
            greet(10);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
