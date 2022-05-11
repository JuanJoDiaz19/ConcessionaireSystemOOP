package model;

public abstract class Car extends Vehicle {
    private int numberOfDoors;
    private boolean polarizedWindows;
    private TypeCar typeCar;

    
    public Car(double basePrice, String brand, int model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate);
        this.numberOfDoors = numberOfDoors;
        this.polarizedWindows = polarizedWindows;
        this.typeCar = typeCar;
    }
    @Override
    public String toString() {
        String out = "";
        out += super.toString();
        out += "\nNumber of doors: " + numberOfDoors;
        if (polarizedWindows) {
            out += "\nPolarized windows: True";
        } else {
            out += "\nPolarized windows: False";
        }
        if (typeCar == TypeCar.SEDAN) {
            out += "\nType car: Sedan"; 
        } else if (typeCar == TypeCar.PICKUP_TRUCK) {
            out += "\nType car: Pickup truck";
        }
        return out;
    }

    
}
