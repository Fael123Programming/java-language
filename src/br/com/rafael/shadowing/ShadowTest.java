package br.com.rafael.shadowing;

public class ShadowTest {
    public int x;
    private String string;

    {
        x = 0;
        string = "string";
    }

    class FirstLevel {
        public int x;

        {
            x = 1;
        }

        void methodInFirstLevel(int x) {
            System.out.println("x=" + x);
            System.out.println("this.x=" + this.x);
            System.out.println("ShadowTest.this.x=" + ShadowTest.this.x);
            ShadowTest.this.string = "got changed";
            System.out.println("ShadowTest.this.string=" + ShadowTest.this.string);
//          Using ShadowTest.this.attribute_name we can access the attributes of the enclosing object even
//          if they are private!
        }
    }

    public static void main(String... args) {
        ShadowTest shadowObject = new ShadowTest();
        System.out.println(shadowObject.x + " " + shadowObject.string);
        ShadowTest.FirstLevel firstLevelObject = shadowObject.new FirstLevel();
        firstLevelObject.methodInFirstLevel(100);
    }
}
