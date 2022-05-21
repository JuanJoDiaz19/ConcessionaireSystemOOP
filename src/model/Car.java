package model;

public abstract class Car extends Vehicle {
    /**Number of doors of the car */
    private int numberOfDoors;
    /**Type of windows a car has  (TRUE - Polarized/ FALSE - Not polarized) */
    private boolean polarizedWindows;
    /**Type of the car (SEDAN/ PICK_UP_TRUCK) */
    private TypeCar typeCar;
    /**
     * Constructor method of the class Car
     * @param basePrice != null
     * @param brand != null
     * @param model != null
     * @param cylinderCapacity != null
     * @param mileage != null
     * @param typeVehicle != null
     * @param licensePlate != null
     * @param numberOfDoors != null
     * @param polarizedWindows != null
     * @param typeCar != null
     */
    public Car(double basePrice, String brand, int model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate);
        this.numberOfDoors = numberOfDoors;
        this.polarizedWindows = polarizedWindows;
        this.typeCar = typeCar;
    }
    /**Method to String of the class
     * @return String with all the information of the class
     */
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
