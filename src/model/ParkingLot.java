package model;

public class ParkingLot {
    private static final int ROW = 10;
    private static final int COLUMN = 5;
    private Vehicle[][] parking;

    public void addVehicleToParkingLot(Vehicle vehicle) {
        if (vehicle.getTypeVehicle() == TypeVehicle.USED) {
            if (vehicle.getModel() == 2014) {
                int index = firstNullInColumn(0);
                if (index != 10) {
                    parking[index][0] = vehicle;
                }
            } else if (vehicle.getModel() == 2013) {
                int index = firstNullInColumn(1);
                if (index != 10) {
                    parking[index][1] = vehicle;
                }
            } else if (vehicle.getModel() == 2012) {
                int index = firstNullInColumn(2);
                if (index != 10) {
                    parking[index][2] = vehicle;
                }
            }else if (vehicle.getModel() == 2011) {
                int index = firstNullInColumn(3);
                if (index != 10) {
                    parking[index][3] = vehicle;
                }
            }else if (vehicle.getModel() < 2011) {
                int index = firstNullInColumn(4);
                if (index != 10) {
                    parking[index][4] = vehicle;
                }
            }
        }
    }
    public ParkingLot() {
        parking = new Vehicle[ROW][COLUMN];
    }

    public int firstNullInColumn(int indexRow) {
        int index = 10;
        for (int i = 0; i < parking.length && index == 10; i++) {
            if (parking[i][indexRow] == null) {
                index = i;
            }
        }
        return index;
    }

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
            out += "\nEnter one of the posible options pease :(";
        }
        return out;
    }

    public String showInformationNewestVehicle() {
        String out = "";
        boolean flag = true;
        for (int j = 0; j < parking[0].length && flag; j++) {
            for (int i = parking.length-1; i >=0 && flag; i--) {
                if (parking[i][j] != null) {
                    out = parking[i][j].toString();
                    flag = false;
                }
            }
        }
        return out;
    }
    
    public String showInformationOldestVehicle() {
        String out = "";
        boolean flag = true;
        for (int j = parking[0].length -1 ; j >=0 && flag; j--) {
            for (int i = parking.length -1; i >= 0 && flag; i--) {
                if (parking[i][j] != null) {
                    out += parking[i][j].toString();
                    flag = false;
                }
            }
        }
        return out;
    }

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

}
