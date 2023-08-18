
import java.util.ArrayList;

import animals.Location;
import exceptions.InvalidCoordinateException;
import exceptions.InvalidSimIDException;
import exceptions.InvalidSubspeciesException;
import exceptions.InvalidWingspanException;
import animals.*;

public class Application {
    public static void main(String[] args) {
        // Location Tests
        testLocation();

        // Animal Tests
        testAnimal();

        // Goldfinch Tests
        testGoldfinch();

        // BrownBear Tests
        testBrownBear();

        // Generics Tests
        testGenerics();
    }

    private static void testLocation() {
        System.out.println("*********************************************\n      Location Tests\n*********************************************");
        try {
            // Test cases for Location
            Location location1 = new Location(10, 20);
            Location location2 = new Location();
            location2.update(5, 15);
            int[] coordinates = location2.getCoordinates();
            System.out.println("Location tests passed.");
        } catch (InvalidCoordinateException e) {
            System.out.println("InvalidCoordinateException: " + e.getMessage());
        }
    }

    private static void testAnimal() {
        System.out.println("*********************************************\n    Animal Tests\n*********************************************");
        try {
            // Test cases for Animal and its subclasses
            Location animalLocation = new Location(30, 40);
            Animal animal1 = new Goldfinch(1, animalLocation, 6.0);
            Animal animal2 = new BrownBear(2, animalLocation, "Alaskan");

            animal1.eat();
            animal2.sleep();
            System.out.println("Animal tests passed.");
        } catch (InvalidSimIDException | InvalidSubspeciesException | InvalidWingspanException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void testGoldfinch() {
        System.out.println("*********************************************\n      Goldfinch Tests\n*********************************************");
        try {
            // Test cases for Goldfinch
            Location goldfinchLocation = new Location(50, 60);
            Goldfinch goldfinch = new Goldfinch(3, goldfinchLocation, 7.5);

            goldfinch.eat();
            goldfinch.fly(goldfinchLocation);
            goldfinch.walk(1, goldfinchLocation);

            System.out.println(goldfinch.toString());
            System.out.println("Goldfinch tests passed.");
        } catch (InvalidSimIDException | InvalidWingspanException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void testBrownBear() {
        System.out.println("*********************************************\n       BrownBear Tests\n*********************************************");
        try {
            // Test cases for BrownBear
            Location bearLocation = new Location(70, 80);
            BrownBear brownBear = new BrownBear(4, bearLocation, "Grizzly");

            brownBear.eat();
            brownBear.walk(2, bearLocation);
            brownBear.swim(3, bearLocation);

            System.out.println(brownBear.toString());
            System.out.println("BrownBear tests passed.");
        } catch (InvalidSimIDException | InvalidSubspeciesException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void testGenerics() {
        System.out.println("*********************************************\n       Generics Tests\n*********************************************");
        try {
            ArrayList<Animal> animals = new ArrayList<>();
            Location location = new Location(90, 100);
            animals.add(new Goldfinch(5, location, 7.0));
            animals.add(new BrownBear(6, location, "Kodiak"));

            for (Animal animal : animals) {
                System.out.println(animal.toString());
            }
            System.out.println("Generics tests passed.");
        } catch (InvalidSimIDException | InvalidSubspeciesException | InvalidWingspanException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
