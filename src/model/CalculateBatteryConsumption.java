package model;
//To generate javadoc: javadoc src/model/CalculateBatteryConsumption.java -d doc/API/

/** Interface that calculates the battery consumption
 * @author JuanJoseDiaz
 * 
 * */
public interface CalculateBatteryConsumption {
    /**
     * Abstract method that calculates the battery consumption of a vehicle
     * @return doule  with the battery consumption of the vehicle
     */
    public double calculateBatteryConsumption();
}
