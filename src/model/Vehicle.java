package model;

public abstract class Vehicle {
    /**Base price of the vehicle */
    private double basePrice;
    /**Sale price of the vehicle */
    private double salePrice;
    /**Brand of the vehicle */
    private String brand;
    /**Year of the vehicle */
    private int model;
    /**Cylinder capacity of the vehicle */
    private double cylinderCapacity;
    /**Mileage of the vehicle */
    private double mileage;
    /**Licnse plate of the vehicle */
    private String licensePlate;
    /**Type of the vehicle (NEW/USED) */
    private TypeVehicle typeVehicle;
    /**Array of documents of the vehicle */
    private Document[] documents;

    /**
     * Constructor of the class vehicle
     * @param basePrice != null
     * @param brand != null
     * @param model != null
     * @param cylinderCapacity != null
     * @param mileage != null
     * @param typeVehicle != null
     * @param licensePlate != null
     */
    public Vehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate) {
        documents = new Document[3];
        this.basePrice = basePrice;
        //this.salePrice = calculateSalePrice();
        this.brand = brand;
        this.model = model;
        this.cylinderCapacity = cylinderCapacity;
        this.mileage = mileage;
        this.licensePlate = licensePlate;
        this.typeVehicle = typeVehicle;
    }
    /**
     * Abstract method that calculates de sale price of the vehicle
     * @return double sale price of the vehicle
     */
    public abstract double calculateSalePrice(); 

    /**
     * Method to add a document of type soat to the vehicle
     * @param document != null
     * @return boolean, true if it was made correctly, false in the other case
     */
    public boolean addDocument(SOAT document) {
        documents[0]= document;
        salePrice = calculateSalePrice();
        return true;
    }
    /**
     * Method to add a document of type MechanicalTechnicalRevision to the vehicle
     * @param document != null
     * @return boolean, true if it was made correctly, false in the other case
     */
    public boolean addDocument(MechanicalTechnicalRevision document) {
        documents[1]= document;
        salePrice = calculateSalePrice();
        return true;
    }
    /**With property card*/
    /**
     * Method to add a document of type PropertyCard to the vehicle
     * @param document != null
     * @return boolean, true if it was made correctly, false in the other case
     */
    public boolean addDocument(PropertyCard document) {
        documents[2]= document;
        salePrice = calculateSalePrice();
        return true;
    }
    /**
     * Method toString to show all the information of the class in a String 
     * @return String, with the information of the whole vehicle
     */
    @Override
    public String toString() {
        String out = "";
        out += "Base price: " + basePrice + "\nSale price: " + salePrice + "\nBrand: " + brand + "\nModel: " + model + 
        "\nCylinder capacity: " + cylinderCapacity + "\nMileage: " + mileage;
        if (licensePlate!= null) {
            out +="\nLicense plate: " + licensePlate;
        }
        if (typeVehicle == TypeVehicle.NEW) {
            out+= "\nType of the vehicle: New";
        } else if (typeVehicle == TypeVehicle.USED) {
            out += "\nType of the vehicle: Used";
        }
        return out;
    }
    /**
     * Method to get the sale price
     * @return double the sale price
     */
    protected double getSalePrice() {
        return salePrice;
    }
    /**
     * Method ot get the base price
     * @return double the base price 
     */
    protected double getBasePrice() {
        return basePrice;
    }
    /**
     * Method to get the TypeVehicle of the vehicle
     * @return TypeVehicle the TypeVehicle of the vehicle
     */
    protected TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }
    /**
     * Method to get the cylinder capacity of the vehicle 
     * @return double cylinderCapacity of the vehicle 
     */
    protected double getCylinderCapacity() {
        return cylinderCapacity;
    }
    /**
     * Method to get the SOAT of the vehicle
     * @return Document of type SOAT of the vehicle 
     */
    protected Document getSOAT() {
        return documents[0];
    }
    /**
     * Method to get the MechanicalTechnicalRevision of the vehicle
     * @return Document of type SOAT of the vehicle 
     */
    protected Document getTechnicalMechanicalRevision() {
        return documents[1];
    }
    /**
     * Method to get the PropertyCard of the vehicle
     * @return Document of type PropertyCard of the vehicle 
     */
    protected Document getPropertyCard() {
        return documents[2];
    }
    /**
     * Method to get the model (year) of the vehicle
     * @return int model (year) of the vehicle
     */
    protected int getModel() {
        return model;
    }
}
