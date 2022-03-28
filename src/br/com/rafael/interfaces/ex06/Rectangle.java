package br.com.rafael.interfaces.ex06;

import java.util.Objects;

public class Rectangle implements Relatable {
    private final double width, height;
    private final Point point;

    public Rectangle(Point point, double width, double height) {
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        point = Point.ORIGIN; //(0, 0)
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Point getPoint() {
        return point;
    }

    public double getArea() {
        return width * height;
    }

    public void move(int x, int y) {
        point.move(x, y);
    }

    @Override
    public int isLargerThan(Relatable relatable) throws IllegalArgumentException {
//        Type casting tells the compiler what the object really is.
//        Widening (upward on the class hierarchy) and narrowing (downward on the class hierarchy)!
        if (!(relatable instanceof Rectangle castedRelatable)) //<-- This is called a pattern variable.
            throw new IllegalArgumentException("relatable must be an instance of Rectangle");
        double thisArea = this.getArea(), castedRelatableArea = castedRelatable.getArea();
//        int result;
//        if (thisArea > castedRelatableArea)
//            result = 1;
//        else if (castedRelatableArea > thisArea)
//            result = -1;
//        else
//            result = 0;
//        return result;
        return Double.compare(thisArea, castedRelatableArea);
    }

    @Override
    public String toString() {
        return "width=" + width + ", height=" + height + " at " + point;
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof Rectangle casted))
            return false;
        if (this == another)
            return true;
        return width == casted.width && height == casted.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
