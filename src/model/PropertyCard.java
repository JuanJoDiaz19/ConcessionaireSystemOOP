package model;

public class PropertyCard extends Document{

    public PropertyCard(double price, int year) {
        super(price, year);
    }

    @Override
    public String toString() {
        String out = "";
        out+= "\n***** Property Card *****";
        out += super.toString();
        return out;
    }

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
