package br.com.rafael.nested_classes.lambda_expressions.ex07;

import java.util.function.Consumer;

public class TestLambdaScope {
    public int x;

    public TestLambdaScope(int x) {
        this.x = x;
    }

    class FirstLevel {
        public int x;

        public FirstLevel(int x) {
            this.x = x;
        }

        void methodInFirstLevel(int x) {
            int z = 2;
            Consumer<Integer> consumer = y -> {
//             Lambda expressions do not create a new scope but use the enclosing one as theirs.
//             int z = 10; -> This causes a compile-time error because z is already defined in the scope.
                System.out.println("x=" + x);
                System.out.println("y=" + y);
                System.out.println("z=" + z);
                System.out.println("this.x=" + this.x);
                System.out.println("TestLambdaScope.this.x=" + TestLambdaScope.this.x);
            };
            consumer.accept(x);
        }
    }

    public static void main(String[] args) {
        TestLambdaScope tester = new TestLambdaScope(7);
        FirstLevel fl = tester.new FirstLevel(9);
        fl.methodInFirstLevel(25);
    }
}
