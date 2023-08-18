package animals;

import exceptions.InvalidCoordinateException;

public class Location {
    private int xCoord;
    private int yCoord;

    public Location() {
        this.xCoord = 0;
        this.yCoord = 0;
    }

    public Location(int x, int y) {
        if (x < 0 || y < 0) {
            throw new InvalidCoordinateException("Invalid coordinates");
        }
        this.xCoord = x;
        this.yCoord = y;
    }

    public void update(int x, int y) {
        if (x < 0 || y < 0) {
            throw new InvalidCoordinateException("Invalid coordinates");
        }
        this.xCoord = x;
        this.yCoord = y;
    }

    public int[] getCoordinates() {
        return new int[]{xCoord, yCoord};
    }
    
    @Override
    public String toString() {
        return "(" + xCoord + ", " + yCoord + ")";
    }
}

