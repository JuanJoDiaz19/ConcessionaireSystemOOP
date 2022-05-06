package model;

public class HybridCar extends Car implements CalculateBatteryConsumption, CalculateGasolineConsumption{

    private double capacityOfTheTank;
    private double fuelConsumption;
    private double batteryDuration;
    private double batteryConsumption;
    private TypeCharger typeCharger;
    private TypeGasoline typeGasoline;


    public HybridCar(double basePrice, String brand, String model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar, double capacityOfTheTank,  double batteryDuration, TypeCharger typeCharger, TypeGasoline typeGasoline) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar);
        this.capacityOfTheTank = capacityOfTheTank;
        this.batteryDuration = batteryDuration;
        this.typeCharger = typeCharger;
        this.typeGasoline = typeGasoline;
        batteryConsumption = calculateBatteryConsumption();
        fuelConsumption = calculateGasolineConsumption();
    }

    @Override
    public double calculateSalePrice() {
        return 0;
    }

    @Override
    public String toString() {
        String out = "";
        out += super.toString();
        out += "\nCapacity of the tank (gasoline): " + capacityOfTheTank+ "\nFuel consumption: "+ fuelConsumption + "\nBattery duration : " +
                batteryDuration + "\nBattery consumption: "+ batteryConsumption ;
        if (typeCharger == TypeCharger.NORMAL) {
            out += "\nType charger: Normal";
        } else if (typeCharger == TypeCharger.FAST) {
            out += "\nType charger Fast";
        }
        if (typeGasoline == TypeGasoline.EXTRA) {
            out += "\nType gasoline: Extra";
        } else if (typeGasoline == TypeGasoline.REGULAR) {
            out += "\nType gasoline Regular";
        } else if (typeGasoline == TypeGasoline.DIESEL) {
            out += "\nType gasoline: Diesel ";
        }
        return out;
    }

    public double calculateBatteryConsumption() {
        return 0;
    }

    public double calculateGasolineConsumption() {
        return 0;
    }


}
