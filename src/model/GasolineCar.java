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
        double price= super.getBasePrice();
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.1;
        }
        if (super.getSOAT() == null || super.getSOAT().getYear() < 2022 || super.getTechnicalMechanicalRevision() == null || super.getTechnicalMechanicalRevision().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }

    @Override
    public String toString() {
        String out = "\n***** Gasoline car *****\n\n";
        out+= super.toString();
        out += "\nCapacity of the tank (gasoline): " + capacityOfTheTank+ "\nFuel consumption: "+ fuelConsumption;
        if (typeGasoline == TypeGasoline.EXTRA) {
            out += "\nType gasoline: Extra";
        } else if (typeGasoline == TypeGasoline.REGULAR) {
            out += "\nType gasoline Regular";
        } else if (typeGasoline == TypeGasoline.DIESEL) {
            out += "\nType gasoline: Diesel ";
        }
        out += "\n";
        return out;

    }
    
    public TypeGasoline getTypeGasoline() {
        return typeGasoline;
    }

    public double calculateGasolineConsumption() {
        return capacityOfTheTank*(super.getCylinderCapacity()/150);
    }


}
