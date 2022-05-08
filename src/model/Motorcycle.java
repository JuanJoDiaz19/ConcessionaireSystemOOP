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
    @Override
    public double calculateSalePrice() {
        double price= super.getBasePrice() * 1.04;
        if (super.getTypeVehicle() == TypeVehicle.USED) {
            price = super.getBasePrice()*0.98;
        }   
        if (super.getSOAT() == null ||super.getSOAT().getYear() < 2022 ||super.getTechnicalMechanicalRevision() == null ||super.getTechnicalMechanicalRevision().getYear() < 2022 ) {
            price += 500000;            
        }
        
        return price;
    }
    @Override
    public double calculateGasolineConsumption() {
        return capacityOfTheTank * (super.getCylinderCapacity()/150);
    }
    



}
