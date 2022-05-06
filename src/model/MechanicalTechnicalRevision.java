package model;

public class MechanicalTechnicalRevision extends Document {

    private double gasLevel;


    public MechanicalTechnicalRevision(double price, int year, double gasLevel) {
        super(price, year);
        this.gasLevel = gasLevel;
    }

    //HACER LA CLASE QUE FALTA DE DOCUMENTTTTTT

    @Override
    public int getCode() {
        return 0;
    }
}
