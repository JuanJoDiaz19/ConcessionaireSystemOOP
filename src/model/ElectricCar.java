package model;

public class ElectricCar extends Car implements CalculateBatteryConsumption {
    private double batteryDuration;
    private double batteryConsumption;
    private TypeCharger typeCharger;

    public ElectricCar(double basePrice, String brand, String model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar,double batteryDuration, TypeCharger typeCharger) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar);
        this.batteryDuration = batteryDuration;
        this.typeCharger = typeCharger;
        batteryConsumption = calculateBatteryConsumption();
    }

    @Override
    public double calculateSalePrice() {
        return 0;
    }

    public double calculateBatteryConsumption() {
        return 0;
    }

    @Override
    public String toString() {
        String out = "\n";
        out += super.toString();
        if (typeCharger == TypeCharger.NORMAL) {
            out += "Type charger: Normal";
        } else if (typeCharger == TypeCharger.FAST) {
            out += "Type charger Fast";
        }
        out+= "Battery duration: "+ batteryDuration;
        out += "Battery consumption (Kilowatts per km): "+ batteryConsumption;
        return out;
    }

}
