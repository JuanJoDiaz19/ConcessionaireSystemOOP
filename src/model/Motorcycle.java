package model;
//To generate javadoc: javadoc src/model/Motorcycle.java -d doc/API/

/** Class of the motorcycle
 * @author JuanJoseDiaz
 * 
 * */
public class Motorcycle extends Vehicle implements CalculateGasolineConsumption {
    /**Capacity of the tank of the motorcycle*/
    private double capacityOfTheTank;
    /**Fuel consumption of the motorcycle*/
    private double fuelConsumption;
    /**Type of the motorcyle (STANDARD, SPORT, SCOOTER, CROOSS) */
    private TypeMotorcycle typeMotorcycle;
    /**
     * Constructor method of the class Motorcycle
     * @param basePrice != null
     * @param brand != null
     * @param model != null
     * @param cylinderCapacity != null
     * @param mileage != null
     * @param typeVehicle != null
     * @param licensePlate != null
     * @param capacityOfTheTank != null
     * @param typeMotorcycle != null
     */
    public Motorcycle(double basePrice, String brand, int model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate, double capacityOfTheTank, TypeMotorcycle typeMotorcycle) {
        super(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate);    
        this.capacityOfTheTank = capacityOfTheTank;
        this.typeMotorcycle = typeMotorcycle;
        fuelConsumption = calculateGasolineConsumption();
    }
    
    /**Method to String of the class motorcycle
     * @return String with all the information of the class Motorcycle
     */
    @Override
    public String toString() {
        String out = "\n***** Motorcycle *****\n\n"; 
        out+= super.toString();
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
        out += "\n";
        return out;
        
    }
    /**Method to calculate the sale price of the motorcycle 
     * @return double with the sale price of the motorcyle
     */
    @Override
    public double calculateSalePrice() {
        double price= super.getBasePrice() * 1.04;
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price -= super.getBasePrice()*0.02;
        }   
        if (super.getSOAT() == null ||super.getSOAT().getYear() < 2022 ||super.getTechnicalMechanicalRevision() == null ||super.getTechnicalMechanicalRevision().getYear() < 2022 ) {
            price += 500000;            
        }
        return price;
    }
    /**Method to calculate the gasoline consumption of the motorcycle 
     * @return double with the gasoline consumption of the motorcycle
    */
    @Override
    public double calculateGasolineConsumption() {
        return capacityOfTheTank * (super.getCylinderCapacity()/75);
    }
    



}
