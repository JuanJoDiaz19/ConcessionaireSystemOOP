package model;

import java.time.Year;
import java.util.Calendar;

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

        if (super.getDocuments().get(0).getYear() != Calendar.getInstance().get(Calendar.YEAR)) {
            
        }
        return 0;
    }
    @Override
    public double calculateBatteryConsumption() {
        double out;
        if (typeCharger == TypeCharger.FAST) {
            out = (batteryDuration+13)*(super.getCylinderCapacity()/100);
        } else if (typeCharger == TypeCharger.NORMAL) {
            out = (batteryDuration+18)*(super.getCylinderCapacity()/100);
        } else {
            out = 0;
        }
        return out;
    }

    @Override
    public String toString() {
        String out = "\n***** Electric car *****\n\n";
        out += super.toString();
        if (typeCharger == TypeCharger.NORMAL) {
            out += "\nType charger: Normal";
        } else if (typeCharger == TypeCharger.FAST) {
            out += "\nType charger Fast";
        }
        out+= "\nBattery duration: "+ batteryDuration;
        out += "\nBattery consumption (Kilowatts per km): "+ batteryConsumption;
        return out;
    }

}