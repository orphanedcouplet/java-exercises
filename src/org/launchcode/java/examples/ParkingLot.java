package org.launchcode.java.examples;

public class ParkingLot {

    private Car[] lot;

    public ParkingLot(int spaces) {
        lot = new Car[spaces];
    }

    public Car get(int spaceNumber) {
        return lot[spaceNumber];
    }

    public boolean park(int spaceN, Car car) {
        if (lot[spaceN] != null) {
            return false;
        }
        lot [spaceN] = car;
        return true;
    }

    public boolean spaceFull(int spaceN) {
        return lot[spaceN] != null;
    }

}
