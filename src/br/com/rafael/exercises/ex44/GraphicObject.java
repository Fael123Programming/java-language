package br.com.rafael.exercises.ex44;

import java.util.Objects;

public abstract class GraphicObject {
    private final Point location;

    public GraphicObject(int x, int y) {
        this.location = new Point(x, y);
    }

    public Point getLocation() {
        return location;
    }

    public void moveTo(int x, int y) {
        this.location.setX(x);
        this.location.setY(y);
    }

    public abstract void draw();

    public abstract void resize();

    public static class Point {
        private int x, y;

        public Point(int x, int y) {
            setX(x);
            setY(y);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public final void setX(int x) {
            if (x < 0) {
                throw new IllegalArgumentException("x coordinate must be non-negative");
            }
            this.x = x;
        }

        public final void setY(int y) {
            if (y < 0) {
                throw new IllegalArgumentException("y coordinate must be non-negative");
            }
            this.y = y;
        }

        @Override
        public boolean equals(Object anotherObject) {
            if (!(anotherObject instanceof Point anotherObjectCasted)) {
                return false;
            }
            return x == anotherObjectCasted.x && y == anotherObjectCasted.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", x, y);
        }
    }
}
