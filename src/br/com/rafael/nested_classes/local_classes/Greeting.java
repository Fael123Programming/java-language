package br.com.rafael.nested_classes.local_classes;

public class Greeting {
    public void sayGoodByeInEnglish() {
        class EnglishGoodBye {
            public static void sayGoodBye() {
                System.out.println("Au revoir");
            }
        }
        EnglishGoodBye.sayGoodBye();
    }

    public static void main(String[] args) {
        new Greeting().sayGoodByeInEnglish();
    }
}
