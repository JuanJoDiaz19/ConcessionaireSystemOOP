package model;
import java.util.Random;

public abstract class Document {

    public static final int SIZE_MATRIX = 5;
    private double price;
    private int year;
    private int[][] image;

    public Document(double price, int year) {
        image = new int[SIZE_MATRIX][SIZE_MATRIX];
        this.price = price;
        this.year = year;
        generateConentDocument();
    }
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
    public void generateConentDocument() {
        Random r = new Random();
        for (int i = 0; i < SIZE_MATRIX; i++) {
            for (int j = 0; j < SIZE_MATRIX; j++) {
                image[i][j] = r.nextInt(100);
            }
        }
    }
    protected int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\nPrice: " + price + "\nYear: " + year + "\nCode: " + getCode();
    }

    public int[][] getImage() {
        return image;
    }
    public abstract String getCode();
    
}
