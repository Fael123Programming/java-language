package br.com.rafael.nested_classes.anonymous_class.ex02;

public class Main {
    public static void main(String[] args) {
        AbstractClass ac = new AbstractClass(100, 200, 300) {
            private int sum;

            @Override
            public void printVars() {
                System.out.println("a=" + super.getA());
                System.out.println("b=" + super.getB());
                System.out.println("c=" + super.getC());
                this.calculateSum();
                System.out.println("sum=" + this.sum);
            }

            private void calculateSum() {
                sum = super.getA() + super.getB() + super.getC();
            }
        };
        ac.printVars();
    }
}
