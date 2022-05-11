package model;

public class MechanicalTechnicalRevision extends Document {

    private double gasLevel;


    public MechanicalTechnicalRevision(double price, int year, double gasLevel) {
        super(price, year);
        this.gasLevel = gasLevel;
    }
    public void showMatrix() {
        String out = "";
        for (int i = 0; i < super.getImage().length; i++) {
            for (int j = 0; j < super.getImage()[0].length; j++) {
                out += super.getImage()[i][j] + " ";
            }
            out += "\n";
        }
        System.out.println(out);
    }
    @Override
    public String toString() {
        String out = "";
        out += "\n***** Mechanical Tecnical Revision *****";
        out += super.toString() + "\nGas level: "+ gasLevel;
        return out;

    }
    @Override
    public String getCode() {
        String out = "";
        for (int i = 0; i < super.getImage()[0].length -1; i++) {
            out += super.getImage()[0][i] +" ";
        }
        int counter = 0;
        for (int i = super.getImage().length -1; i >= 0; i--) {
            out += super.getImage()[counter][i] +" ";
            counter++;     
        }
        for (int i = 1; i < super.getImage()[0].length; i++) {
            out += super.getImage()[super.getImage().length -1][i] +" ";
        }
        return out;
    }
}
