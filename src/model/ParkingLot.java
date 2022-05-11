package model;

public class ParkingLot {
    private static final int ROW = 10;
    private static final int COLUMN = 5;
    private Vehicle[][] parking;

    public void addVehicleToParkingLot(Vehicle vehicle) {
        if (vehicle.getModel() == 2014) {
            int index = firstNullInColumn(0);
            if (index != -1) {
                parking[index][0] = vehicle;
            }
        } else if (vehicle.getModel() == 2013) {
            int index = firstNullInColumn(1);
            if (index != -1) {
                parking[index][1] = vehicle;
            }
        } else if (vehicle.getModel() == 2012) {
            int index = firstNullInColumn(2);
            if (index != -1) {
                parking[index][2] = vehicle;
            }
        }else if (vehicle.getModel() == 2011) {
            int index = firstNullInColumn(3);
            if (index != -1) {
                parking[index][3] = vehicle;
            }
        }else if (vehicle.getModel() < 2011) {
            int index = firstNullInColumn(4);
            if (index != -1) {
                parking[index][4] = vehicle;
            }
        }
    }
    public ParkingLot() {
        parking = new Vehicle[ROW][COLUMN];
    }

    public int firstNullInColumn(int indexRow) {
        int index = -1;
        for (int i = 0; i < parking.length && index == -1; i++) {
            if (parking[i][indexRow] == null) {
                index = i;
            }
        }
        return index;
    }

    public String showParkingLot() {
        String out = "";
        for (int i = 0; i < parking[0].length; i++) {
            for (int j = 0; j < 17; j++) {
              out+= "_";  
            }
        }
        out += "\n";
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
                out += "\n";
            }
            
        }
       /*  for (int l = 0; l < parking.length; l++) {
            for (int l2 = 0; l2 < parking[0].length; l2++) {
                if (parking[l][l2] instanceof Car) {
                    out += " C";
                } else if (parking[l][l2] instanceof Motorcycle) {
                    out+= " M";
                } else {
                    out+= " 0";
                }
            }
            out += "\n";
        } */
        return out;
    }

}
