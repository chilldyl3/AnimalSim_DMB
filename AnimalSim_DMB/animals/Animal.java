package animals;

import exceptions.InvalidSimIDException;

public abstract class Animal {
    private int simID;
    private Location location;
    private boolean full;
    private boolean rested;

    public Animal() {
        this.simID = 0;
        this.setLocation(new Location());
        this.full = false;
        this.rested = true;
    }

    public Animal(int simID, Location location) {
        if (simID <= 0) {
            throw new InvalidSimIDException("Invalid sim ID");
        }
        this.simID = simID;
        this.setLocation(location);
        this.full = false;
        this.rested = true;
    }

    public abstract void eat();

    public abstract void sleep();

    // Other getters and setters

    @Override
    public String toString() {
    	return "Animal [simID=" + simID + ", location=" + getLocation() + ", full=" + full + ", rested=" + rested + "]";
    }

	public void walk(int distance, Location location) {
		// TODO Auto-generated method stub
		
	}

	public void swim(int distance, Location location) {
		// TODO Auto-generated method stub
		
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}

