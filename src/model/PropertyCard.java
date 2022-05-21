package model;

public class PropertyCard extends Document{
    /**
     * Constructor method of the class PropertyCard 
     * @param price != null
     * @param year != null
     */
    public PropertyCard(double price, int year) {
        super(price, year);
    }
    /**
     * Method toString of the class PropertyCard
     * @return String with all the information of the class
     */
    @Override
    public String toString() {
        String out = "";
        out+= "\n***** Property Card *****";
        out += super.toString();
        return out;
    }
    /**
     * Override method that gets the code of the image
     * @return String with the code of the image
     */
    @Override
    public String getCode() {
        String out = "";
        for (int i = super.getImage().length -1; i >= 0 ; i--) {
            for (int j = super.getImage()[0].length -1; j >= 0; j--) {
                if ((i+j)%2 == 0) {
                    out += super.getImage()[i][j] + " ";    
                }
            }
        }
        return out;
    }

}
