package model;
//To generate javadoc: javadoc src/model/CalculateGasolineConsumption.java -d doc/API/

/** Interface that calcultes the battery consumption of a vehicle
 * @author JuanJoseDiaz
 * */
public interface CalculateGasolineConsumption {
    /**
     * Method that calculates the gasoline consumption of a vehicle
     * @return double gasoline consumption of a vehicle
     */
    public double calculateGasolineConsumption();
}
