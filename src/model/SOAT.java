package model;

public class SOAT extends Document {
    private double coverageAmmount;

    public SOAT(double price, int year, double coverageAmmount) {
        super(price, year);
        this.coverageAmmount = coverageAmmount;
    }

    @Override
    public String getCode() {
        String out = "";
        for (int i = 0; i < super.getImage().length; i++) {
            out += super.getImage()[i][0] + " ";
        }
        for (int i = 1; i <  super.getImage()[0].length; i++) {
            out += super.getImage()[super.getImage().length-1][i] + " ";
        }
        return out;
    }
    @Override
    public String toString() {
        String out = "";
        out += "\n***** SOAT *****";
        out += super.toString() + "\nCoverage ammount: " + coverageAmmount;
        return out;
    }

}
