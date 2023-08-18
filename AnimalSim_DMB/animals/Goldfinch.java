package animals;

import exceptions.InvalidWingspanException;
import interfaces.Flyable;
import interfaces.Walkable;

public class Goldfinch extends Animal implements Flyable, Walkable {
    private double wingSpan;

    public Goldfinch() {
        super();
        this.wingSpan = 9.0;
    }

    public Goldfinch(int simID, Location location, double wingSpan) {
        super(simID, location);
        if (wingSpan < 5.0 || wingSpan > 11.0) {
            throw new InvalidWingspanException("Invalid wingspan");
        }
        this.wingSpan = wingSpan;
    }

    @Override
    public void eat() {
        // Implement eat method
    }

    @Override
    public void sleep() {
        // Implement sleep method
    }

    @Override
    public void fly(Location location) {
        this.setLocation(location);
    }

    @Override
    public void walk(int distance, Location location) {
        int[] coordinates = location.getCoordinates();
        int newX = coordinates[0] + distance;
        int newY = coordinates[1];
        location.update(newX, newY);
    }

    

    @Override
    public String toString() {
        return "Goldfinch " + super.toString() + " [wingSpan=" + wingSpan + "]";
    }
}

