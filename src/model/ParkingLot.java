package model;

public class ParkingLot {
    private int row = 10;
    private int column = 5;
    private Vehicle[][] parking;


    public ParkingLot() {
        parking = new Vehicle[row][column];
    }

}
