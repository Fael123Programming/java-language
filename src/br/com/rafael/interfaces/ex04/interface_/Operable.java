package br.com.rafael.interfaces.ex04.interface_;

public interface Operable {
    public final static int i = 0; //public, final and static fields only!

    public abstract int turn (Direction d, double radius, double startSpeed, double endSpeed); //public and abstract methods only!
    //If not public and abstract, they must be either default or static.

    public abstract int changeLanes(Direction d, double startSpeed, double endSpeed);

    public abstract int signalTurn(Direction d, boolean signalOn);

    public abstract int getRadarFront(double distanceToCar, double speedOfCar);

    public abstract int getRadarRear(double distanceToCar, double speedOfCar);

    public default String name() {
        return "Operable object";
    }

    public static int getI(int add) {
        return i + add;
    }

    public enum Direction {
        LEFT, RIGHT, BACK, FRONT
    }
}
