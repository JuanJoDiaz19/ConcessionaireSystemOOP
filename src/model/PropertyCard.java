package model;

public class PropertyCard extends Document{

    public PropertyCard(double price, int year) {
        super(price, year);
    }
    @Override
    public int getCode() {
        return 0;
    }

}
