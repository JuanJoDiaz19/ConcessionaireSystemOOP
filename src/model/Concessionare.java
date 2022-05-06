package model;
import java.util.ArrayList;

public class Concessionare {
    private ArrayList<Vehicle> vehicles;
    private ParkingLot parkingLot;

    public Concessionare() {
        vehicles = new ArrayList<Vehicle>();
        parkingLot = new ParkingLot();
    }

    // Method for adding a electric car
    public int addVehicle(double basePrice, String brand, String model, double cylinderCapacity, double mileage, int optionTypeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, int optionTypeCar, double batteryDuration, int optionTypeCharger, double batteryConsumption) {
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
    // Method for adding a hybrid car
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
    // Method for adding a gasoline car
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
    // Method for adding a motorcycle 
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
    public void addDocumentToVehicle(int index, double price, double coverageAmmount, int year) {
        int soat = 0;
        vehicles.get(index).addDocument(price, year, coverageAmmount, soat);
    }

    public void addDocumentToVehicle(int index, double price, int year, double gasLevel) {
        vehicles.get(index).addDocument(price, year, gasLevel);
    }
    public void addDocumentToVehicle(int index, double price, int year) {
        vehicles.get(index).addDocument(price, year);
    }
}
