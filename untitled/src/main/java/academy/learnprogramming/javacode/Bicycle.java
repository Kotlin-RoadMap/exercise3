package academy.learnprogramming.javacode;

public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(final int cadence, final int speed, final int gear) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(final int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(final int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public void applyBrake(final int decrement) {
        speed -= decrement;
    }

    public void speedUp(final int increment) {
        speed += increment;
    }

    public void printDescription() {
        System.out.println("Bike is in gear " + gear +
                " with a cadence of " + cadence +
                " travelling at a speed of " + speed + ".");
    }
}
