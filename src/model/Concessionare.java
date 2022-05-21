package model;
import java.util.ArrayList;

public class Concessionare {
    /**Arraylist of vehicles that stores all the vehicle of the concessionare */
    private ArrayList<Vehicle> vehicles;
    /**Object of ParkingLot in the class */
    private ParkingLot parkingLot;

    /**Constructor method of the class Concessionare with out the preestablished vehicles */
    public Concessionare() {
        vehicles = new ArrayList<Vehicle>();
        parkingLot = new ParkingLot();
    }
    /**
     * Constructor method of the class Concessionare that receives the preestablished cases of the vehicles 
     * @param vehicles != null
     */
    public Concessionare(ArrayList<Vehicle> vehicles){
        this.vehicles = vehicles;
        parkingLot = new ParkingLot();
        for (int i = 0; i < vehicles.size(); i++) {
            parkingLot.addVehicleToParkingLot(vehicles.get(i));
        }
    }

    /**
     * Method to add an electric car in the arraylist of vehicles
     * @param basePrice != null
     * @param brand != null
     * @param model != null
     * @param cylinderCapacity != null
     * @param mileage != null
     * @param optionTypeVehicle != null
     * @param licensePlate != null
     * @param numberOfDoors != null
     * @param polarizedWindows != null
     * @param optionTypeCar != null
     * @param optionTypeCharger != null
     * @param batteryDuration != null
     * @return int of the index in the arraylist of the vehicle that was created
     */
    public int addVehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, int optionTypeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, int optionTypeCar, int optionTypeCharger, double batteryDuration) {
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.USED;
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
        parkingLot.addVehicleToParkingLot(electricCar); 
        return vehicles.indexOf(electricCar);
    }
    /**This is the method for adding an hybrid car  */
    /**
     * Method to add an hybrid car to the arraylist of vehicles
     * @param basePrice != null
     * @param brand != null
     * @param model != null
     * @param cylinderCapacity != null
     * @param mileage != null
     * @param optionTypeVehicle != null
     * @param licensePlate != null
     * @param numberOfDoors != null
     * @param polarizedWindows != null
     * @param optionTypeCar != null
     * @param capacityOfTheTank != null
     * @param batteryDuration != null
     * @param optionTypeCharger != null
     * @param optionTypeGasoline != null
     * @return int of the index in the arraylist of the vehicle that was created
     */
    public int addVehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, int optionTypeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, int optionTypeCar, double capacityOfTheTank, double batteryDuration, int optionTypeCharger, int optionTypeGasoline){
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.USED;
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
        parkingLot.addVehicleToParkingLot(hybridCar);
        return vehicles.indexOf(hybridCar);
    }
    /**This is the method for adding a gas car  */
    /**
     * Method to add a gas car in the arraylist of vehicles
     * @param basePrice != null
     * @param brand != null
     * @param model != null
     * @param cylinderCapacity != null
     * @param mileage != null
     * @param optionTypeVehicle != null
     * @param licensePlate != null
     * @param numberOfDoors != null
     * @param polarizedWindows != null
     * @param optionTypeCar != null
     * @param capacityOfTheTank != null
     * @param optionTypeGasoline != null
     * @return int of the index in the arraylist of the vehicle that was created
     */
    public int addVehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage,int optionTypeVehicle, String licensePlate, int numberOfDoors, boolean polarizedWindows, int optionTypeCar, double capacityOfTheTank, int optionTypeGasoline) {
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.USED;
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
        parkingLot.addVehicleToParkingLot(gasolineCar);
        return vehicles.indexOf(gasolineCar);
    }
    /**
     * Method to add a motorcycle to the array list of vehicles
     * @param basePrice != null
     * @param brand != null
     * @param model != null
     * @param cylinderCapacity != null
     * @param mileage != null
     * @param optionTypeVehicle != null
     * @param licensePlate != null
     * @param capacityOfTheTank != null
     * @param optionTypeMotorcycle != null
     * @return int of the index in the arraylist of the vehicle that was created
     */
    public int addVehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, int optionTypeVehicle, String licensePlate, double capacityOfTheTank, int optionTypeMotorcycle) {
        TypeVehicle typeVehicle;
        switch (optionTypeVehicle) {
            case 1:
                typeVehicle =  TypeVehicle.NEW;
                break;
            case 2:
                typeVehicle =  TypeVehicle.USED;
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
        parkingLot.addVehicleToParkingLot(motorcycle);
        return vehicles.indexOf(motorcycle);        
    }
     /**
      * Method that adds a document of type soat to a vehicle
      * @param index != null
      * @param price != null
      * @param coverageAmmount != null
      * @param year != null
      */
    public void addDocumentToVehicle(int index, double price, double coverageAmmount, int year) {
        SOAT soat = new SOAT(price, year, coverageAmmount);
        vehicles.get(index).addDocument(soat);    
    }
    /**
     * Method that adds a document of type mechanical technical revision to a vehicle
     * @param index != null
     * @param price != null
     * @param year != null
     * @param gasLevel != null
     */
    public void addDocumentToVehicle(int index, double price, int year, double gasLevel) {
        MechanicalTechnicalRevision mechanicalTechnicalRevision = new MechanicalTechnicalRevision(price, year, gasLevel);
        vehicles.get(index).addDocument(mechanicalTechnicalRevision);
    }
    /**
     * Method that adds a document of type property card to a vehicle
     * @param index != null
     * @param price != null
     * @param year != null
     */
    public void addDocumentToVehicle(int index, double price, int year) {
        PropertyCard propertyCard = new PropertyCard(price, year);
        vehicles.get(index).addDocument(propertyCard);
    }
    /**
     * Method that returns a string with the information of the sale price of a vehicle
     * @param index != null, index of the vehicle to search 
     * @return String with the status of the sale price
     */
    public String getSalePriceOfVehicle(int index) {
        String out = "";
        if (index < vehicles.size()) {
            out += "The sale price of the vehicle is: " + vehicles.get(index).getSalePrice();
        } else {
           out +="\nSorry the id of the vehicle you are searching for isn't found :("; 
        }
        return out;
    } 
    /**
     * Method that returns an String with the information of vehicles with a certain instance
     * @param i int, option of the type of vehicle to search
     * @return String with all the information of the vehicles in order to the type entered
     */
    public String showInformationByTypeOfVehicle(int i ) {
        String out = "";
        switch (i) {
            //Case of the electric car
            case 1:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(j) instanceof ElectricCar) {
                        out += "\nVehicle Id: " + j + " \n" + vehicles.get(j).toString() +"\n" ;
                        ;
                    }
                }
                break;
            //Case of the hybrid car
            case 2:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(j) instanceof HybridCar) {
                        out += "\nVehicle Id: " + j + " \n" +vehicles.get(j).toString();
                    }
                }
                break;
            //Case of the gasoline car
            case 3:  
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(j) instanceof GasolineCar) {
                        out += "\nVehicle Id: " + j + " \n" + vehicles.get(j).toString();
                    }
                }
                break;

            //Case of the Motorcycle
            case 4:  
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(j) instanceof Motorcycle) {
                        out += "\nVehicle Id: " + j + " \n" +vehicles.get(j).toString();
                    }
                }
                break;
        }

        if (out.equals("\n")) {
            out = "\nSorry there aren't vehicles with these characteristics :(";
        }
        return out;
    }
    /**
     * Method that shows the information of the vehicles in order to their fuel type 
     * @param i != null, option of the type of fuel to search
     * @return String with all the information of the vehicles in order to the type of fuel entered
     */
    public String showInformationTypeOfFuel(int i) {
        String out = "\n";
        for (int j = 0; j < vehicles.size(); j++) {
            if (vehicles.get(j) instanceof GasolineCar) {
                switch (i) {
                    //Case of the Gasoline car

                    //Case extra
                    case 1:
                        if (((GasolineCar) vehicles.get(j)).getTypeGasoline() == TypeGasoline.EXTRA) {
                           
                            out += "Vehicle Id:  "+ j + " \n"+ vehicles.get(j).toString() + "\n"; 
                        } 
                        break;
                    //Case regular
                    case 2:
                    if (((GasolineCar) vehicles.get(j)).getTypeGasoline() == TypeGasoline.REGULAR ) {
                        out += "Vehicle Id:  "+ j + " \n"+ vehicles.get(j).toString() + "\n"; 
                    }
                    break;
                        
                    //Case Diesel
                    case 3:
                    if (((GasolineCar) vehicles.get(j)).getTypeGasoline() == TypeGasoline.DIESEL) {
                        out += "Vehicle Id:  "+ j + " \n"+  vehicles.get(j).toString() + "\n"; 
                    }
                    break;
                }
            } else if (vehicles.get(j) instanceof HybridCar) {
                switch (i) {
                    //Case of the Gasoline car

                    //Case extra
                    case 1:
                        if (((HybridCar) vehicles.get(j)).getTypeGasoline() == TypeGasoline.EXTRA) {
                           
                            out += "Vehicle Id:  "+ j + " \n"+ vehicles.get(j).toString() + "\n"; 
                        } 
                        break;
                    //Case regular
                    case 2:
                        if (((HybridCar) vehicles.get(j)).getTypeGasoline() == TypeGasoline.REGULAR ) {
                            out += "Vehicle Id:  "+ j + " \n"+ vehicles.get(j).toString() + "\n"; 
                        }
                    break;
                        
                    //Case Diesel
                    case 3:
                        if (((HybridCar) vehicles.get(j)).getTypeGasoline() == TypeGasoline.DIESEL) {
                            out += "Vehicle Id:  "+ j + " \n"+  vehicles.get(j).toString() + "\n"; 
                        }
                    break;
                }
            }
        }
        if (out.equals("\n")) {
            out = "\nSorry there aren't vehicles with these characteristics :(";
        }
        return out;

    }
    /**
     * Method that shows the information of the vehicles in order if they are new or used
     * @param i != null, option of the type of the type of vehicle to search
     * @return String with all the information of the vehicles in order to the type car entered
     */
    public String showInformationUsedOrNew(int i) {
        String out = "\n";
        switch (i) {
            //New car
            case 1:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(j).getTypeVehicle()== TypeVehicle.NEW) {
                        out += "Vehicle Id:  "+ j + " \n"+  vehicles.get(j).toString() + "\n";
                    }
                }
                break;
            //Used car
            case 2:
                for (int j = 0; j < vehicles.size(); j++) {
                    if (vehicles.get(j).getTypeVehicle()== TypeVehicle.USED) {
                        out += "Vehicle Id:  "+ j + " \n"+ vehicles.get(j).toString() + "\n";
                    }
                }
                break;
        }
        if (out.equals("\n")) {
            out = "\nSorry there aren't vehicles with these characteristics :(";
        }
        return out;
    }
    /**
     * Method that shows the information of all documents in a vehicle
     * @param index != null
     * @return String with the information of the ducuments in the method
     */
    public String showDocumentsFromVehicle(int index) {
        String out = "";
        if (index <= vehicles.size()) {
            //vehicles.get(index).getSOAT().showMatrix();
            if (vehicles.get(index).getSOAT() != null) {
                out += vehicles.get(index).getSOAT().toString() + "\n"; 
            } else {
                out += "\nThe vehicle doesn't have soat :( \n";
            }
            //vehicles.get(index).getTechnicalMechanicalRevision().showMatrix();
            if (vehicles.get(index).getTechnicalMechanicalRevision() != null) {
                out+= vehicles.get(index).getTechnicalMechanicalRevision().toString() + "\n";
            }else {
                out += "\nThe vehicle doesn't have a technical mechanical revision :( \n";
            }
            //vehicles.get(index).getPropertyCard().showMatrix();
            if (vehicles.get(index).getPropertyCard() != null) {
                out += vehicles.get(index).getPropertyCard().toString() + "\n";
            } else {
                out += "\nThe vehicle doesn't have property card :( \n";
            }
        } else {
            out+= "The vehicle you are trying to search isn't found";
        }
        return out;
    }
    /**
     * Method that executes the method isVehicleInParkingLot() of the parkinglot 
     * @param index of the vehicle to add to the parking lot,  != null
     * @return String The state of the vehicle in the parking lot
     */
    public String VehicleInParkingLot(int index) {
        return parkingLot.isVehicleInParkingLot(vehicles.get(index));
    }
    /**
     * Method that executes the method showParkingLotByYear() of the Parkinglot
     * @param year year of search, != null
     * @return String with all the information of the vehicles of that year in the parking lot 
     */
    public String showVehiclesInParkingLotByYear(int year) {
        return parkingLot.showParkingLotByYear(year);
    }
    /**
     * Method that executes the method shoeInformationNewestVehicle() of the parking lot
     * @return String with all the information of the newest vehicle in the parking lot 
     */
    public String showDataNewestVehicle() {
        return parkingLot.showInformationNewestVehicle();
    }
    /**
     * Method that executes the method showInformationOldestVehicle of the parking lot 
     * @return String with all the information of the oldest vehicle in the parking lot  
     */
    public String showDataOldestVehicle() {
        return parkingLot.showInformationOldestVehicle();
    }
    /**
     * Method that executes the method showParkingLot() of the ParkingLot
     * @return String with the drawing of the parking lot
     */
    public String showParkingLot() {
        return parkingLot.showParkingLot();
    }
    /**
     * Method that executes the mehtod getOcupationPercentageParkingLot() of the parking lot
     * @return String with the ocupation percentage of the parking lot
     */
    public String showOcupationPercentageParkingLot() {
        return parkingLot.getOcupationPercentageParkingLot() + "%";
    }
}
