package ui;
import java.util.Scanner;

import model.Concessionare;

public class Main {
    private Concessionare concessionare;
    private Scanner sc;


    public Main() {
        concessionare = new Concessionare();
        sc = new Scanner(System.in);
    }
    
    public static void main(String[] args) {
        Main mainObject = new Main();
        System.out.println("\n***** Welcome to the concessionare program *****");
        int option = 0;
        do {
            option = mainObject.showMenu();
            mainObject.excecuteOption(option);
        } while (option != 0);
    }

    public int showMenu() {
        System.out.println("\nSelect one of the options:\n" +
                            "\n1) Register vehicle" + 
                            "\n2) Calculate the total price of a vehicle" +
                            "\n3) Generate reports with all vehicle data (including total sale price)" +
                            "\n4) Show the status of the documents of a vehicle"+
                            "\n5) Generate a parking map" + 
                            "\n6) Generate parking lot occupancy reports" +
                            "\n0) Exit the program\n");
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    public void excecuteOption(int option){
        switch (option) {
            case 1:
                option1();
                break;
            case 2:
                option2();
                break;
            case 3: 
                option3();   
                break;
            case 4:    
                break;
            case 5:    
                break;
            case 6:    
                break;
            default:
                System.out.println("Good bye :) ..... \nThanks for using the program");
                break;
        }
    }

    public void option1() {
        System.out.println("Wich type of vehicle you want to register? 1) Electric car 2) Hybrid car 3) Gasoline car 4) Motorcycle");
        int option = sc.nextInt();
        System.out.println("\n***** Information of the vehicle *****\n");
        System.out.println("Enter the base price: ");
        double basePrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the brand of the vehicle: ");
        String brand = sc.nextLine();
        System.out.println("Enter the model of the vehicle: ");
        String model = sc.nextLine();
        System.out.println("Enter the cylinder capacity: ");
        double cylinderCapacity = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the mileage: ");
        double mileage = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the type of vehicle: 1) New 2) Used ");
        int optionTypeVehicle = sc.nextInt();
        sc.nextLine();
        String licensePlate = "";
        if (optionTypeVehicle == 2) {
            System.out.println("Enter the license plate of the vehicle: ");
            licensePlate = sc.nextLine();
        }
        if (option == 1 || option == 2 || option == 3 ) {
            System.out.println("\n***** Information of the car *****\n");
            System.out.println("Enter the number of doors of the car: ");
            int numberOfDoors = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the option of windows of the car: 1) Polarized 2) Not polarized");
            int optionPolarizedWindows = sc.nextInt();
            sc.nextLine();
            boolean polarizedWindows;
            if (optionPolarizedWindows == 1) {
                polarizedWindows = true;
            } else {
                polarizedWindows = false;
            }
            System.out.println("Enter the type of the car: 1) Sedan 2) Pickup truck");
            int optionTypeCar = sc.nextInt();
            sc.nextLine();
            if (option == 1 || option == 2) {
                System.out.println("Enter the duration of the batery (per km): ");
                double batteryDuration = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the type of the charger if the car: 1)Normal 2) Fast ");
                int optionTypeCharger = sc.nextInt();
                sc.nextLine();
                if (option == 1) {
                    int index = concessionare.addVehicle(basePrice, brand, model, cylinderCapacity, mileage, optionTypeVehicle, licensePlate, numberOfDoors, polarizedWindows, optionTypeCar, optionTypeCharger, batteryDuration);
                    if (optionTypeVehicle == 2) {
                        RegisterSoat(index);
                        RegisterTechicalMechanicalRevision(index);
                        RegisterPropertyCard(index);
                    } else if (optionTypeVehicle == 1) {
                        concessionare.addDocumentToVehicle(index, 0.0, 2022, 0.0);
                    }
                } else if (option == 2 ) {
                    System.out.println("Enter the capacity of the tank (galons): ");
                    double capacityOfTheTank = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the option of type of the gasoline: 1) Extra 2) Regular 3) Diesel");
                    int optionTypeGasoline = sc.nextInt();
                    int index  = concessionare.addVehicle(basePrice, brand, model, cylinderCapacity, mileage, optionTypeVehicle, licensePlate, numberOfDoors, polarizedWindows, optionTypeCar, capacityOfTheTank, batteryDuration, optionTypeCharger, optionTypeGasoline);
                    if (optionTypeVehicle == 2) {
                        RegisterSoat(index);
                        RegisterTechicalMechanicalRevision(index);
                        RegisterPropertyCard(index);
                    }else if (optionTypeVehicle == 1) {
                        concessionare.addDocumentToVehicle(index, 0.0, 2022, 0.0);
                    }
                } 
            } else if ( option == 3 ) {
                System.out.println("Enter the capacity of the tank (galons): ");
                double capacityOfTheTank = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the option of type of the gasoline: 1) Extra 2) Regular 3) Diesel");
                int optionTypeGasoline = sc.nextInt();
                sc.nextLine();
                int index = concessionare.addVehicle(basePrice, brand, model, cylinderCapacity, mileage, optionTypeVehicle, licensePlate, numberOfDoors, polarizedWindows, optionTypeCar, capacityOfTheTank, optionTypeGasoline);
                
                if (optionTypeVehicle == 2) {
                    RegisterSoat(index);
                    RegisterTechicalMechanicalRevision(index);
                    RegisterPropertyCard(index);
                } else if (optionTypeVehicle == 1) {
                    concessionare.addDocumentToVehicle(index, 0.0, 2022, 0.0);
                }
            } 

        } else if (option == 4) {
           System.out.println("\n***** Information of the motorcycle *****\n"); 
           System.out.println("Enter the capacity of the tank (galons)");
           double capacityOfTheTank = sc.nextDouble();
           sc.nextLine();
           System.out.println("Enter the type of motorcycle 1) Standard 2) Sport 3) Scooter 4) Cross");
           int optionTypeMotorcycle = sc.nextInt();
           int index = concessionare.addVehicle(basePrice, brand, model, cylinderCapacity, mileage, optionTypeVehicle, licensePlate, capacityOfTheTank, optionTypeMotorcycle);
            
            if (optionTypeVehicle == 2) {
                RegisterSoat(index);
                RegisterTechicalMechanicalRevision(index);
                RegisterPropertyCard(index);
            } else if (optionTypeVehicle == 1) {
                concessionare.addDocumentToVehicle(index, 0.0, 2022, 0.0);
            }
        }
    }

    public void option2() {
        System.out.println("Enter the id of the vehicle you want to calculate the sale price: ");
        int index =sc.nextInt();
        sc.nextLine();
        System.out.println("The sale price of the vehicle is: " + concessionare.getSalePriceOfVehicle(index));
         
    }

    public void RegisterSoat(int indexVehicle) {
        System.out.println("\n***** Information of the SOAT *****\n");
        System.out.println("Enter the price of the soat");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the year of the document");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the coverage ammount: ");
        double coverageAmmount = sc.nextDouble();
        sc.nextLine();
        concessionare.addDocumentToVehicle(indexVehicle, price, coverageAmmount, year);
    }
    public void RegisterTechicalMechanicalRevision(int indexOfVehicle) {
        System.out.println("\n***** Information of Mechanical Technical Revision *****\n");
        System.out.println("Enter the price of the mechanical technical revision");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the year of the document");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the gas level: ");
        double gasLevel = sc.nextDouble();
        sc.nextLine();
        concessionare.addDocumentToVehicle(indexOfVehicle, price, year, gasLevel);
    }

    public void RegisterPropertyCard(int indexOfVehicle) {
        System.out.println("\n***** Information of the Property Card *****\n");
        System.out.println("Enter the price of the Property Card");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the year of the document");
        int year = sc.nextInt();
        sc.nextLine();
        concessionare.addDocumentToVehicle(indexOfVehicle, price, year);
    }

    public void option3() {
        System.out.println("***** Information of the vehicles in the Concessionare *****");
        System.out.println("Enter the parameter you want to search:" +
                            "\n1) Vehicle Type" +
                            "\n2) Fuel Type" +
                            "\n3) New / Used Car");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                System.out.println("Wich type of vehicle? " + "\n1) Electric car " + "\n2) Hybrid car "+ "\n3) Gasoline car" + "\n4) Motorcylce");
                int i1 = sc.nextInt();
                sc.nextLine();
                System.out.println(concessionare.showInformatioByTypeOfVehicle(i1));
                break;
            case 2:
                System.out.println("Wich type of fuel?" + "\n1) Extra" + "\n Regular " + "\nDiesel");
                int i2= sc.nextInt();
                sc.nextLine();
                System.out.println(concessionare.showInformationTypeOfFuel(i2));
                break;
            case 3:  
                System.out.println("Wich type ?" + "\n1) New" + "\n2) Used");
                int i3 = sc.nextInt();
                System.out.println(concessionare.showInformationUsedOrNew(i3));  
                break;
        }
    }
}
