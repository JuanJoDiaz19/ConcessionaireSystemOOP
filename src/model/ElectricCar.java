package model;


public class ElectricCar extends Car implements CalculateBatteryConsumption {
    /**Battery duration of the Electric car */
    private double batteryDuration;
    /**Battery consumption of the electric car*/
    private double batteryConsumption;
    /**Type of the charger of the electric car */
    private TypeCharger typeCharger;

    /**
     * Constructor method of the class ElectricCar
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
     * @param batteryDuration != null
     * @param typeCharger != null
     */
    public ElectricCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar,double batteryDuration, TypeCharger typeCharger) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar);
        this.batteryDuration = batteryDuration;
        this.typeCharger = typeCharger;
        batteryConsumption = calculateBatteryConsumption();
    }
    /**Method that calculates the sale price of an electric car 
     * @return double sale price of the electric car
     */
    @Override
    public double calculateSalePrice() {
        double price= super.getBasePrice() * 1.20;
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.1;
        }
        if (super.getSOAT() == null ||super.getSOAT().getYear() < 2022 ||super.getTechnicalMechanicalRevision() == null ||super.getTechnicalMechanicalRevision().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }
    /**Method that calculates the battery consumption of the Electric car
     * @return double with the battery consumption of the electric car
     */
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
    /**
     * Method toString of the class electric car
     * @return String with all the information of the class 
     */
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
        out += "\n";
        return out;
    }

}
