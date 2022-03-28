package br.com.rafael.interfaces.ex06;

import java.util.Objects;

public class Point {
    private double x, y;

    public static final Point ORIGIN;

    static {
        ORIGIN = new Point(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof Point casted))
            return false;
        if (this == another)
            return true;
        return x == casted.x && y == casted.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
