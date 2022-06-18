package br.com.rafael.exercises.ex38;

import java.util.Objects;

public class Bicycle {
    private int cadence, gear, speed;

    public Bicycle(int startCadence, int startGear, int startSpeed) {
        setCadence(startCadence);
        setGear(startGear);
        speedUp(startSpeed);
    }

    public void setCadence(int newCadence) {
        if (newCadence <= 0) {
            throw new IllegalArgumentException("cadence must be > 0");
        }
        cadence = newCadence;
    }

    public void setGear(int newGear) {
        if (newGear <= 0) {
            throw new IllegalArgumentException("gear must be > 0");
        }
        gear = newGear;
    }

    public void applyBreak(int decrement) {
        if (decrement <= 0) {
            throw new IllegalArgumentException("decrement must be > 0");
        }
        if (speed - decrement <= 0) {
            speed = 0;
        } else {
            speed -= decrement;
        }
    }

    public void speedUp(int increment) {
        if (increment <= 0) {
            throw new IllegalArgumentException("increment must be > 0");
        }
        speed += increment;
    }

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadence, gear, speed);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bicycle castedObj)) {
            return false;
        }
        return castedObj.cadence == cadence && castedObj.speed == speed && castedObj.gear == gear;
    }

    @Override
    public String toString() {
        return String.format("{cadence: %d, gear: %d, speed: %d}", cadence, gear, speed);
    }
}
