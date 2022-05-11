package model;

public class HybridCar extends Car implements CalculateBatteryConsumption, CalculateGasolineConsumption{

    private double capacityOfTheTank;
    private double fuelConsumption;
    private double batteryDuration;
    private double batteryConsumption;
    private TypeCharger typeCharger;
    private TypeGasoline typeGasoline;


    public HybridCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar, double capacityOfTheTank,  double batteryDuration, TypeCharger typeCharger, TypeGasoline typeGasoline) {
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
        double price= super.getBasePrice() * 1.15;
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.1;
        }
        
        if (super.getSOAT() == null ||super.getSOAT().getYear() < 2022 ||super.getTechnicalMechanicalRevision() == null ||super.getTechnicalMechanicalRevision().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }

    @Override
    public String toString() {
        String out = "\n***** Hybrid car *****\n\n";
        out += super.toString();
        out += "\nCapacity of the tank (gasoline): " + capacityOfTheTank+ "\nFuel consumption: "+ fuelConsumption + "\nBattery duration : " +
                batteryDuration + "\nBattery consumption: "+ batteryConsumption ;
        if (typeCharger == TypeCharger.NORMAL) {
            out += "\nType charger: Normal";
        } else if (typeCharger == TypeCharger.FAST) {
            out += "\nType charger: Fast";
        }
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
    
    public double calculateBatteryConsumption() {
        double out = 0;
        if (typeCharger == TypeCharger.FAST) {
            out = batteryDuration * (super.getCylinderCapacity()/200);  
        } else if (typeCharger == TypeCharger.NORMAL) {
            out = (batteryDuration+7) * (super.getCylinderCapacity()/200);
        }
        return out;
    }

    public double calculateGasolineConsumption() {
        return capacityOfTheTank *(super.getCylinderCapacity()/180);
    }


}
