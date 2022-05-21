package model;

public class MechanicalTechnicalRevision extends Document {
    /**Gas level of the Mechanical technical revision */
    private double gasLevel;

    /**
     * Constructor method the class Mechanical technical revision
     * @param price != null
     * @param year != null
     * @param gasLevel != null
     */
    public MechanicalTechnicalRevision(double price, int year, double gasLevel) {
        super(price, year);
        this.gasLevel = gasLevel;
    }
    /**
     * Method that shows the matrix of the image of the class
     */
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
    /**
     * Method toString of the Mechanical Technical Revision
     * @return String with all the information of the class
     */
    @Override
    public String toString() {
        String out = "";
        out += "\n***** Mechanical Tecnical Revision *****";
        out += super.toString() + "\nGas level: "+ gasLevel;
        return out;

    }
    /**
     * Override method that gets the code of the image 
     * @return String with all the information of the class
     */
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
