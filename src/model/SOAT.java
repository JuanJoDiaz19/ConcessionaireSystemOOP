package model;

public class SOAT extends Document {
    private double coverageAmmount;

    public SOAT(double price, int year, double coverageAmmount) {
        super(price, year);
        this.coverageAmmount = coverageAmmount;
    }
    @Override
    public int getCode() {
        return 0;
    }

}
