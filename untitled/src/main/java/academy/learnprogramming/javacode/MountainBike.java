package academy.learnprogramming.javacode;

public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(final int seatHeight, final int cadence, final int speed, final int gear) {
        super(cadence, speed, gear);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

}
