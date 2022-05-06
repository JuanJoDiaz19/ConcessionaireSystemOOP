package model;

public class GasolineCar extends Car{
    private double capacityOfTheTank;
    private double fuelConsumption;
    private TypeGasoline typeGasoline;


    public GasolineCar(double basePrice, String brand, String model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar, double capacityOfTheTank, TypeGasoline typeGasoline) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar);
        this.capacityOfTheTank = capacityOfTheTank;
        this.typeGasoline = typeGasoline;
        fuelConsumption = calculateGasolineConsumption();
    }
    
    @Override
    public double calculateSalePrice() {
        return 0;
    }

    @Override
    public String toString() {
        String out = "";
        out += "\nCapacity of the tank (gasoline): " + capacityOfTheTank+ "\nFuel consumption: "+ fuelConsumption;
        if (typeGasoline == TypeGasoline.EXTRA) {
            out += "\nType gasoline: Extra";
        } else if (typeGasoline == TypeGasoline.REGULAR) {
            out += "\nType gasoline Regular";
        } else if (typeGasoline == TypeGasoline.DIESEL) {
            out += "\nType gasoline: Diesel ";
        }
        return out;

    }

    public double calculateGasolineConsumption() {
        return 0;
    }


}
