package ui;

import java.util.ArrayList;

import model.*;

public class InitModel {
    public ArrayList<Vehicle> createVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        //First vehicle 
        Vehicle vehicle0 = new ElectricCar(100000, "Audi", 2014, 1.5, 200000, TypeVehicle.NEW, "JOY 132", 4, true, TypeCar.SEDAN, 25, TypeCharger.NORMAL);
        MechanicalTechnicalRevision mechanicalTechnicalRevision0 = new MechanicalTechnicalRevision(2000, 2022, 2);
        vehicle0.addDocument(mechanicalTechnicalRevision0);
        vehicles.add(vehicle0);

        //Second vehicle
        Vehicle vehicle1 = new GasolineCar(100000, "Mercedes", 2013, 8.9, 2000, TypeVehicle.USED, "HMP 222", 5, false, TypeCar.PICKUP_TRUCK, 50, TypeGasoline.EXTRA);
        SOAT soat1 = new SOAT(5000, 2022, 1000);
        MechanicalTechnicalRevision mechanicalTechnicalRevision1 = new MechanicalTechnicalRevision(2000, 2016, 2);
        PropertyCard propertyCard1 = new PropertyCard(5000, 2013);
        vehicle1.addDocument(soat1);
        vehicle1.addDocument(mechanicalTechnicalRevision1);
        vehicle1.addDocument(propertyCard1);
        vehicles.add(vehicle1);

        //Third vehicle
        Vehicle vehicle2 = new Motorcycle(1000, "Yamaha", 2010,1.5 , 1000, TypeVehicle.USED, "ANA L56", 20, TypeMotorcycle.SCOOTER);
        MechanicalTechnicalRevision mechanicalTechnicalRevision2 = new MechanicalTechnicalRevision(2000, 2022, 2);
        vehicle2.addDocument(mechanicalTechnicalRevision2);
        vehicles.add(vehicle2);

        //Fourth vehicle
        Vehicle vehicle3 = new HybridCar(1000, "Renault", 2014, 1.0, 45000, TypeVehicle.USED, "CUM 123", 5, false, TypeCar.SEDAN, 20.0, 10.0, TypeCharger.FAST, TypeGasoline.REGULAR);
        SOAT soat3 = new SOAT(5000, 2022, 1000);
        MechanicalTechnicalRevision mechanicalTechnicalRevision3 = new MechanicalTechnicalRevision(2000, 2022, 2);
        PropertyCard propertyCard3 = new PropertyCard(5000, 2013);
        vehicle3.addDocument(soat3);
        vehicle3.addDocument(mechanicalTechnicalRevision3);
        vehicle3.addDocument(propertyCard3);
        vehicles.add(vehicle3);

        //Fourt
        return vehicles;
    }
}
