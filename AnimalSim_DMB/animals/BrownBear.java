package animals;

import exceptions.InvalidSubspeciesException;
import interfaces.Swimmable;
import interfaces.Walkable;

public class BrownBear extends Animal implements Walkable, Swimmable {
    private String subSpecies;

    public BrownBear() {
        super();
        this.subSpecies = "Alaskan";
    }

    public BrownBear(int simID, Location location, String subSpecies) {
        super(simID, location);
        if (!isValidSubSpecies(subSpecies)) {
            throw new InvalidSubspeciesException("Invalid subspecies");
        }
        this.subSpecies = subSpecies;
    }

    private boolean isValidSubSpecies(String subspecies) {
        // Check if the subspecies is valid
        return true;
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
    public void walk(int distance, Location location) {
        int[] coordinates = location.getCoordinates();
        int newX = coordinates[0] + distance;
        int newY = coordinates[1];
        location.update(newX, newY);
    }

    @Override
    public void swim(int distance, Location location) {
        int[] coordinates = location.getCoordinates();
        int newX = coordinates[0] + distance;
        int newY = coordinates[1];
        location.update(newX, newY);
    }

    

    @Override
    public String toString() {
        return "BrownBear " + super.toString() + " [subSpecies=" + subSpecies + "]";
    }
}

