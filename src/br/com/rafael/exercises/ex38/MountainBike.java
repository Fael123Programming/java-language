package br.com.rafael.exercises.ex38;

public class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int startCadence, int startGear, int startSpeed, int startSeatHeight) {
        super(startCadence, startGear, startSpeed);
        setSeatHeight(startSeatHeight);
    }

    public void setSeatHeight(int newSeatHeight) {
        if (newSeatHeight <= 0) {
            throw new IllegalArgumentException("seat height must be > 0");
        }
        seatHeight = newSeatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }
}
