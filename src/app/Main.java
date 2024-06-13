package app;

public class Main {

    private static final double MILES_TO_KILOMETERS = 1.60934;

    public static double convertMilesToKilometers(double miles) {
        return miles * MILES_TO_KILOMETERS;
    }

    public static void main(String[] args){
    System.out.println("Distance unit converter");

        double miles = 5;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%.2f miles is equal to %.2f kilometers%n", miles, kilometers);
    }
}

