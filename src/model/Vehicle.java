package model;

public abstract class Vehicle {
    private double basePrice;
    private double salePrice;
    private String brand;
    private String model;
    private double cylinderCapacity;
    private double mileage;
    private String licensePlate;
    private TypeVehicle typeVehicle;
    private Document[] documents;

    //Constructor when is a used car
    public Vehicle(double basePrice, String brand, String model, double cylinderCapacity, double mileage,TypeVehicle typeVehicle, String licensePlate) {
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
    public abstract double calculateSalePrice(); 

    /**With soat */
    public boolean addDocument(SOAT document) {
        documents[0]= document;
        salePrice = calculateSalePrice();
        return true;
    }
    /**With Mechanical technical revision*/
    public boolean addDocument(MechanicalTechnicalRevision document) {
        documents[1]= document;
        salePrice = calculateSalePrice();
        return true;
    }
    /**With property card*/
    public boolean addDocument(PropertyCard document) {
        documents[2]= document;
        salePrice = calculateSalePrice();
        return true;
    }
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
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    protected double getSalePrice() {
        return salePrice;
    }
    protected double getBasePrice() {
        return basePrice;
    }
    protected TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }
    protected double getCylinderCapacity() {
        return cylinderCapacity;
    }
    protected Document getSOAT() {
        return documents[0];
    }
    protected Document getTechnicalMechanicalRevision() {
        return documents[1];
    }
    protected Document getPropertyCard() {
        return documents[2];
    }
}
