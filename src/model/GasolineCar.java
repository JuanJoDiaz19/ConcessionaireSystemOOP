package model;
//To generate javadoc: javadoc src/model/GasolineCAr.java -d doc/API/

/** Class of the gasoline car
 * @author JuanJoseDiaz
 * 
 * */
public class GasolineCar extends Car{
    /**Capacity of the tank of the gasoline car */
    private double capacityOfTheTank;
    /**Fuel consumption of the gasoline car */
    private double fuelConsumption;
    /**Type gasoline of the gasoline car */
    private TypeGasoline typeGasoline;

    /**
     * Constructor method of the gasoline car
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
     * @param capacityOfTheTank != null
     * @param typeGasoline != null
     */
    public GasolineCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, TypeCar typeCar, double capacityOfTheTank, TypeGasoline typeGasoline) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar);
        this.capacityOfTheTank = capacityOfTheTank;
        this.typeGasoline = typeGasoline;
        fuelConsumption = calculateGasolineConsumption();
    }
    /**
     * Method that calculates the sale price of the gasoline car
     * @return double with the sale price of the gasoline car 
     */
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
    /**
     * Method toString of the hybrid car
     * @return String with all the information of the gasoline car 
     */
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
    /**
     * Method that gets the type of the gasoline of the car
     * @return TypeGasoline of the gasoline car 
     */
    public TypeGasoline getTypeGasoline() {
        return typeGasoline;
    }
    /**
     * Method that calculates the gasoline consumption of the gasoline car 
     * @return double with the gasoline consumption of the hybrid car 
     */
    public double calculateGasolineConsumption() {
        return capacityOfTheTank*(super.getCylinderCapacity()/150);
    }


}
