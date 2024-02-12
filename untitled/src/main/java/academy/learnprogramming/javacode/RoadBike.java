package academy.learnprogramming.javacode;

public class RoadBike extends Bicycle {

    private int tireWidth;

    public RoadBike(final int cadence, final int speed, final int gear, final int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }
}
