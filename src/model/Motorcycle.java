package model;

public class Motorcycle extends Vehicle implements CalculateGasolineConsumption {
    private double capacityOfTheTank;
    private double fuelConsumption;
    private TypeMotorcycle typeMotorcycle;


    public Motorcycle(double basePrice, String brand, String model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, double capacityOfTheTank, TypeMotorcycle typeMotorcycle) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate);    
        this.capacityOfTheTank = capacityOfTheTank;
        this.typeMotorcycle = typeMotorcycle;
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
        if (typeMotorcycle == TypeMotorcycle.STANDARD) {
            out+= "\nType of the vehicle: Standard";
        } else if (typeMotorcycle == TypeMotorcycle.SPORT) {
            out+= "\nType of the vehicle: Sport";
        } else if (typeMotorcycle == TypeMotorcycle.SCOOTER) {
            out+= "\nType of the vehicle: Scooter";
        } else if (typeMotorcycle == TypeMotorcycle.CROOSS) {
            out+= "\nType of the vehicle: Cross";
        }
        return out;
        
    }

    public double calculateGasolineConsumption() {
        return 0;
    }
    



}
