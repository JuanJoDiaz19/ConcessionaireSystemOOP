package model;
import java.util.ArrayList;

public class Concessionare {
    private ArrayList<Vehicle> vehicles;
    private ParkingLot parkingLot;

    public Concessionare() {
        vehicles = new ArrayList<Vehicle>();
        parkingLot = new ParkingLot();
    }

    /**This is the method for adding an electric car  */
    public int addVehicle(double basePrice, String brand, String model, double cylinderCapacity, double mileage, int optionTypeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, int optionTypeCar, int optionTypeCharger, double batteryDuration) {
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.NEW;
                break;
            default:
                typeVehicle = null;
                break;
        }
        TypeCar typeCar;
        switch (optionTypeCar) {
            case 1:
                typeCar =  TypeCar.SEDAN;
                break;
            case 2:
                typeCar =  TypeCar.PICKUP_TRUCK;
                break;
            default:
                typeCar = null;
                break;
        }
        TypeCharger typeCharger;
        switch (optionTypeCharger) {
            case 1:
            typeCharger =  TypeCharger.NORMAL;
                break;
            case 2:
            typeCharger =  TypeCharger.FAST;
                break;
            default:
                typeCharger = null;
                break;
        }
        ElectricCar electricCar = new ElectricCar(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar, batteryDuration, typeCharger);
        vehicles.add(electricCar); 
        return vehicles.indexOf(electricCar);
    }
    /**This is the method for adding an hybrid car  */
    public int addVehicle(double basePrice, String brand, String model, double cylinderCapacity, double mileage, int optionTypeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, int optionTypeCar, double capacityOfTheTank, double batteryDuration, int optionTypeCharger, int optionTypeGasoline){
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.NEW;
                break;
            default:
                typeVehicle = null;
                break;
        }
        TypeCar typeCar;
        switch (optionTypeCar) {
            case 1:
                typeCar =  TypeCar.SEDAN;
                break;
            case 2:
                typeCar =  TypeCar.PICKUP_TRUCK;
                break;
            default:
                typeCar = null;
                break;
        }
        TypeCharger typeCharger;
        switch (optionTypeCharger) {
            case 1:
                typeCharger =  TypeCharger.NORMAL;
                break;
            case 2:
                typeCharger =  TypeCharger.FAST;
                break;
            default:
                typeCharger = null;
                break;
        }
        TypeGasoline typeGasoline;
        switch (optionTypeGasoline) {
            case 1:
                typeGasoline =  TypeGasoline.EXTRA;
                break;
            case 2:
                typeGasoline =  TypeGasoline.REGULAR;
                break;
            case 3:
                typeGasoline =  TypeGasoline.DIESEL;
                break;
            default:
                typeGasoline = null;
                break;
        }
        HybridCar hybridCar = new HybridCar(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar, capacityOfTheTank, batteryDuration, typeCharger, typeGasoline);
        vehicles.add(hybridCar);
        return vehicles.indexOf(hybridCar);
    }
    /**This is the method for adding a gas car  */
    public int addVehicle(double basePrice, String brand, String model, double cylinderCapacity, double mileage,int optionTypeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, int optionTypeCar, double capacityOfTheTank, int optionTypeGasoline) {
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.NEW;
                break;
            default:
                typeVehicle = null;
                break;
        }
        TypeCar typeCar;
        switch (optionTypeCar) {
            case 1:
                typeCar =  TypeCar.SEDAN;
                break;
            case 2:
                typeCar =  TypeCar.PICKUP_TRUCK;
                break;
            default:
                typeCar = null;
                break;
        }
        TypeGasoline typeGasoline;
        switch (optionTypeGasoline) {
            case 1:
                typeGasoline =  TypeGasoline.EXTRA;
                break;
            case 2:
                typeGasoline =  TypeGasoline.REGULAR;
                break;
            case 3:
                typeGasoline =  TypeGasoline.DIESEL;
                break;
            default:
                typeGasoline = null;
                break;
        }
        GasolineCar gasolineCar = new GasolineCar(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, numberOfDoors, polarizedWindows, typeCar, capacityOfTheTank, typeGasoline);
        vehicles.add(gasolineCar);
        return vehicles.indexOf(gasolineCar);
    }
    /**This is the method for adding a motorcycle  */
    public int addVehicle(double basePrice, String brand, String model, double cylinderCapacity, double mileage, int optionTypeVehicle, String licensePlate, double capacityOfTheTank, int optionTypeMotorcycle) {
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.NEW;
                break;
            default:
                typeVehicle = null;
                break;
        }
        TypeMotorcycle typeMotorcycle;
        switch (optionTypeMotorcycle) {
            case 1:
                typeMotorcycle =  TypeMotorcycle.STANDARD;
                break;
            case 2:
                typeMotorcycle =  TypeMotorcycle.SPORT;
                break;
            case 3:
                typeMotorcycle =  TypeMotorcycle.SCOOTER;
                    break;
            case 4:
                typeMotorcycle =  TypeMotorcycle.CROOSS;
                    break;
            default:
                typeMotorcycle = null;
                break;
        }
        Motorcycle motorcycle = new Motorcycle(basePrice, brand, model, cylinderCapacity, mileage, typeVehicle, licensePlate, capacityOfTheTank, typeMotorcycle);
        vehicles.add(motorcycle);
        return vehicles.indexOf(motorcycle);        
    }
    public double getSalePriceOfVehicle(int index) {
        return vehicles.get(index).getSalePrice();
    }
    public void addDocumentToVehicle(int index, double price, double coverageAmmount, int year) {
        SOAT soat = new SOAT(price, year, coverageAmmount);
        vehicles.get(index).addDocument(soat);
    }

    public void addDocumentToVehicle(int index, double price, int year, double gasLevel) {
        MechanicalTechnicalRevision mechanicalTechnicalRevision = new MechanicalTechnicalRevision(price, year, gasLevel);
        vehicles.get(index).addDocument(mechanicalTechnicalRevision);
    }
    public void addDocumentToVehicle(int index, double price, int year) {
        PropertyCard propertyCard = new PropertyCard(price, year);
        vehicles.get(index).addDocument(propertyCard);
    }

    public boolean generateFinalPrice() {
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("The final price of the vehicle: " + i + " is : " + vehicles.get(i).calculateSalePrice());
        }
        return true;
    }
    public String showInformationVehicles() {
        String out = "";
        for (int i = 0; i < vehicles.size(); i++) {
            out += "\nInformation vehicle: " + (i+1) + "\n";
            out+= vehicles.get(i).toString();
        }
        return out;
    }

    public String showInformatioByTypeOfVehicle(int i ) {
        String out = "";
        switch (i) {
            //Case of the electric car
            case 1:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(i) instanceof ElectricCar) {
                        out += vehicles.toString();
                    }
                }
                break;
            //Case of the hybrid car
            case 2:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(i) instanceof HybridCar) {
                        out += vehicles.toString();
                    }
                }
                break;
            //Case of the gasoline car
            case 3:  
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(i) instanceof GasolineCar) {
                        out += vehicles.toString();
                    }
                }
                break;

            //Case of the Motorcycle
            case 4:  
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(i) instanceof Motorcycle) {
                        out += vehicles.toString();
                    }
                }
                break;
        }
        return out;
    }

    public String showInformationTypeOfFuel(int i) {
        String out = "";
        for (int j = 0; j < vehicles.size(); j++) {
            if (vehicles.get(i) instanceof GasolineCar || vehicles.get(i) instanceof HybridCar) {
                switch (i) {
                    //Case of the Gasoline car

                    //Case extra
                    case 1:
                        if (((GasolineCar) vehicles.get(i)).getTypeGasoline() == TypeGasoline.EXTRA ||((HybridCar) vehicles.get(i)).getTypeGasoline() == TypeGasoline.EXTRA) {
                           out += vehicles.get(i).toString(); 
                        }
                        break;
                    //Case regular
                    case 2:
                    if (((GasolineCar) vehicles.get(i)).getTypeGasoline() == TypeGasoline.REGULAR ||((HybridCar) vehicles.get(i)).getTypeGasoline() == TypeGasoline.REGULAR) {
                        out += vehicles.get(i).toString(); 
                    }
                    break;
                        
                    //Case Diesel
                    case 3:
                    if (((GasolineCar) vehicles.get(i)).getTypeGasoline() == TypeGasoline.DIESEL ||((HybridCar) vehicles.get(i)).getTypeGasoline() == TypeGasoline.DIESEL) {
                        out += vehicles.get(i).toString(); 
                    }
                    break;
                }
            }
        }
        
        return out;

    }

    public String showInformationUsedOrNew(int i) {
        String out = "";
        switch (i) {
            //New car
            case 1:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(i).getTypeVehicle()== TypeVehicle.NEW) {
                        out += vehicles.get(i).toString();
                    }
                }
                break;
            //Used car
            case 2:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(i).getTypeVehicle()== TypeVehicle.USED) {
                        out += vehicles.get(i).toString();
                    }
                }
                break;
        }
        return out;
    }
}
