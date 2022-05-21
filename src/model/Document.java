package model;
import java.util.Random;

public abstract class Document {
    /**Constant of the number of cells of the matrix */
    public static final int SIZE_MATRIX = 5;
    /**Price of the document */
    private double price;
    /**Year of the document */
    private int year;
    /**Matrix of integers that has the image of the document */
    private int[][] image;
    /**
     * Constructor method of the Document class
     * @param price != null
     * @param year != null
     */
    public Document(double price, int year) {
        image = new int[SIZE_MATRIX][SIZE_MATRIX];
        this.price = price;
        this.year = year;
        generateConentDocument();
    }
    /**
     * Method that shows the image of the document
     */
    public void showMatrix() {
        String out = "";
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                out += image[i][j] + " ";
            }
            out += "\n";
        }
        System.out.println(out);
    }
    /**
     * Method that generates the content of the matrix
     */
    public void generateConentDocument() {
        Random r = new Random();
        for (int i = 0; i < SIZE_MATRIX; i++) {
            for (int j = 0; j < SIZE_MATRIX; j++) {
                image[i][j] = r.nextInt(100);
            }
        }
    }
    /**
     * Method that gets the year of the document
     * @return
     */
    protected int getYear() {
        return year;
    }
    /**
     * Method toString of the document class
     * @return String with all the information of the class
     */
    @Override
    public String toString() {
        return "\nPrice: " + price + "\nYear: " + year + "\nCode: " + getCode();
    }
    /**
     * Method that gets the image of the class
     * @return int[][] with the image of the class
     */
    public int[][] getImage() {
        return image;
    }
    /**
     * Abstract method that gets the code of the image
     * @return String with the code of the class
     */
    public abstract String getCode();
    
}
