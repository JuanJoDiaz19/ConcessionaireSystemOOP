package model;
//To generate javadoc: javadoc src/model/HybridCar.java -d doc/API/

/** Class of the Hybrid car 
 * @author JuanJoseDiaz
 * 
 * */
public class HybridCar extends Car implements CalculateBatteryConsumption, CalculateGasolineConsumption{
    /**Capacity of the tank of the Hybrid car */
    private double capacityOfTheTank;
    /**Fuel consumption of the hybrid car */
    private double fuelConsumption;
    /**Batery curation of the hybrid car */
    private double batteryDuration;
    /**Battery consumption of the hybrid car */
    private double batteryConsumption;
    /**Type of charger of the hybrid car (NORMAL, FAST) */
    private TypeCharger typeCharger;
    /**Type of gasoline of the hybrid car (EXTRA, REGULAR, DIESEL) */
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
    /**
     * Method that calculates the sale price of the hybrid car
     * @return double the sale price of the hybird car
     */
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
    /**
     * Method toString of the hybird car 
     * @return String with all the information of the hybrid car
     */
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
    /**
     * Method that get the type of the gasoline 
     * @return TypeGasoline of the hybrid car
     */
    public TypeGasoline getTypeGasoline() {
        return typeGasoline;
    }
    
    /**
     * Method that calculates the battery consumption of the hybrid car 
     * @return double with the battery consumption of the hybrid car 
     */
    @Override
    public double calculateBatteryConsumption() {
        double out = 0;
        if (typeCharger == TypeCharger.FAST) {
            out = batteryDuration * (super.getCylinderCapacity()/200);  
        } else if (typeCharger == TypeCharger.NORMAL) {
            out = (batteryDuration+7) * (super.getCylinderCapacity()/200);
        }
        return out;
    }
    /**
     * Method that calculates the gasoline consumption of the hybrid car 
     * @return double with the gasoline consumption of the hybrid car 
     */
    @Override
    public double calculateGasolineConsumption() {
        return capacityOfTheTank *(super.getCylinderCapacity()/180);
    }


}
