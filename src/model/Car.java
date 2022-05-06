package model;

public abstract class Car extends Vehicle {
    private int numberOfDoors;
    private boolean polarizedWindows;
    private TypeCar typeCar;

    
    public Car(double basePrice, String brand, String model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar) {
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
            out += "Polarized windows: True";
        } else {
            out += "Polarized windows: False";
        }
        if (typeCar == TypeCar.SEDAN) {
            out += "Type car: Sedan"; 
        } else if (typeCar == TypeCar.PICKUP_TRUCK) {
            out += "Type car: Pickup truck";
        }
        return out;
    }

    
}
