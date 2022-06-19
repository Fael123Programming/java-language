package br.com.rafael.exercises.ex44;

public class Circle extends GraphicObject {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be greater than zero");
        }
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw this circle");
    }

    @Override
    public void resize() {
        System.out.println("Resize this circle");
    }
}
