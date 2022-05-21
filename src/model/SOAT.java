package model;

public class SOAT extends Document {
    /**Coverage ammount of the soat */
    private double coverageAmmount;
    /**
     * Constructor method of the SOAT class
     * @param price != null
     * @param year != null
     * @param coverageAmmount != null
     */
    public SOAT(double price, int year, double coverageAmmount) {
        super(price, year);
        this.coverageAmmount = coverageAmmount;
    }
    /**
     * Method that gets the code of the image 
     * @return String with the code of the SOAT
     */
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
    /**
     * Method toString of the SOAT class
     * @return String with all the information of the class
     */
    @Override
    public String toString() {
        String out = "";
        out += "\n***** SOAT *****";
        out += super.toString() + "\nCoverage ammount: " + coverageAmmount;
        return out;
    }

}
