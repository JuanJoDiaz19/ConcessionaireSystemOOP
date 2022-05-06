package model;

import java.util.ArrayList;

public abstract class Vehicle {
    private double basePrice;
    private double salePrice;
    private String brand;
    private String model;
    private double cylinderCapacity;
    private double mileage;
    private String licensePlate;
    private TypeVehicle typeVehicle;
    private ArrayList<Document> documents;

    //Constructor when is a used car
    public Vehicle(double basePrice, String brand, String model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate) {
        documents = new ArrayList<Document>();
        this.basePrice = basePrice;
        this.salePrice = calculateSalePrice();
        this.brand = brand;
        this.model = model;
        this.cylinderCapacity = cylinderCapacity;
        this.mileage = mileage;
        this.licensePlate = licensePlate;
        this.typeVehicle = typeVehicle;
    }

    public abstract double calculateSalePrice(); 

    public boolean addDocument(double price, int year, double coverageAmmount, int soat) {
        documents.add(new SOAT(price, year, coverageAmmount));
        return true;

    }
    public boolean addDocument(double price, int year, double gasLevel) {
        documents.add(new MechanicalTechnicalRevision(price, year, gasLevel));
        return true;
    }
    public boolean addDocument(double price, int year){
        documents.add(new PropertyCard(price, year));
        return true;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Base price: " + basePrice + "\nSale price: " + salePrice + "\nBrand: " + brand + "\nModel: " + model + 
        "\nCylinder capacity: " + cylinderCapacity + "\nMileage: " + mileage + "\nLicense plate" + licensePlate;
        if (typeVehicle == TypeVehicle.NEW) {
            out+= "\nType of the vehicle: New";
        } else if (typeVehicle == TypeVehicle.USED) {
            out += "\nType of the vehicle: Used";
        }
        return out;
    }
}
