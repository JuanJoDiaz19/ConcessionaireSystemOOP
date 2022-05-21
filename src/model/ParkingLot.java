package model;

public class ParkingLot {
    /**Constant of the number of rows of the ParkingLot */
    private static final int ROW = 10;
    /**Constant of the number of columns of the ParkingLot */
    private static final int COLUMN = 5;
    /**Matrix of vehicles that saves the vehicles of the parking */
    private Vehicle[][] parking;
    /**
     * Constructor method of the class Parking lot 
     */
    public ParkingLot() {
        parking = new Vehicle[ROW][COLUMN];
    }
    /**
     * Method that adds a vehicle to the matrix of vehicles
     * @param vehicle != null
     * @return String with the state of the process
     */
    public String addVehicleToParkingLot(Vehicle vehicle) {
        String out = "";
        if (vehicle.getTypeVehicle() == TypeVehicle.USED) {
            if (vehicle.getModel() == 2014) {
                int index = firstNullInColumn(0);
                if (index != 10) {
                    parking[index][0] = vehicle;
                } else {
                    out+= "The parking lot is full, you can't add the vehicle";
                }
            } else if (vehicle.getModel() == 2013) {
                int index = firstNullInColumn(1);
                if (index != 10) {
                    parking[index][1] = vehicle;
                }else {
                    out+= "The parking lot is full, you can't add the vehicle";
                }
            } else if (vehicle.getModel() == 2012) {
                int index = firstNullInColumn(2);
                if (index != 10) {
                    parking[index][2] = vehicle;
                }else {
                    out+= "The parking lot is full, you can't add the vehicle";
                }
            }else if (vehicle.getModel() == 2011) {
                int index = firstNullInColumn(3);
                if (index != 10) {
                    parking[index][3] = vehicle;
                }else {
                    out+= "The parking lot is full, you can't add the vehicle";
                }
            }else if (vehicle.getModel() < 2011) {
                int index = firstNullInColumn(4);
                if (index != 10) {
                    parking[index][4] = vehicle;
                }else {
                    out+= "The parking lot is full, you can't add the vehicle";
                }
            }
        }

        return out;
    }
    /**
     * Method that returns the index of the first cell null in a given collumn
     * @param indexRow != null
     * @return int with the index of the fist null cell in the given collumn
     */
    public int firstNullInColumn(int indexRow) {
        int index = 10;
        for (int i = 0; i < parking.length && index == 10; i++) {
            if (parking[i][indexRow] == null) {
                index = i;
            }
        }
        return index;
    }
    /**
     * Method that returns a String with the drawing of the content of the parking lot 
     * @return String  with the drawing of the content of the parking lot
     */
    public String showParkingLot() {
        String out = "  ";
        int year = 2014;
        int counter = 0;
        for (int i = 0; i < 5; i++) {
           if (i!=4) {
                out+= "|     "+(year + counter)+"      |";
                counter--;
           } else {
               out+= "|     2011 >    |";
           }
            
        }
        out += "\n  ";
        for (int i = 0; i < parking[0].length; i++) {
            for (int j = 0; j < 17; j++) {
              out+= "_";  
            }
        }
        out += "\n  ";
        for (int i = 0; i < parking.length; i++) {
            for (int k = 1; k <= 5; k++) {
                for (int j = 0; j < parking[0].length; j++) {
                    if (parking[i][j] == null) {
                        switch (k) {
                            case 5:
                                out+= "|_______________|";
                                break;
                            default:
                                out+= "|               |";
                                break;
                        }
                    } else if (parking[i][j] instanceof Car) {
                        switch (k) {
                            case 1:
                                out += "|   ______      |";
                                break;
                            case 2:
                                out += "|  /|_||_\\`.__  |";
                                break;
                            case 3:
                                out += "| (   _    _ _\\ |";
                                break;
                            case 4:
                                out += "| =`-(_)--(_)-' |";
                                break;
                            case 5:
                                out += "|_______________|";    
                        }
                    } else if (parking[i][j] instanceof Motorcycle) {
                        switch (k) {
                            case 1:
                                out+= "|               |";
                                break;
                            case 2:
                                out += "|    D/_        |";
                                break;
                            case 3:
                                out += "|    /(_`._,-.  |";
                                break;
                            case 4:
                                out += "|  (o) `--'(o)  |";
                                break;
                            case 5:
                                out+= "|_______________|";
                        }
                    }
                } 
                out += "\n  ";
            }
            
        }
        return out;
    }
    /**
     * Method that shows the information of the vehicles given a certain year
     * @param year != null
     * @return String with the methods toString of the vehicles given a certain year
     */
    public String showParkingLotByYear(int year) {
        String out = "";
        if (year <= 5 ) {
            switch (year) {
                case 1:
                    for (int i = 0; i < firstNullInColumn(0); i++) {
                        out += parking[i][0].toString() + "\n";
                    }
                    break;
                case 2:
                    for (int i = 0; i < firstNullInColumn(1); i++) {
                        out += parking[i][1].toString() + "\n";
                    }
                    break;
                case 3:
                    for (int i = 0; i < firstNullInColumn(2); i++) {
                        out += parking[i][2].toString() + "\n";
                    }
                    break;
                case 4:
                    for (int i = 0; i < firstNullInColumn(3); i++) {
                        out += parking[i][3].toString() + "\n";
                    }
                    break;
            
                case 5:
                    for (int i = 0; i < firstNullInColumn(4); i++) {
                        out += parking[i][4].toString() + "\n";
                    }
                    break;
            }
        } else {
            out += "\nEnter one of the posible options please :(";
        }
        return out;
    }
    /**
     * Method that shows the information of the newest vehicle in the parking lot 
     * @return String with the method to String of the newest vehicle of the parking lot
     */
    public String showInformationNewestVehicle() {
        String out = "";
        int yearOldestYear = 0;
        boolean flag = true;
        for (int j = 0; j <parking[0].length   && flag; j++) {
            for (int i = 0; i < parking.length -1 && flag; i++) {
                if (parking[i][j] != null) {
                    if (yearOldestYear == 0) {
                        yearOldestYear = parking[i][j].getModel();
                    }
                    if (parking[i][j].getModel() > yearOldestYear) {
                        yearOldestYear = parking[i][j].getModel();
                    }
                }
            }
        }
       for (int i = 0; i < parking.length; i++) {
           for (int j = 0; j < parking[0].length; j++) {
                if (parking[i][j] != null) {
                    if (parking[i][j].getModel() == yearOldestYear) {
                        out += parking[i][j].toString();
                    }
                }
           }
        }
        return out;
    }
    /**
     * Method that shows the information of the oldest vehicle in the parking lot 
     * @return String with the method to String of the oldest vehicle of the parking lot
     */
    public String showInformationOldestVehicle() {
        String out = "";
        int yearNewestYear = 0;
        boolean flag = true;
        for (int j = 0; j <parking[0].length   && flag; j++) {
            for (int i = 0; i < parking.length -1 && flag; i++) {
                if (parking[i][j] != null) {
                    if (yearNewestYear == 0) {
                        yearNewestYear = parking[i][j].getModel();
                    }
                    if (parking[i][j].getModel() < yearNewestYear) {
                        yearNewestYear = parking[i][j].getModel();
                    }
                }
            }
        }
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[0].length; j++) {
                    if (parking[i][j] != null) {
                        if (parking[i][j].getModel() == yearNewestYear) {
                            out += parking[i][j].toString();
                        }
                    }
            }
        }    
        return out;
    }
    /**
     * Method that returns the ocupation percentage of the parking lot 
     * @return double with the ocupation percentage of the parking lot
     */
    public double getOcupationPercentageParkingLot() {
        double counter = 0;
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[0].length; j++) {
                if (parking[i][j] != null) {
                    counter++;
                }
            }
        }
        return (counter/(ROW*COLUMN))*100;
    }
    /**
     * Method that gives the state of a certain vehicle in the parking lot 
     * @param vehicle != null
     * @return String with state of a certain vehicle in the parking lot
     */
    public String isVehicleInParkingLot(Vehicle vehicle) {
        String out = "The parking lot is full for this collum";
        if (vehicle.getModel() <= 2014 && vehicle.getTypeVehicle() == TypeVehicle.USED) {
            for (int i = 0; i < parking.length; i++) {
                for (int j = 0; j < parking[0].length; j++) {
                    if (parking[i][j] != null) {
                        if (parking[i][j].equals(vehicle)) {
                            out = "The vehicle was registered in the parking lot";
                        }
                    }
                }
            }
        } else {
            out = "This vehicle couldn't be added to the parking lot";
        }
        return out;
    }

}
